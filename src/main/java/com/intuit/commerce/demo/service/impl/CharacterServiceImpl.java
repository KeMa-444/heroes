package com.intuit.commerce.demo.service.impl;

import com.intuit.commerce.demo.exception.ResourceNotFoundException;
import com.intuit.commerce.demo.model.GetAllResponse;
import com.intuit.commerce.demo.model.dto.CharacterItemDto;
import com.intuit.commerce.demo.model.dto.CharacterViewDto;
import com.intuit.commerce.demo.mapper.CharacterMapper;
import com.intuit.commerce.demo.model.entity.Character;
import com.intuit.commerce.demo.repository.CharacterRepository;
import com.intuit.commerce.demo.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private static final String CHARACTER_NOT_FOUND_FORMAT = "Character with id: %d not found";

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    @Override
    @Transactional(readOnly = true)
    public GetAllResponse getAll(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
               : Sort.by(sortBy).descending();
        //create pageable instance

        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
        Page<Character> pageCharacters = characterRepository.findAll(pageRequest);

        List<CharacterItemDto> characterItemDtos = pageCharacters.stream()
                .map(characterMapper::entityToItemDto)
                .collect(Collectors.toList());

        GetAllResponse getAllResponse = new GetAllResponse();
        getAllResponse.setContent(characterItemDtos);
        getAllResponse.setPageNo(pageCharacters.getNumber());
        getAllResponse.setPageSize(pageCharacters.getSize());
        getAllResponse.setTotalElements(pageCharacters.getTotalElements());
        getAllResponse.setTotalPages(pageCharacters.getTotalPages());
        getAllResponse.setLast(pageCharacters.isLast());
        return getAllResponse;
    }

    @Override
    @Transactional(readOnly = true)
    public CharacterViewDto getOne(Long characterId) {
        return characterRepository.findById(characterId)
                .map(characterMapper::entityToViewDto)
                .orElseThrow(() -> new ResourceNotFoundException("Character", "id", characterId));
    }
}
