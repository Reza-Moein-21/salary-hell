package com.gmail.rezamoeinpe.entity;

import com.gmail.rezamoeinpe.entity.enums.JalaliMonth;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalaryEntity {

    private CompanyEntity company;

    private BigDecimal price;

    private JalaliMonth month;
}
