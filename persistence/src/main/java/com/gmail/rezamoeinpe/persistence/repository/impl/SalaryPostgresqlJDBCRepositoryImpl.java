package com.gmail.rezamoeinpe.persistence.repository.impl;

import com.gmail.rezamoeinpe.persistence.entity.SalaryEntity;
import com.gmail.rezamoeinpe.persistence.jdbc.postgresql.PostgresqlJDBCHandler;
import com.gmail.rezamoeinpe.persistence.repository.SalaryRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SalaryPostgresqlJDBCRepositoryImpl implements SalaryRepository {

    private final PostgresqlJDBCHandler postgresqlJDBCHandler;

    @Override
    public SalaryEntity save(SalaryEntity entity) {
        SalaryEntity salaryEntity = new SalaryEntity();
        salaryEntity.setId(1L);
        return salaryEntity;
    }
}
