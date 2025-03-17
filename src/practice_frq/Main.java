package practice_frq;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Dog fluffy = new Dog("Fluffy","pomeranian");
        fluffy.printPetInfo();

        ArrayList<Pet> petList = new ArrayList<Pet>();
        Pet pet1 = new Pet("Floppy","rabbit");
        Pet pet2 = new Dog("Arty","pug");
        petList.add(pet1);
        petList.add(pet2);
        PetOwner owner1 = new PetOwner(pet1,"Jerry");
        System.out.println();
        owner1.printOwnerInfo();

    }
}
