package com.intuit.commerce.demo.repository;

import com.intuit.commerce.demo.model.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
