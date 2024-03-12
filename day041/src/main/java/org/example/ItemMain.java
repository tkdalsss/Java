package org.example;

import org.example.app.dao.ItemDao;
import org.example.app.data.ItemDto;
import org.example.app.service.ItemService;

public class ItemMain {
    public static void main(String[] args) {
        ItemService itemService = new ItemService(new ItemDao());

        itemService.add(ItemDto.builder().id(4L).name("item004").price(40000L).build());
        itemService.add(ItemDto.builder().id(5L).name("item005").price(50000L).build());
        System.out.println(itemService.get());
        System.out.println(itemService.get(4L));

    }
}
