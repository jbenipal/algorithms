package com.cormen.chap15;

public class MinMatrixChainMultiplications
{
    public int minMultiplications(int[] p)
    {
        int n = p.length - 1;
        int[][] m = new int[n+1][n+1];
        int[][] s = new int[n+1][n+1];

        for (int i=0; i<n+1; ++i)
        {
            m[i][i] = 0;
        }
        // compute from chain length 2,3....n (chain length n mean compute in order as it is without split)
        for (int l = 2; l <= n; ++l)
        {
            // compute min cost to compute matrix chain of length l
            // starting from matrix i
            for (int i = 1; i<= n-l+1; ++i)
            {
                // compute index of last matrix for chain length l starting from i
                int j = i+l-1;

                int minCost = Integer.MAX_VALUE;
                // compute the cost for every possible split
                for (int k=i; k < j; ++k)
                {
                    int cost = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if (cost < minCost) {
                        minCost = cost;
                        s[i][j] = k;
                    }
                }
                m[i][j] = minCost;
            }
        }
        return m[1][n];
    }

    public int minMultiplicationsRecursive(int[] p)
    {
        int n = p.length - 1;
        int[][] m = new int[n+1][n+1];
        return minMultiplicationsRecursive(p, m, 1, n);
    }

    private int minMultiplicationsRecursive(int[] p, int[][] m, int i, int j)
    {
        if (i == j) return 0;
        if (m[i][j] > 0) return m[i][j];

        int minCost = Integer.MAX_VALUE;
        for (int k=i; k<j; ++k)
        {
            int cost = minMultiplicationsRecursive(p, m, i, k) + minMultiplicationsRecursive(p, m, k+1, j) + p[i-1]*p[k]*p[j];
            if (cost < minCost)
            {
                minCost = cost;
            }
        }
        m[i][j] = minCost;
        return m[i][j];
    }
}