package com.leetcode;

import java.util.Arrays;

/*
You have to cut a wood stick into several pieces. The most affordable company, Analog Cutting
Machinery (ACM), charges money according to the length of the stick being cut. Their cutting saw
allows them to make only one cut at a time.
It is easy to see that different cutting orders can lead to different prices. For example, consider a
stick of length 10 m that has to be cut at 2, 4, and 7 m from one end. There are several choices. One
can cut first at 2, then at 4, then at 7. This leads to a price of 10 + 8 + 6 = 24 because the first stick
was of 10 m, the resulting stick of 8 m, and the last one of 6 m. Another choice could cut at 4, then
at 2, then at 7. This would lead to a price of 10 + 4 + 6 = 20, which is better for us.
Your boss demands that you write a program to find the minimum possible cutting cost for any
given stick.
 */

public class AnalogCutMachine
{
    // cant convert to DP :(
    public int minCost(int length, int[] cuts)
    {
        if (cuts.length == 0) {
            return 0;
        }

        int numCuts = cuts.length;
        int minCost = Integer.MAX_VALUE;
        for (int i=0; i< numCuts; ++i)
        {
            int[] leftCuts = Arrays.copyOfRange(cuts, 0, i);
            int[] rightCuts = Arrays.copyOfRange(cuts, i + 1 , numCuts);
            for (int j =0; j<rightCuts.length; ++j)
            {
                rightCuts[j] -= cuts[i];
            }
            int cost = length + minCost(cuts[i], leftCuts) + minCost(length - cuts[i], rightCuts);

            if (cost < minCost) {
                minCost = cost;
            }
        }

        return minCost;
    }
}
