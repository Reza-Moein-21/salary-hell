package com.gmail.rezemoeinpe.persistence.test.integration.repository.jdbc.util;

import com.gmail.rezamoeinpe.persistence.repository.jdbc.util.PostgresqlUtils;
import com.gmail.rezamoeinpe.persistence.utils.PropertyFileLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PostgresqlUtilsTest {

    private String username;
    private String databaseName;
    private Properties dbProperty;

    @BeforeEach
    void setUp() {
        URL resource = PostgresqlUtilsTest.class.getResource("/psql-config-test.properties");
        this.dbProperty = PropertyFileLoader.loadProperty(resource);
        this.username = dbProperty.getProperty("psql.database.username");
        this.databaseName = dbProperty.getProperty("psql.database.name");
    }

    @Test
    void shouldMatchWithPropertiesValue() {
        var dataSource = PostgresqlUtils.getDataSource(this.dbProperty);

        try (Connection connection = dataSource.getConnection()) {
            assertEquals(this.username, connection.getMetaData().getUserName());
            assertEquals(this.databaseName, connection.getCatalog());
        } catch (SQLException e) {
            fail("Should connect with postgresql database");
        }
    }

}
