package com.TasksJavaRush.Course_23.Solution_4;

import java.util.HashMap;
import java.util.Map;

public class MockView
{
    private static final Map FAKE_TASK_CRITERIA = new HashMap();
    private static final Map FAKE_NAME_CRITERIA = new HashMap();

    public static Map getFakeTaskCriteria()
    {
        return FAKE_TASK_CRITERIA;
    }

    public static Map getFakeNameCriteria()
    {
        return FAKE_NAME_CRITERIA;
    }
}