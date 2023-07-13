package com.intuit.commerce.demo.mapper;

import com.intuit.commerce.demo.model.dto.CharacterItemDto;
import com.intuit.commerce.demo.model.dto.CharacterViewDto;
import com.intuit.commerce.demo.model.entity.Character;
import com.intuit.commerce.demo.service.ImageService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = ImageService.class)
public interface CharacterMapper {
    @Mappings({
            @Mapping(target = "imageUrl", source = "imageName", qualifiedByName = "getSmallUrl"),
    })
    CharacterItemDto entityToItemDto(Character entity);
    @Mappings({
            @Mapping(target = "imageUrl", source = "imageName", qualifiedByName = "getLargeUrl"),
            @Mapping(target = "id", source = "id"),
            @Mapping(target = ".", source = "details"),
    })
    CharacterViewDto entityToViewDto(Character entity);
}
