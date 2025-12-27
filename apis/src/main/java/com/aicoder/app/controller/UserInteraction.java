package com.aicoder.app.controller;

import com.aicoder.app.model.request.Prompt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInteraction {

    @PostMapping(value = "/prompt")
    public void getPrompt(@RequestBody Prompt prompt){

    }
}
