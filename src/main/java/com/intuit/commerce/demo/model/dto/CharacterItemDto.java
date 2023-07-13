package com.intuit.commerce.demo.model.dto;

import lombok.Data;

@Data
public class CharacterItemDto {
    private Long id;
    private String name;
    private String realName;
    private String publisher;
    private String alignment;
    private String imageUrl;
}
