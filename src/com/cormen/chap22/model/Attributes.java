package com.cormen.chap22.model;

import java.util.HashMap;
import java.util.Map;

public class Attributes
{
    public static class AttributeUtil
    {
        public static final String COLOR = "color";
        public static final String PARENT = "parent";
        public static final String DISTANCE = "distance";

        public static final String WHITE = "white";
        public static final String GREY = "grey";
        public static final String BLACK = "black";
    }

    private Map<String, String> attributes_;

    public Attributes()
    {
        attributes_ = new HashMap<>();
    }

    public void reset(String name)
    {
        attributes_.remove(name);
    }

    public void resetAll()
    {
        attributes_.clear();
    }

    public void addAttribute(String name, String value)
    {
        attributes_.put(name, value);
    }

    public String getAttribute(String name)
    {
        return attributes_.get(name);
    }
}