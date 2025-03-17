package random_polymorphism;

public class Vehicle {
    private int numWheels;

    public Vehicle(int numWheels){
        this.numWheels = numWheels;
    }

    public void vroom(){
        System.out.println("Less annoying vroom unless big exhaust");
    }
}
