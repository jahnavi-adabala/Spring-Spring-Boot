package com.diaries.MyApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
     public void compile(){
         System.out.println("Compiling 404 error");
     }
}
