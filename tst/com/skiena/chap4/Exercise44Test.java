package com.skiena.chap4;

import com.util.Pair;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class Exercise44Test
{
    @Test
    public void test()
    {
        List<Pair<Integer, Exercise44.Color>> input = new ArrayList<>();
        input.add(new Pair<>(1, Exercise44.Color.BLUE));
        input.add(new Pair<>(3, Exercise44.Color.RED));
        input.add(new Pair<>(4, Exercise44.Color.BLUE));
        input.add(new Pair<>(6, Exercise44.Color.YELLOW));
        input.add(new Pair<>(9, Exercise44.Color.RED));

        Exercise44 exercise44 = new Exercise44();
        List<Pair<Integer, Exercise44.Color>> outputs = exercise44.sortNPairs(input);
        for(Pair<Integer, Exercise44.Color> output: outputs) {
            System.out.println(output);
        }
    }
}