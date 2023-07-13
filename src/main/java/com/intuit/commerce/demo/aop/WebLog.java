package com.intuit.commerce.demo.aop;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author derri on 7/13/2023
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebLog {

    private String description;

    private Long startTime;

    private Integer spendTime;

    private String uri;

    private String url;

    private String method;

    private String ip;

    private Object parameter;

    private Object result;
}
