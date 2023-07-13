package com.intuit.commerce.demo.model.entity;

import com.intuit.commerce.demo.model.embedded.*;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_details")
public class CharacterDetails {
    @Id
    private Long id;
    @Embedded
    private CharacterStats stats;
    @Embedded
    private CharacterAppearance appearance;
    @Embedded
    private CharacterBiography biography;
    @Embedded
    private CharacterWork work;
    @Embedded
    private CharacterConnections connections;
}
