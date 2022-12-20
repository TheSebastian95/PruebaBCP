package com.devskiller.controller;

import com.devskiller.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {


    @Autowired
    ItemService itemService;

    @GetMapping(value = "/titles", produces = "application/json;charset=UTF-8")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getTitles(@RequestParam Double rating) {
        return itemService.getTitlesWithAverageRatingLowerThan(rating);
    }


}
