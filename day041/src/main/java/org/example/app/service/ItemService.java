package org.example.app.service;

import lombok.RequiredArgsConstructor;
import org.example.app.dao.ItemDao;
import org.example.app.data.ItemDto;
import org.example.app.frame.Dao2;
import org.example.app.frame.Service;

import java.util.List;

public class ItemService implements Service<Long, ItemDto> {

    Dao2<Long, ItemDto> dao;

    public ItemService(Dao2<Long, ItemDto> dao) {
        this.dao = dao;
    }

    @Override
    public int add(ItemDto itemDto) {
        dao.insert(itemDto);
        return 0;
    }

    @Override
    public int del(Long aLong) {
        dao.delete(aLong);
        return 0;
    }

    @Override
    public int modify(ItemDto itemDto) {
        dao.update(itemDto);
        return 0;
    }

    @Override
    public ItemDto get(Long aLong) {
        return dao.select(aLong);
    }

    @Override
    public List<ItemDto> get() {
        return dao.selectList();
    }
}
