package com.example.demo.items;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemService {

    private final ItemRepository itemRepository;

    public Item createItem(Item item) {
        log.info("Creating a new Item...");
        Item savedItem = itemRepository.save(item);
        log.info("Item created with id {}", item.getId());
        return savedItem;
    }

    public Item findItem(Long id) {
        return itemRepository.findById(id).orElseThrow();
    }
}
