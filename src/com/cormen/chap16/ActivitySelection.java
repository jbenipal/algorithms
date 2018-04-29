package com.cormen.chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ActivitySelection
{
    public class Activity
    {
        private int startTime;
        private int endTime;
        private String name;

        public Activity(int s, int e, String name)
        {
            startTime = s;
            endTime = e;
            this.name = name;
        }

        public int endTime()
        {
            return endTime;
        }

        public int startTime()
        {
            return startTime;
        }

        public String name()
        {
            return name;
        }
    }

    public List<String> getOptimalActivities(Activity[] activities)
    {
        int n = activities.length;
        Arrays.sort(activities, Comparator.comparingInt(Activity::endTime));

        List<String> rv = new LinkedList<>();
        int k = 1;
        int prevActivity = 0;
        rv.add(activities[0].name());
        while (k<n)
        {
            if (activities[k].startTime() < activities[prevActivity].endTime())
            {
                ++k;
            } else {
                prevActivity = k;
                rv.add(activities[k].name());
            }
        }
        return rv;
    }
}
