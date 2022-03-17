package com.gmail.rezamoeinpe.entity.validation;

import com.gmail.rezamoeinpe.exceptions.RequiredFieldException;

public interface EntityValidation<E> {
    void validate(E entity) throws RequiredFieldException;
}
