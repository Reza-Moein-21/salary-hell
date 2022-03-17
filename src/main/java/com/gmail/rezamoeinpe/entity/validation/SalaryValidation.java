package com.gmail.rezamoeinpe.entity.validation;

import com.gmail.rezamoeinpe.entity.SalaryEntity;
import com.gmail.rezamoeinpe.exceptions.RequiredFieldException;

import java.util.HashSet;
import java.util.Objects;

public class SalaryValidation implements EntityValidation<SalaryEntity> {

    @Override
    public void validate(SalaryEntity salary) throws NullPointerException, RequiredFieldException {
        Objects.requireNonNull(salary);

        var requiredFields = new HashSet<String>();
        if (salary.getCompany() == null)
            requiredFields.add("company");

        if (salary.getPrice() == null)
            requiredFields.add("price");

        if (salary.getMonth() == null)
            requiredFields.add("month");

        if (!requiredFields.isEmpty())
            throw RequiredFieldException.ofRequiredFields(requiredFields);

    }
}
