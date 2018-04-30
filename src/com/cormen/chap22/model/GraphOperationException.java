package com.cormen.chap22.model;

public class GraphOperationException extends RuntimeException
{
    public GraphOperationException()
    {
        super();
    }

    public GraphOperationException(String message)
    {
        super(message);
    }
}
