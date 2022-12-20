package com.devskiller.service;

import com.devskiller.dao.ItemRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<String> getTitlesWithAverageRatingLowerThan(Double rating) {

        return itemRepository.findItemsWithAverageRatingLowerThan(rating).stream().map(c -> c.getTitle()).collect(Collectors.toList());
    }

}
