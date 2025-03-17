package random_polymorphism;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle v1 = new Vehicle(4);
        Vehicle v2 = new Motorcycle(false);
        Motorcycle m1 = new Motorcycle(true);
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(m1);

        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            System.out.println(v);
        }
    }
}
