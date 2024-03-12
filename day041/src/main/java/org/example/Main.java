package org.example;

import org.example.app.data.CustDto;
import org.example.app.frame.Service;
import org.example.app.service.CustService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service<String, CustDto> service;
        service = new CustService();

        // Insert
        service.add(CustDto.builder().id("id01").pwd("pwd01").name("james").build());

        List<CustDto> list = null;
        list = service.get();

        for (CustDto cust : list) {
            System.out.println(cust);
        }
    }
}