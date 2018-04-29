package com.cormen.chap2;

import com.model.AnswerNotFoundException;
import com.util.Pair;

import java.util.Collections;
import java.util.List;

public class TwoSumProblem
{
    public Pair<Integer, Integer> twoSum(List<Integer> input, Integer sum)
    {
        Collections.sort(input);
        int n = input.size();
        int i = 0;
        int j = n-1;

        while (i < j)
        {
            int currentSum = input.get(i) + input.get(j);
            if (currentSum == sum)
            {
                return new Pair<>(input.get(i), input.get(j));
            } else if (currentSum < sum) {
                ++i;
            } else {
                --j;
            }
        }
        throw new AnswerNotFoundException("Pair does not exists");
    }
}