package com.intuit.commerce.demo.model.embedded;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class CharacterConnections {
    private String groupAffiliation;
    private String relatives;
}
