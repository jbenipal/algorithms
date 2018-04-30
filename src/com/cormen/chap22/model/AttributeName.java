package com.cormen.chap22.model;

public enum AttributeName
{
    COLOR("color");

    AttributeName(String name)
    {
        name_ = name;
    }

    private String name_;
}
