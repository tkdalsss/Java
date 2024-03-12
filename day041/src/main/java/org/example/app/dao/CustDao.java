package org.example.app.dao;

import org.example.app.data.CustDto;
import org.example.app.frame.Dao2;

import java.util.ArrayList;
import java.util.List;

public class CustDao implements Dao2<String, CustDto> {

    @Override
    public int insert(CustDto custDto) {
//        System.out.println("Oracle DB:Inserted ..." + custDto);
        System.out.println("Duplicated ID Exception ");
        return 0;
    }

    @Override
    public int delete(String s) {
        return 0;
    }

    @Override
    public int update(CustDto custDto) {
        return 0;
    }

    @Override
    public CustDto select(String s) {
        return CustDto.builder().id(s).pwd("pwd01").name("james").build();
    }

    @Override
    public List<CustDto> selectList() {
        List<CustDto> list = new ArrayList<>();
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("james").build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("james2").build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("james3").build());
        return list;
    }
}
