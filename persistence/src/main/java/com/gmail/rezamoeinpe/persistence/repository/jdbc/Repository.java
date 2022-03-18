package com.gmail.rezamoeinpe.persistence.repository.jdbc;

public interface Repository<E, I> {
    E save(E entity);
}
