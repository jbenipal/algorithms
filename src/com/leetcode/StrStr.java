package com.leetcode;

public class StrStr
{
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;
        int l1 = haystack.length();
        int l2 = needle.length();
        for (int i=0; i<l1-l2+1;++i)
        {
            if (haystack.charAt(i) == needle.charAt(0))
            {
                int j=0;
                for (j=0;j<l2; ++j)
                {
                    if (haystack.charAt(i+j) != needle.charAt(j))
                    {
                        break;
                    }
                }
                if (j == l2)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
