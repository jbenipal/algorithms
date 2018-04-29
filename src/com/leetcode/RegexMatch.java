package com.leetcode;

/*
 * Problem 10
 */

public class RegexMatch
{
    public boolean isMatch(String s, String p) {
        int patternLen = p.length();
        int stringLen = s.length();
        // Empty check

        return regexMatch(s, p, 0, 0);
    }

    private boolean regexMatch(String s, String p, int sIndex, int pIndex)
    {
        if (pIndex == p.length() && sIndex == s.length())
        {
            return true;
        } else if (pIndex == p.length() && sIndex < s.length()) {
            return false;
        }

        boolean currMatch = (sIndex < s.length()) && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '.');

        if (pIndex + 1 < p.length() && p.charAt(pIndex+1) == '*')
        {
            return regexMatch(s, p, sIndex, pIndex + 2) || (currMatch && regexMatch(s, p, sIndex+1, pIndex));
        } else {
            return currMatch && regexMatch(s, p, sIndex + 1, pIndex + 1);
        }
        /*
        if (!currMatch)
        {
            if (pIndex + 1 < p.length() && p.charAt(pIndex+1) == '*')
            {
                return regexMatch(s, p, sIndex, pIndex + 2);
            } else {
                return false;
            }

        } else {
            if (pIndex + 1 < p.length() && p.charAt(pIndex+1) == '*')
            {
                return regexMatch(s, p, sIndex + 1, pIndex + 2) || regexMatch(s, p, sIndex + 1, pIndex) || regexMatch(s, p, sIndex, pIndex + 2);
            } else {
                return regexMatch(s, p, sIndex + 1, pIndex + 1);
            }
        }
        */
    }
}
