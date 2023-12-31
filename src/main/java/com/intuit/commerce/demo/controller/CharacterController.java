package com.intuit.commerce.demo.controller;

import com.intuit.commerce.demo.model.GetAllResponse;
import com.intuit.commerce.demo.model.dto.CharacterViewDto;
import com.intuit.commerce.demo.service.CharacterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.intuit.commerce.demo.util.AppConstants;

@Api(value = "REST APIs for character resources")
@RequestMapping("/api/v1/characters")
@RestController
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @ApiOperation(value = "Get all characters REST API")
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<GetAllResponse> getAll(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIR, required = false) String sortDir
    ) {
        return new ResponseEntity<>(characterService.getAll(pageNo, pageSize, sortBy, sortDir), HttpStatus.OK);
    }

    @ApiOperation(value = "Get character details by characterId REST API")
    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterViewDto> getOne(@PathVariable Long characterId) {
        return new ResponseEntity<>(characterService.getOne(characterId), HttpStatus.OK);
    }
}
