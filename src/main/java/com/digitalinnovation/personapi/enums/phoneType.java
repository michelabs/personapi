package com.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum phoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Comercial");

    private final String description;
}
