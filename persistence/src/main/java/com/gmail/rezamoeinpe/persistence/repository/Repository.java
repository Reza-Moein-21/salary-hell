package com.gmail.rezamoeinpe.persistence.repository;

public interface Repository<E, I> {
    E save(E entity);
}
