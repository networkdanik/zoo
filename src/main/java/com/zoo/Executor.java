package com.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by networkdanik on 13.01.16.
 */
public class Executor {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Person pasha = new Person("Pawel;","Kulakowski;", 35, (long) 72.5);
        Person sasha = new Person("Aleks;","Gross ;", 38, (long) 78.5);

        executor.printPersonPasha(pasha);
        executor.printPersonSasha(sasha);


        // Animal

        Animal dog = new Dog();
        Animal cat = new Cat();
        executor.giveVoice(dog);
        executor.giveVoice(cat);

        // Swim

        Swimable dog1 = new Dog();
        Swimable cat1 = new Cat();
        Swimable fish = new Fish();


        List<Swimable> list  = Arrays.asList(dog1, cat1, fish);

        for (Swimable swimbleList : list){
            executor.swimblePrint(swimbleList);
        }
    }

    private void swimblePrint(Swimable swimable){
        swimable.swim();

    }





        private  void printPersonPasha(Person person) {
        System.out.println("Person: " + "Firstname -" + " " + person.getFirstName()
                + " " + "Lasname -" + " " + person.getLastName()
                + " Age - " + person.getAge() + " " + " Weight " + person.getWeight());

    }
        private  void printPersonSasha(Person person){
            System.out.println("Person: " + "Firstname -" +" " + person.getFirstName()
                    + " " + "Lasname -" + " " + person.getLastName()
                    + " Age - " + person.getAge() + " " + " Weight " +person.getWeight());
        }
        private  void  giveVoice(Animal animal){
        animal.voice();

    }
}


