package com.zoo;

/**
 * Created by networkdanik on 13.01.16.
 */
public class Dog extends  Animal implements Swimable {

    public void voice(){
        System.out.println("Dog barks");
    }

    @Override
    public void swim() {
        System.out.println("Dogs can swim");
    }
}
