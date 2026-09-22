package com.example;

public class SMSMessageService implements MessageService 
{
    @Override
    public String getMessage() 
    {
        return "Hello from SMS Service!";
    }
}