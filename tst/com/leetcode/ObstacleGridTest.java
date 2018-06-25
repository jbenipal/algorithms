package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ObstacleGridTest
{
    @BeforeMethod
    public void setup()
    {
        obstacleGrid = new ObstacleGrid();
    }

    @Test
    public void test()
    {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        assertEquals(obstacleGrid.uniquePathsWithObstacles(grid), 2);
    }

    @Test
    public void test2()
    {
        int[][] grid = {{1,0}};
        assertEquals(obstacleGrid.uniquePathsWithObstacles(grid), 0);
    }

    private ObstacleGrid obstacleGrid;
}