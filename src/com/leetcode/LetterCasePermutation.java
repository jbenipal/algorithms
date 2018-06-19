package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation
{
    public List<String> letterCasePermutation(String str)
    {
        List<String> rv = new ArrayList<>();
        rv.add(str);
        letterCasePermutation(str, 0, rv);

        return rv;
    }

    private void letterCasePermutation(String str, int index, List<String> rv)
    {
        if (index == str.length()) {
            return;
        }

        if (Character.isUpperCase(str.charAt(index))) {
            String str2 = str.substring(0, index) + Character.toLowerCase(str.charAt(index)) + str.substring(index+1,str.length());
            rv.add(str2);
            letterCasePermutation(str2, index +1, rv);
        } else if (Character.isLowerCase(str.charAt(index))) {
            String str2 = str.substring(0, index) + Character.toUpperCase(str.charAt(index)) + str.substring(index+1,str.length());
            rv.add(str2);
            letterCasePermutation(str2, index +1, rv);
        }
        letterCasePermutation(str, index+1, rv);
    }
}