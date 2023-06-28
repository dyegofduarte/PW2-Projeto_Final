package dev.dyegofduarte.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import dev.dyegofduarte.entity.Item;
import dev.dyegofduarte.repository.ItemRepository;

@ApplicationScoped
public class ItemService {

    @Inject
    ItemRepository itemRepository;

    public List<Item> findAllItens(){
        return itemRepository.findAll().list();        
    }
    
    public void addItem(Item item){
        itemRepository.persist(item);
    }
}
