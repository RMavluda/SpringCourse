package com.example.malis.IoCandDi.springIntroduction;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
