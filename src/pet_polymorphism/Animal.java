package pet_polymorphism;

public class Animal{
    private String sound;
    private String type;
    public Animal(String type,String sound){
        this.type = type;
        this.sound = sound;
    }
    public void makeAnimalSound(){
        System.out.printf("A %s says %s",this.type,this.sound);
    }

}
