package random_polymorphism;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle(boolean hasSideCar){
        super(2);
        this.hasSideCar = hasSideCar;
    }

    public void vroom(){
        System.out.println("Vrooom");
    }

}
