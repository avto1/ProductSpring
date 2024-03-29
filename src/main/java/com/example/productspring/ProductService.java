package com.example.productspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

    public List<Product> getAllProducts(){

        return db.findAll();
    }
}