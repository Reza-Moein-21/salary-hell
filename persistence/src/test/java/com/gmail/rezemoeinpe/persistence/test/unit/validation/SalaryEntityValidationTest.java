package com.gmail.rezemoeinpe.persistence.test.unit.validation;


import com.gmail.rezamoeinpe.persistence.entity.CompanyEntity;
import com.gmail.rezamoeinpe.persistence.entity.SalaryEntity;
import com.gmail.rezamoeinpe.persistence.enums.JalaliMonth;
import com.gmail.rezamoeinpe.persistence.exceptions.RequiredFieldException;
import com.gmail.rezamoeinpe.persistence.validation.SalaryEntityValidation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryEntityValidationTest {

    private SalaryEntityValidation validation;

    @BeforeEach
    void setUp() {
        this.validation = new SalaryEntityValidation();
    }

    @Test
    public void callValidate_throwNullPointer_entityIsNull() {
        assertThrows(NullPointerException.class,
                () -> this.validation.validate(null),
                "Should throw null pointer exception");
    }

    @Test
    @DisplayName("After validation should throw RequiredFieldException")
    public void callValidate_throwException_requiredFieldsIsNull() {
        RequiredFieldException fieldException = assertThrows(
                RequiredFieldException.class,
                () -> this.validation.validate(getUnValidSalaryEntity()),
                "required field exception throws");

        assertTrue(fieldException.getRequiredFieldNames().contains("company"), "company must be included as required field");
        assertTrue(fieldException.getRequiredFieldNames().contains("price"), "price must be included as required field");
        assertTrue(fieldException.getRequiredFieldNames().contains("month"), "month must be included as required field");
    }

    @Test
    @DisplayName("Validation must be good when passing valid entity")
    public void callValidate_noExceptionShouldThrow() {
        assertDoesNotThrow(
                () -> this.validation.validate(getValidSalaryEntity()),
                "Validation must be good");
    }

    private SalaryEntity getUnValidSalaryEntity() {
        return new SalaryEntity();
    }

    private SalaryEntity getValidSalaryEntity() {
        var salary = new SalaryEntity();
        salary.setCompany(new CompanyEntity());
        salary.setMonth(JalaliMonth.FARVARDIN);
        salary.setPrice(BigDecimal.ZERO);
        return salary;
    }
}
