package com.company;

import java.util.ArrayList;
    public class ColorArray
    {
        private ArrayList<String> colors;
        public ColorArray()
        {
            colors= new ArrayList<>();
        }
        public void addcolor(String color)
        {
            colors.add(color);
        }
        public String getcolor()
        {
            return colors.toString();
        }
        public void printmyarray()
        {
            System.out.println(getcolor());

        }
}
