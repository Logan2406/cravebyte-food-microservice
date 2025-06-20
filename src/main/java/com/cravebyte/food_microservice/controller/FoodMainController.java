package com.cravebyte.food_microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodMainController {

    @GetMapping("/test")
    public String test()
    {
        return "This is from food microservice just for test";
    }
}
