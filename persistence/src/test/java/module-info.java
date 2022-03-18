open module com.gmail.rezamoeinpe.persistence.test {
    requires com.gmail.rezamoeinpe.persistence;
    requires java.sql;
    requires java.naming;

    requires org.postgresql.jdbc;
    requires transitive org.junit.jupiter.engine;
    requires transitive org.junit.jupiter.api;
}