package com.intuit.commerce.demo.model.embedded;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class CharacterAppearance {
    private String gender;
    private String race;
    private String eyeColor;
    private String hairColor;
    private String height;
    private String weight;
}
