package com.gmail.rezamoeinpe.persistence.repository.jdbc.util;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.util.Properties;

public class PostgresqlUtils {

    public static DataSource getDataSource(Properties postgresqlProperties) {

        var host = postgresqlProperties.getProperty("psql.host");
        var port = postgresqlProperties.getProperty("psql.port");
        var dbName = postgresqlProperties.getProperty("psql.database.name");
        var username = postgresqlProperties.getProperty("psql.database.username");
        var password = postgresqlProperties.getProperty("psql.database.password");

        var pgDataSource = new PGSimpleDataSource();
        pgDataSource.setServerNames(new String[]{host});
        pgDataSource.setPortNumbers(new int[]{Integer.parseInt(port)});
        pgDataSource.setDatabaseName(dbName);
        pgDataSource.setUser(username);
        pgDataSource.setPassword(password);

        return pgDataSource;
    }


}
