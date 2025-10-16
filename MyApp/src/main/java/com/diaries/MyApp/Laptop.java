package com.diaries.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compiling");
    }
}
