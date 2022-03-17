package com.gmail.rezamoeinpe.persistence.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class RequiredFieldException extends RuntimeException {

    public static RequiredFieldException ofRequiredFields(Set<String> fieldNames) {
        RequiredFieldException exception = new RequiredFieldException();
        exception.setRequiredFieldNames(fieldNames);
        return exception;
    }

    private Set<String> requiredFieldNames;


}
