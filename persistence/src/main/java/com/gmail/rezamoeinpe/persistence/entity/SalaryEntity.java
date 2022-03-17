package com.gmail.rezamoeinpe.persistence.entity;

import com.gmail.rezamoeinpe.persistence.enums.JalaliMonth;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalaryEntity {

    private CompanyEntity company;

    private BigDecimal price;

    private JalaliMonth month;
}
