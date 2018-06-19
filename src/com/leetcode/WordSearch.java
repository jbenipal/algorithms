package com.leetcode;

import com.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class WordSearch
{
    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) return false;

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[board.length][board[0].length];
                    if (exists(visited, board, word, i, j))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean exists(boolean[][] visited, final char[][] board, String word, int i, int j)
    {
        if (word.length() == 0) return true;
        if (visited[i][j] == true) {
            return false;
        }
        if (board[i][j] == word.charAt(0)) {
            visited[i][j] = true;
            for (Pair<Integer, Integer> indices : nextIndices(i, j, board.length, board[0].length)) {
                if (exists(visited, board, word.substring(1), indices.first(), indices.second())) {
                    return true;
                }
            }
            visited[i][j] = false;
        }

        return false;
    }

    List<Pair<Integer, Integer>> nextIndices(int i, int j, int rows, int cols)
    {
        List<Pair<Integer, Integer>> indices = new ArrayList<>();
        if (i > 0) {
            indices.add(new Pair<>(i-1, j));
        }
        if (j > 0) {
            indices.add(new Pair<>(i, j-1));
        }
        if (i < rows -1) {
            indices.add(new Pair<>(i+1, j));
        }
        if (j< cols-1) {
            indices.add(new Pair<>(i, j+1));
        }

        return indices;
    }
}
