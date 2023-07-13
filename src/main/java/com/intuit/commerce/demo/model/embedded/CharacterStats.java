package com.intuit.commerce.demo.model.embedded;

import lombok.Data;

import javax.persistence.Embeddable;
@Data
@Embeddable
public class CharacterStats {
    private Integer intelligence;
    private Integer strength;
    private Integer speed;
    private Integer durability;
    private Integer power;
    private Integer combat;
}
