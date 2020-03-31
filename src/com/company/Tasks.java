package com.company;
import java.util.ArrayList;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.List;

// class for list of tasks with
public class Tasks
{
    private String dueDate;
    //private boolean status;


    public Tasks(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }


}
