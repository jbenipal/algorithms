package com.cormen.chap16;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cormen.chap16.ActivitySelection.Activity;

import java.util.List;

public class ActivitySelectionTest
{
    @BeforeMethod
    public void setup()
    {
        activitySelection_ = new ActivitySelection();
        activity1 = activitySelection_.new Activity(1,4, "a1");
        activity2 = activitySelection_.new Activity(3,5, "a2");
        activity3 = activitySelection_.new Activity(0,6, "a3");
        activity4 = activitySelection_.new Activity(5,7, "a4");
        activity5 = activitySelection_.new Activity(3,9, "a5");
        activity6 = activitySelection_.new Activity(5,9, "a6");
        activity7 = activitySelection_.new Activity(6,10, "a7");
        activity8 = activitySelection_.new Activity(8,11, "a8");
        activity9 = activitySelection_.new Activity(8,12, "a9");
        activity10 = activitySelection_.new Activity(2,14, "a10");
        activity11 = activitySelection_.new Activity(12,16, "a11");
    }

    @Test
    public void test()
    {
        Activity[] activities = {activity1, activity2, activity3, activity4, activity5, activity6,activity7, activity8, activity9, activity10, activity11};
        List<String> optimalActivities = activitySelection_.getOptimalActivities(activities);
        optimalActivities.forEach(activity -> System.out.println(activity));
    }

    private ActivitySelection activitySelection_;
    private Activity activity1;
    private Activity activity2;
    private Activity activity3;
    private Activity activity4;
    private Activity activity5;
    private Activity activity6;
    private Activity activity7;
    private Activity activity8;
    private Activity activity9;
    private Activity activity10;
    private Activity activity11;
}