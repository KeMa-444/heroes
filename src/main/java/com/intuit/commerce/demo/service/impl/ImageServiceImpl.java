package com.intuit.commerce.demo.service.impl;

import com.intuit.commerce.demo.model.ImageSize;
import com.intuit.commerce.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    private static final String IMAGE_URL_FORMAT = "%s/%s/%s";

    @Value("${app.img.source}")
    private String imageSource;

    @Override
    public String getSmallUrl(String fileName) {
        return getUrl(fileName, ImageSize.SM);    }

    @Override
    public String getLargeUrl(String fileName) {
        return getUrl(fileName, ImageSize.LG);
    }

    @Override
    public String getUrl(String fileName, ImageSize size) {
        return String.format(IMAGE_URL_FORMAT, imageSource, size.getValue(), fileName);
    }
}
