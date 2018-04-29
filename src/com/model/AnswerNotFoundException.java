package com.model;

public class AnswerNotFoundException extends RuntimeException
{
    public AnswerNotFoundException()
    {
        super();
    }

    public AnswerNotFoundException(String message)
    {
        super(message);
    }
}
