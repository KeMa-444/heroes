package com.intuit.commerce.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImageSize {
    XS("xs"),
    SM("sm"),
    MD("md"),
    LG("lg");

    private String value;
}
