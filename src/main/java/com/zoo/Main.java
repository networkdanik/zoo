package com.zoo;


public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pavel");

        String name = person.getName();

        System.out.println("Person: " + name);
    }
}
