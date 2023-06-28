package dev.dyegofduarte.controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import dev.dyegofduarte.entity.Item;
import dev.dyegofduarte.service.ItemService;

@Path("/api/customer")
public class ItemController {

    @Inject
    ItemService itemService;

    @GET
    public List<Item> retrieveItem(){
        
        List<Item> itens = new ArrayList<>();
        try{
            itens = itemService.findAllItens();
        }catch (Exception e){
            e.printStackTrace();
        }
        return itens;
    }

    @POST
    @Transactional
    public void addItem(Item item){ 
        itemService.addItem(item); 

        System.out.println(item);
    }

/*
    @Path("id")
    @DELETE
    Public response deleItem(@PathParam("id") Long id)
        {
            itemService.stream(Item)
                .filter(Item -> Item.getId().equals(id))
                .findFirst()
                .ifPresent(Item -> items.remove(item));
            return Response.noContent().build();
                }
*/



}
