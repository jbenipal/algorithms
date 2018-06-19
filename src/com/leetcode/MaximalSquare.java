package com.leetcode;

class MaximalSquare
{
    public int maximalSquare(char[][] matrix)
    {
        if (matrix.length == 0) return 0;
        int[][] memo = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i=0; i<matrix.length; ++i)
        {
            for (int j =0; j<matrix[0].length; ++j)
            {
                memo[i][j] = getMaxSquare(matrix, i,j,memo);
                if (max < memo[i][j]) {
                    max = memo[i][j];
                }
            }
        }

        return max*max;
    }

    private int getMaxSquare(char[][] matrix, int i, int j, int[][] memo)
    {
        if (!isValid(i,j))
        {
            return Character.getNumericValue(matrix[i][j]);
        }

        if (matrix[i][j] == '1')
        {
            return Math.min(Math.min(memo[i-1][j-1], memo[i-1][j]), memo[i][j-1]) + 1;
        }

        return Character.getNumericValue(matrix[i][j]);
    }

    private boolean isValid(int i, int j)
    {
        return (i > 0 && j > 0);
    }
}