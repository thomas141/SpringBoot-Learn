package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer{

    private int count;

    @PostConstruct
    public void initialize(){
        count = 5;
    }

    @Override
    public void print(String message){
        count--;
        System.out.println("HP Printer: " + message);
        System.out.println("Left count: " + count);
    }
}
