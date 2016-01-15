package com.zoo;

/**
 * Created by networkdanik on 1/15/16.
 */
public class ArrayCollections {

        final  static String[] WEEKDAY ={"MON", "WEM", "TUE", "THU", "FRI", "SAT", "SUN"};

        public static void main(String[] args) {
            int i = 0;
            for (String day : WEEKDAY){
                System.out.println(day + " " + "is number under" + " " + i);
                i++;

            }
        }
    }


