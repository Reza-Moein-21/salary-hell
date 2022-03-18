package com.gmail.rezamoeinpe.persistence.repository.jdbc.impl;

import com.gmail.rezamoeinpe.persistence.entity.SalaryEntity;
import com.gmail.rezamoeinpe.persistence.repository.jdbc.PostgresqlJDBCHandler;
import com.gmail.rezamoeinpe.persistence.repository.jdbc.SalaryRepository;
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
