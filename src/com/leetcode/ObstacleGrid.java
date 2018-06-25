package com.leetcode;

public class ObstacleGrid
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] memo = new int[rows+1][cols+1];

        if (obstacleGrid[0][0] == 0)
        {
            memo[1][1] = 1;
        }

        for(int i=2;i<=cols;++i)
        {
            if (obstacleGrid[0][i-1] == 0) {
                memo[1][i] = memo[1][i-1];
            }
        }
        for(int i=2;i<=rows;++i)
        {
            if (obstacleGrid[i-1][0] == 0) {
                memo[i][1] = memo[i-1][1];
            }
        }

        for (int i=1;i < rows; ++i)
        {
            for (int j=1; j< cols; ++j)
            {
                if (obstacleGrid[i][j] == 0)
                {
                    memo[i+1][j+1] = memo[i][j+1] + memo[i+1][j];
                }
            }
        }
        return memo[rows][cols];
    }
}
