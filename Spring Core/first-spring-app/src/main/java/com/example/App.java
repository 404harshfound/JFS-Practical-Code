package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
class MyService 
{
    public void hello() 
    {
        System.out.println("Hello from Spring Context!");
    }
}

public class App 
{
    public static void main(String[] args) 
    {
        // Scan the package for @Service, @Component, @Repository
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.example");

        MyService service = ctx.getBean(MyService.class);
        service.hello();

        ctx.close();
    }
}
