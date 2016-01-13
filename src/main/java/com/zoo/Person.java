package com.zoo;



public class Person {
    private  String firstName;
    private String lastName;
    private  int age;
    private  float weight;

    public Person(String firstName,String lastName, int age, long weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public static void main(String[] args) {

    }
}
