package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Tasks Task1 = new Tasks("12/121/12");
        Tasks Task2 = new Tasks("12/121/12");
        List<Tasks> NovaeTasks = new ArrayList<Tasks>();
        NovaeTasks.add(Task1);


        List <Tasks> UmeaTasks = new ArrayList<Tasks>();
        UmeaTasks.add(Task2);

        Project project1 = new Project("Project one",NovaeTasks);
        Project project2 = new Project("Project two",NovaeTasks);

        project1.ListTask();





    }
}
