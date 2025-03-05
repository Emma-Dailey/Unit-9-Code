package animal_demo;

public class Dalmatian extends Dog{
    private int numSpots;

    public Dalmatian(String name, int age, String hairType, String breed, int numSpots) {
        super(name, age, hairType, breed);
        this.numSpots = numSpots;
    }

    public void work(){
        System.out.printf("%s is hard at work",this.getName());
    }
}
