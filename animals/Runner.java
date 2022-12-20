package day22inheritancepolymorphism.animals;

public class Runner {
    public static void main(String[] args) {

        //Inheritance'da variable'lar seçilirken Java object in data type ına bakar.
        // Oncelikli istediğiniz variable i Object in data type ı olan Class'ta arar.
        // O Class'ta bulamazsa Parent Class ta arar. Hiçbir ParentClassta bulamazsa hata verir.

        Cat c1 = new Cat();
        System.out.println(c1.a); //14
        System.out.println(c1.b); //34
        System.out.println(c1.c); //45

        Mammal c2 = new Cat();
        System.out.println(c2.a); //13

        Animal c3 = new Cat();
        System.out.println(c3.a); //12

        //Obj oluştururken Obj in data type i Child Class lardan seçilemez,
        //Inheritance'de variable lar seçilirken Java Constructor a bakar
        //Oncelikle istediğiniz method u Constructor kullanılan Classtan alır.
        //O Class'ta bulamazsa Parent Class ta arar. Hiçbir yerde o methodu bulamazsa hata verir.
        Cat c4 = new Cat();
        c4.eat();
        c4.drink();

        Mammal c5 = new Mammal();
        c5.eat();

        Animal c6 = new Animal();
        c6.eat();











    }
}
