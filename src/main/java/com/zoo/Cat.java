package com.zoo;

/**
 * Created by networkdanik on 13.01.16.
 */
public class Cat extends Animal implements Swimable {
    public void  voice(){
        System.out.println("Cat meows");
    }

    @Override
    public void swim() {
        System.out.println("Cats can swim");
    }
}
