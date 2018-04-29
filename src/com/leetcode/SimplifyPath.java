package com.leetcode;

import java.util.Stack;

public class SimplifyPath
{
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        int currIndex = 0;
        while (currIndex < path.length())
        {
            int index = path.indexOf("/", currIndex+1);
            if (index != currIndex+1 || index == -1) {
                if (index == -1) {
                    index = path.length();
                }
                String str = path.substring(currIndex+1, index);
                if (str.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (!str.equals(".") && !str.isEmpty()) {
                    stack.push(str);
                }
                currIndex = index;
            } else {
                currIndex = currIndex + 1;
            }
        }

        if (stack.isEmpty()) {
            return "/";
        } else {
            StringBuilder simplePath = new StringBuilder();
            while (!stack.isEmpty())
            {
                simplePath.insert(0, "/" + stack.pop());
            }
            return simplePath.toString();
        }
    }
}
