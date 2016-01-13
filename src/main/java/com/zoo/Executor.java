package com.zoo;

/**
 * Created by networkdanik on 13.01.16.
 */
public class Executor {
    public static void main(String[] args) {
    Executor executor = new Executor();
    Person pasha = new Person("Pawel;", "Kulakowski;", 35, (long) 72.5);

    executor.printPersonPasha(pasha);
}

        private  void printPersonPasha(Person person){
            System.out.println("Person: " + "Firstname -" +" " + person.getFirstName()
                    + " " + "Lasname -" + " " + person.getLastName()
                    + " Age - " + person.getAge() + " " + " Weight " +person.getWeight());
        }
}


