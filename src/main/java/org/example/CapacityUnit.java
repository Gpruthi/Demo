package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CapacityUnit {

    KWH("Kwh");

    private String unit;

}