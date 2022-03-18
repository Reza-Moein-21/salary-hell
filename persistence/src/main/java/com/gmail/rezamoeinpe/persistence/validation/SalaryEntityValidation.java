package com.gmail.rezamoeinpe.persistence.validation;

import com.gmail.rezamoeinpe.persistence.entity.SalaryEntity;
import com.gmail.rezamoeinpe.persistence.exceptions.RequiredFieldException;

import java.util.HashSet;
import java.util.Objects;

public class SalaryEntityValidation implements EntityValidation<SalaryEntity> {

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
