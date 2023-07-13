package com.intuit.commerce.demo.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character")
public class Character {
    @Id
    private Long id;
    private String name;
    private String realName;
    private String publisher;
    private String alignment;
    private String imageName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CharacterDetails details;
}
