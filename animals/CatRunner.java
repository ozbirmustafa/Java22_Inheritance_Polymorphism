package day22inheritancepolymorphism.animals;

public class CatRunner {
    public static void main(String[] args) {

        /*
            1)Javada obj oluşturulurken Constructor'lar PArent'tan Child'a doğru çalıştırılır.
            2)Java en üst parent constructor a çıkabilmek için "super()" kodunu kullanır.
            3)"super()" kodu her constructor ın "ilk satırında" "gizli" olarak bulunur.
            4)"super()" kodunu isterseniz görünür şekilde de yazabilirsiniz
            5)"super()" kodunu görünür şekilde de yazarsanız sakın haaa ilk satır dışında bir satıra koymayınız.
            6)"super()" kodu parent Class'tan constructor çağırmaya yarar.
        */

        Cat cat1 = new Cat();


    }
}
