package com.intuit.commerce.demo.service;

import com.intuit.commerce.demo.model.ImageSize;
import org.mapstruct.Named;

public interface ImageService {
    @Named("getSmallUrl")
    String getSmallUrl(String fileName);

    @Named("getLargeUrl")
    String getLargeUrl(String fileName);

    String getUrl(String fileName, ImageSize size);
}
