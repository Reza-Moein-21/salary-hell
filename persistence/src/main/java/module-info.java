module com.gmail.rezamoeinpe.persistence {
    exports com.gmail.rezamoeinpe.persistence.entity;
    exports com.gmail.rezamoeinpe.persistence.enums;
    exports com.gmail.rezamoeinpe.persistence.exceptions;
    exports com.gmail.rezamoeinpe.persistence.validation;
    exports com.gmail.rezamoeinpe.persistence.jdbc;
    exports com.gmail.rezamoeinpe.persistence.jdbc.postgresql;
    exports com.gmail.rezamoeinpe.persistence.repository;
    exports com.gmail.rezamoeinpe.persistence.repository.impl;
    exports com.gmail.rezamoeinpe.persistence.utils;

    requires java.naming;
    requires org.postgresql.jdbc;
    requires static lombok;
    requires java.sql;
}