package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsI
{
    public List<List<Integer>> getPermutations(int n[])
    {
        List<List<Integer>> res = new ArrayList<>();
        if (n.length == 0)
        {
            return res;
        }

        List<Integer> nums = new ArrayList<>();
        nums.add(n[0]);
        res.add(nums);

        for (int i = 1;i<n.length; ++i)
        {
            List<List<Integer>> new_ans = new ArrayList<>();
            for (int j=0;j<=i;++j)
            {
                for (List<Integer> l: res)
                {
                    List<Integer> new_l = new ArrayList<>(l);
                    new_l.add(j, n[i]);
                    new_ans.add(new_l);
                }
            }
            res = new_ans;
        }

        return res;
    }

    public List<List<Integer>> getPermutations_recursive(int n[])
    {
        List<Integer> nums = new ArrayList<>();
        Arrays.stream(n).forEach(i -> nums.add(i));

        return permute(nums);
    }

    private List<List<Integer>> permute(List<Integer> list)
    {
        List<List<Integer>> result = new ArrayList<>();
        if (list.size() == 1)
        {
            result.add(list);
            return result;
        }

        for (int i=0; i<list.size(); ++i)
        {
            swap(list, 0 , i);
            List<List<Integer>> output = permute(list.subList(1, list.size()));
            output.forEach(subPermute -> {
                List<Integer> permute = new ArrayList<>();
                permute.add(list.get(0));
                permute.addAll(subPermute);

                result.add(permute);
            });
            swap(list, i, 0);
        }
        return result;
    }

    private void swap(List<Integer> list, int i, int j)
    {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
