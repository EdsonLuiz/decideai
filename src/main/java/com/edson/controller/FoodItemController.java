package com.edson.controller;

import com.edson.service.FoodItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class FoodItemController {
    private final FoodItemService service;

    //TODO GET

    //TODO POST

    //TODO UPDATE

    //TODO DELETE
}
