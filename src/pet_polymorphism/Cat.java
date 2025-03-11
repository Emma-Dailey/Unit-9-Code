package pet_polymorphism;

public class Cat extends Animal{
    public Cat(String sound){
        super("Cat","Meow");
    }
}


//https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+Main+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++First+obj1+%3D+new+First()%3B%0A++++++First+obj2+%3D+new+Second()%3B%0A++++++obj2.methodOne()%3B%0A+++%7D%0A%7D%0A%0Aclass+First%7B%0A+++public+void+methodOne()%7B%0A++++++System.out.print(%22W%22)%3B%0A++++++methodTwo()%3B%0A+++%7D%0A+++public+void+methodTwo()%7B%0A++++++System.out.print(%22X%22)%3B%0A+++%7D%0A+++%0A%7D%0A%0Aclass+Second+extends+First%7B%0A+++public+void+methodOne()%7B%0A++++++super.methodOne()%3B%0A++++++System.out.print(%22Y%22)%3B%0A+++%7D%0A+++public+void+methodTwo()%7B%0A++++++super.methodTwo()%3B%0A++++++System.out.print(%22Z%22)%3B%0A+++%7D%0A%7D&mode=display&curInstr=33