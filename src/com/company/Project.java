package com.company;

import java.util.ArrayList;
import java.util.List;

public class Project
{

    private String projectName;
    private List<Tasks> tasks;

    public Project(String projectName, List<Tasks> tasks) {
        this.projectName = projectName;
        this.tasks = tasks;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void ListTask()
    {
        for(int i=0;i<getTasks().size();i++)
        {
            System.out.println(tasks.get(i));
        }
    }
}

