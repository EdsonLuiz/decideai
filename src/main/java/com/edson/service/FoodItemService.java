package com.edson.service;

import com.edson.model.FoodItem;
import com.edson.repository.FoodItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodItemService {
    private final FoodItemRepository repository;

    public FoodItem create(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    public List<FoodItem> get() {
        return repository.findAll();
    }
}
