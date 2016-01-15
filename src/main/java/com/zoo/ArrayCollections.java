package com.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by networkdanik on 1/15/16.
 */
public class ArrayCollections  {
/*
        final  static String[] WEEKDAY ={"MON", "WEM", "TUE", "THU", "FRI", "SAT", "SUN"};

        public static void main(String[] args) {
            int i = 0;
            for (String day : WEEKDAY){
                System.out.println(day + " " + "is number under" + " " + i);
                i++;

 */
public static void main(String[] args) {

    /*List<String> strList = new ArrayList<String>();
         strList.add("John");
         strList.add("Willi");
         strList.add("Iwan");
         strList.add(3,"test");

    for (String str : strList){
        System.out.println(str);
        */
    Animal dog = new Dog();
    Animal cat = new Cat();


    List<Animal> animals = new ArrayList<Animal>();

    animals.add(dog);
    animals.add(cat);

    for (int i = 0; i <5;  i++){
        animals.add(new Dog());
    }
    for (Animal animal : animals){
        animal.voice();
    }

    }


    }


