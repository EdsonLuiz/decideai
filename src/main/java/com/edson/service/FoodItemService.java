package com.edson.service;

import com.edson.repository.FoodItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodItemService {
    private final FoodItemRepository repository;
}
