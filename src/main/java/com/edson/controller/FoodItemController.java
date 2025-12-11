package com.edson.controller;

import com.edson.model.FoodItem;
import com.edson.service.FoodItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/food")
@RequiredArgsConstructor
public class FoodItemController {
    private final FoodItemService service;

    //TODO GET

    //TODO POST
    @PostMapping
    public ResponseEntity<FoodItem> create(@RequestBody FoodItem request) {
        var serviceResponse = service.create(request);
        return ResponseEntity.ok(serviceResponse);
    }
    //TODO UPDATE

    //TODO DELETE
}
