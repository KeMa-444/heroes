package com.intuit.commerce.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * @author derri on 7/12/2023
 */
@Data
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
