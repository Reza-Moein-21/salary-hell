package com.gmail.rezemoeinpe.persistence.test.integration.repository.jdbc;

import com.gmail.rezamoeinpe.persistence.entity.SalaryEntity;
import com.gmail.rezamoeinpe.persistence.repository.jdbc.PostgresqlJDBCHandler;
import com.gmail.rezamoeinpe.persistence.repository.jdbc.SalaryRepository;
import com.gmail.rezamoeinpe.persistence.repository.jdbc.impl.SalaryPostgresqlJDBCRepositoryImpl;
import com.gmail.rezamoeinpe.persistence.repository.jdbc.util.PostgresqlUtils;
import com.gmail.rezamoeinpe.persistence.utils.PropertyFileLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PostgresqlJDBCHandlerTest {

    private SalaryRepository repository;

    @BeforeEach
    void setUp() {
        var propertyResource = PostgresqlJDBCHandlerTest.class.getResource("/psql-config-test.properties");
        var postgresqlProperties = PropertyFileLoader.loadProperty(propertyResource);
        var dataSource = PostgresqlUtils.getDataSource(postgresqlProperties);
        var postgresqlJDBCHandler = new PostgresqlJDBCHandler(dataSource);
        this.repository = new SalaryPostgresqlJDBCRepositoryImpl(postgresqlJDBCHandler);
    }

    @Test
    void insertOneRow_shouldReturnPersistedEntity() {
        var persistedEntity = this.repository.save(new SalaryEntity());
        assertNotNull(persistedEntity, "Persisted Entity can not be null");
        assertNotNull(persistedEntity.getId(), "Persisted Entity should have id");
    }
}
