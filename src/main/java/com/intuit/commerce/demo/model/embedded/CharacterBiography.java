package com.intuit.commerce.demo.model.embedded;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class CharacterBiography {
    private String alterEgos;
    private String placeOfBirth;
    private String firstAppearance;
    private String aliases;
}
