package object_superclass;

public class Main {
    public static void main(String[] args) {
        Food cheesePizzaOne = new Food("cheese pizza",285);
        System.out.println(cheesePizzaOne);
        Food pepperoniPizzaOne = new Food("pepperoni pizza",246);
        System.out.println(pepperoniPizzaOne);
        Food pepperoniPizzaTwo = new Food("pepperoni pizza",246);
        System.out.println(pepperoniPizzaTwo);
        System.out.println(pepperoniPizzaOne.equals(pepperoniPizzaTwo));
    }
}
