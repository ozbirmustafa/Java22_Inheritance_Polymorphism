package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*
        1)Siz Class oluşturduğunuzda görünmez bir constructor verir
         çünkü Java Class ın bir kalıp olduğunu ve obj oluşturmak için yaratıldığını ve obj oluşturmak için
         constructor ın şart olduğunu bilir.
        2)Javanın otomatik olarak oluşturduğu bu görünmez constructor a "default constructor" denir.
        3)Siz kendiniz herhangi bir constructor oluşturduğunuzda Java "default constructor" ı siler.
        4)Bir Class'ta birden fazla constructor olabilir.
        5)"This" keyword "Bu Class" anlamındadir. this.price demek bu Class'taki "price" isimli variable demektir.
          "this.price" syntax i constructor'ların içinde kullanılır.
        6)Constructor kullanarak variable lar üzerinde yaptığınız değişimler sadece Obj üzerindeki variable ların değerlerini değiştirir.
          Class daki variable değerlerini değiştirmez.

    */
    public int price;
    public int year;

    public String make;
    public String model;

    public HondaAccord(){

    }

    public HondaAccord(int price){
        this.price = price;
    }

    public HondaAccord(int price, int year){
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");

    }


}
