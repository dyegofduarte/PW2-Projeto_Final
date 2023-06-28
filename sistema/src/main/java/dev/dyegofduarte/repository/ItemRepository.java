package dev.dyegofduarte.repository;

import jakarta.enterprise.context.ApplicationScoped;

import dev.dyegofduarte.entity.Item;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ItemRepository implements PanacheRepository<Item>{

}