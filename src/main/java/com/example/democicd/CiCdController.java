package com.example.democicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caodinh
 */

@RestController
@RequestMapping("/api/v1.0/demo")
public class CiCdController {

    @GetMapping
    public String getData() {
        return "This is get";
    }

    @PostMapping
    public String postData() {
        return "This is post";
    }
}
