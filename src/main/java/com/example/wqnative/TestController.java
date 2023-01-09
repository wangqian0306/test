package com.example.wqnative;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public HttpEntity<String> get(@RequestParam(required = false) String name) {
        return new HttpEntity<>(Objects.requireNonNullElse(name, "hello world"));
    }

}
