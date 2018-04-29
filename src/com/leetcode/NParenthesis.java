package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NParenthesis
{
    public List<String> generateParenthsis(int n)
    {
        if (n==1)
        {
            List<String> rv = new ArrayList<>();
            rv.add("()");
            return rv;
        }

        List<String> n_1 = generateParenthsis(n-1);
        Set<String> nParens = new TreeSet<>();

        for (String s1 : n_1)
        {
            nParens.add("()" + s1);
            for(int i=0;i<s1.length();++i)
            {
                if (s1.charAt(i) == '(')
                {
                    String s = s1.substring(0,i+1) + "()" + s1.substring(i+1);
                    if (!nParens.contains(s))
                    {
                        nParens.add(s);
                    }
                }
            }
        }
        return new ArrayList<>(nParens);
    }
}
