package com.cormen.chap5;

import java.util.concurrent.ThreadLocalRandom;

public class RandomAB
{
    public int random(int a, int b) {
        int bit_count = (int) Math.ceil(Math.log(b - a + 1) / Math.log(2));
        do {
            int r = randPowerOf2(bit_count);
            if (a + r <= b) {
                return a + r;
            }
        } while (true);
    }

    int randPowerOf2(int bit_count) {
        int output = 0;
        while (bit_count > 0) {
            output = 2 * output + random();
            --bit_count;
        }
        return output;
    }

    private int random()
    {
        return ThreadLocalRandom.current().nextInt(0, 2);
    }
}
