package com.gmail.rezamoeinpe.persistence.jdbc.postgresql;

import com.gmail.rezamoeinpe.persistence.jdbc.JDBCHandler;
import lombok.RequiredArgsConstructor;

import javax.sql.DataSource;

@RequiredArgsConstructor
public class PostgresqlJDBCHandler implements JDBCHandler {

    private final DataSource dataSource;

    @Override
    public void executeSql(String sql) {
    }
}
