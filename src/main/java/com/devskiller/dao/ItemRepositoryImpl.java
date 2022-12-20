package com.devskiller.dao;

import com.devskiller.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ItemRepositoryImpl implements ItemRepository {


    List<Item> items = new ArrayList<>();


    @Override
    public List<Item> findItemsWithAverageRatingLowerThan(Double rating) {

        return items.stream().filter(c -> c.getReviews().stream().anyMatch(review -> rating > review.getRating() )).collect(Collectors.toList());
    }

    @Override
    public <S extends Item> S save(S s) {
        items.add(s);
        return s;
    }

    @Override
    public <S extends Item> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Item> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Item> findAll() {
        return null;
    }

    @Override
    public Iterable<Item> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Item item) {

    }

    @Override
    public void deleteAll(Iterable<? extends Item> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
