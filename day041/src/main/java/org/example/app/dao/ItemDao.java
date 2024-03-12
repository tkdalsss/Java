package org.example.app.dao;

import org.example.app.data.ItemDto;
import org.example.app.frame.Dao2;

import java.util.ArrayList;
import java.util.List;

public class ItemDao implements Dao2<Long, ItemDto> {
    @Override
    public int insert(ItemDto itemDto) {
        System.out.println("Insert Item " + itemDto);
        return 0;
    }

    @Override
    public int delete(Long aLong) {
        System.out.println("Delete item id " + aLong);
        return 0;
    }

    @Override
    public int update(ItemDto itemDto) {
        System.out.println("Update Item " + itemDto);
        return 0;
    }

    @Override
    public ItemDto select(Long aLong) {
        return ItemDto.builder().id(1L).name("item001").price(10000L).build();
    }

    @Override
    public List<ItemDto> selectList() {
        List<ItemDto> itemList = new ArrayList<>();
        itemList.add(ItemDto.builder().id(2L).name("item002").price(20000L).build());
        itemList.add(ItemDto.builder().id(3L).name("item002").price(20000L).build());
        itemList.add(ItemDto.builder().id(4L).name("item002").price(20000L).build());
        return itemList;
    }
}
