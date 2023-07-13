package com.intuit.commerce.demo.service;

import com.intuit.commerce.demo.model.GetAllResponse;
import com.intuit.commerce.demo.model.dto.CharacterItemDto;
import com.intuit.commerce.demo.model.dto.CharacterViewDto;

import java.util.List;

public interface CharacterService {
    GetAllResponse getAll(int pageNo, int pageSize, String sortBy, String sortDir);
    CharacterViewDto getOne(Long characterId);
}
