package com.cormen.chap2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.ArrayList;

import com.util.Pair;
import com.model.AnswerNotFoundException;

public class TwoSumProblemTest
{
    @Test
    public void testSumExists()
    {
        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(78);
        list.add(-8);
        list.add(32);
        list.add(454);
        list.add(2);
        list.add(233);
        list.add(628);

        TwoSumProblem twoSumProblem = new TwoSumProblem();
        Pair<Integer, Integer> output = twoSumProblem.twoSum(list, (Integer)48);
        assertTrue(output.first().equals(-8));
        assertTrue(output.second().equals(56));
    }

    @Test(expectedExceptions = AnswerNotFoundException.class)
    public void twoSumNotExists()
    {
        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(78);
        list.add(-8);
        list.add(32);
        list.add(454);
        list.add(2);
        list.add(233);
        list.add(628);

        TwoSumProblem twoSumProblem = new TwoSumProblem();
        twoSumProblem.twoSum(list, (Integer)6756);
    }
}