package com.aicoder.app.model.request;

import lombok.Data;

@Data
public class Prompt {
    private String query;
    private String unitTests;
}
