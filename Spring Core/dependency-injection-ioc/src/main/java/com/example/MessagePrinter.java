package com.example;

public class MessagePrinter 
{
    private MessageService service;

    // Setter Injection
    public void setService(MessageService service) 
    {
        this.service = service;
    }

    public void printMessage() 
    {
        System.out.println(service.getMessage());
    }
}