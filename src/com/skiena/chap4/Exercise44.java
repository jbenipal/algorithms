package com.skiena.chap4;

import com.util.Pair;
import java.util.*;

public class Exercise44
{
    public enum Color {
        RED,
        BLUE,
        YELLOW;
    }

    public class Test {
        int i;
    }

    public List<Pair<Integer, Color>> sortNPairs(List<Pair<Integer, Color>> inputs)
    {
        Map<Color, Integer> colorMap = new HashMap<>();
        colorMap.put(Color.RED, 0);
        colorMap.put(Color.BLUE, 1);
        colorMap.put(Color.YELLOW, 2);

        int size = inputs.size();
        int[] counts = new int[3];
        Arrays.fill(counts, 0, counts.length, 0);

        inputs.forEach(input -> {
            counts[colorMap.get(input.second())]++;
        });

        List<Pair<Integer, Color>> output = new ArrayList<>(inputs.size());

        for(int i = size-1;i>=0;--i) {
            output.set(counts[colorMap.get(inputs.get(i).second())], inputs.get(i));
            counts[colorMap.get(inputs.get(i).second())]--;
        }

        return output;
    }
}
