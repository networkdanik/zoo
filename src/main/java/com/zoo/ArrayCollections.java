package com.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by networkdanik on 1/15/16.
 */
public class ArrayCollections {
/*
        final  static String[] WEEKDAY ={"MON", "WEM", "TUE", "THU", "FRI", "SAT", "SUN"};

        public static void main(String[] args) {
            int i = 0;
            for (String day : WEEKDAY){
                System.out.println(day + " " + "is number under" + " " + i);
                i++;

 */
public static void main(String[] args) {

    List<String> strList = new ArrayList<>();
         strList.add("John");
         strList.add("Willi");
         strList.add("Iwan");

    for (String str : strList){
        System.out.println(str);
    }
        }
    }


