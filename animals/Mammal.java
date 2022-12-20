package day22inheritancepolymorphism.animals;

public class Mammal extends Animal{

    public int a = 13;
    public int b = 34;

    public void eat(){
        System.out.println("Car Eats");
    }

    public void drink (){
        System.out.println("Car Drinks");
    }
    public Mammal(){
        System.out.println("Car");
    }


}
