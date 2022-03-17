package com.gmail.rezamoeinpe.persistence.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum JalaliMonth {
    FARVARDIN("فروردین"),
    ORDIBEHESHT("اردیبهشت"),
    XORDAD("خرداد"),
    TIR("تیر"),
    MORDAD("مرداد"),
    SHAHRIVAR("شهریور"),
    MEHR("مهر"),
    ABAN("آبان"),
    AZAR("آذر"),
    DEY("دی"),
    BAHMAN("بهمن"),
    ESFAND("اسفند");

    private final String title;

}
