package com.gmail.rezamoeinpe.persistence.validation;

import com.gmail.rezamoeinpe.persistence.exceptions.RequiredFieldException;

public interface EntityValidation<E> {
    void validate(E entity) throws RequiredFieldException;
}
