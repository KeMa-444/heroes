package com.intuit.commerce.demo.model.embedded;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class CharacterWork {
    private String occupation;
    private String base;
}
