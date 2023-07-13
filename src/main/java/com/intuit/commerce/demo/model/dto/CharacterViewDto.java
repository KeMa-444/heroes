package com.intuit.commerce.demo.model.dto;

import com.intuit.commerce.demo.model.embedded.*;
import lombok.Data;

@Data
public class CharacterViewDto {
    private Long id;
    private String name;
    private String realName;
    private String publisher;
    private String alignment;
    private String imageUrl;
    private CharacterStats stats;
    private CharacterAppearance appearance;
    private CharacterBiography biography;
    private CharacterWork work;
    private CharacterConnections connections;
}
