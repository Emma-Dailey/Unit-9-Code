package pet_polymorphism;

public class Dog extends Animal{
    public Dog(String sound){
        super("Dog",sound);
    }
    public void makeSound(){
        System.out.println("Woof woof");
    }
}
