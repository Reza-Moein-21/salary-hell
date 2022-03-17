package com.gmail.rezamoeinpe.validation;

import com.gmail.rezamoeinpe.entity.CompanyEntity;
import com.gmail.rezamoeinpe.entity.SalaryEntity;
import com.gmail.rezamoeinpe.entity.enums.JalaliMonth;
import com.gmail.rezamoeinpe.entity.validation.SalaryValidation;
import com.gmail.rezamoeinpe.exceptions.RequiredFieldException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryValidationTest {

    private SalaryValidation validation;

    @BeforeEach
    void setUp() {
        this.validation = new SalaryValidation();
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
