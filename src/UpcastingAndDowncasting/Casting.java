package UpcastingAndDowncasting;

class Animal {
    public int legs;
    public int tail;

    public  void sleep () {
        System.out.println("Animal class");
    }
}


class Dog extends Animal {
    public void bark() {
        System.out.println("Dog will bark");
    }
}

public class Casting {
    static void main(String[] args) {
        Animal a = new Dog(); // upcasting and reference type = Animal, object type = Dog
        a.sleep(); // run-time call
//        a.bark();
        Dog b = (Dog) a; // down-casting
        b.bark();

    }
}
