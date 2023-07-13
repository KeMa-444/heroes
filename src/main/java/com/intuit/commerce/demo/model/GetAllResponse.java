package com.intuit.commerce.demo.model;

import com.intuit.commerce.demo.model.dto.CharacterItemDto;
import lombok.Data;

import java.util.List;

/**
 * @author derri on 7/12/2023
 */
@Data
public class GetAllResponse {
    private List<CharacterItemDto> content;

    private int pageNo;

    private int pageSize;

    private long totalElements;

    private int totalPages;

    private boolean last;

}
