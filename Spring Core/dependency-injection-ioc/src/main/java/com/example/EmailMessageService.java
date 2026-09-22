package com.example;

public class EmailMessageService implements MessageService 
{
    @Override
    public String getMessage() 
    {
        return "Hello from Email Service!";
    }
}