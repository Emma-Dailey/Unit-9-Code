package animal_demo;
import java.util.Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        Animal animal1 = new Animal("Fish",2);
        System.out.println(animal1);

        Animal mammal1 = new Mammal("Platypus",5,"insulating");
        Animal poodle1 = new Poodle("Poodle",2,"fluffy",8);
        animals.add(poodle1);
        // poodle1.prance() not valid at compile because poodle1 is type animal
        ((Poodle)animals.get(0)).prance(); //downcasting not on AP exam




    }
}
