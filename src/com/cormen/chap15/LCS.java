package com.cormen.chap15;

public class LCS
{
    public int lcs(String s1, String s2)
    {
        int l1 = s1.length();
        int l2 = s2.length();

        int[][] m = new int[l1][l2];
        int[][] s = new int[l1][l2];

        int longest = lcs(s1, s2, l1, l2, m, s);

        //print_lcs()
        return longest;
    }

    private int lcs(String s1, String s2, int l1, int l2, int[][] m, int[][] s)
    {
        if (l1 == 0 || l2 == 0) return 0;
        if (m[l1-1][l2-1] >0) return m[l1-1][l2-1];

        if (s1.charAt(l1 -1) == s2.charAt(l2-1))
        {
            int longest = lcs(s1, s2, l1-1,l2-1, m, s) + 1;
            m[l1-1][l2-1] = longest;
        } else {
            int first = lcs(s1, s2, l1,l2-1, m, s);
            int second = lcs(s1, s2, l1-1,l2, m, s);

            int longest;
            if (first > second) {
                longest = first;
            } else {
                longest = second;
            }
            m[l1-1][l2-1] = longest;
        }

        return m[l1-1][l2-1];
    }
}
