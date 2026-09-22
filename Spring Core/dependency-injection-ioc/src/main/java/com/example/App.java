package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessagePrinter printer = context.getBean("messagePrinter", 									     MessagePrinter.class);
        printer.printMessage();
        ((ClassPathXmlApplicationContext)context).close();
    }
}