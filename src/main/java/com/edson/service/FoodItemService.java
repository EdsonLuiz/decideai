package com.edson.service;

import com.edson.model.FoodItem;
import com.edson.repository.FoodItemRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<FoodItem> getById(Long id) {
        return repository.findById(id);
    }

    public void update(FoodItem foodItem) {
        this.getById(foodItem.getId())
                .orElseThrow(() -> new EntityNotFoundException("Food not found"));
        repository.save(foodItem);

    }
}
