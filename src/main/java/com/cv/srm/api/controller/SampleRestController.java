package com.cv.srm.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleRestController {

    @GetMapping
    public String getTestString() {
        return "RnR Tracker started";
    }
}
