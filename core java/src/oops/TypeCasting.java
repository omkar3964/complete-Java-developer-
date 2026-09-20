package oops;


import org.w3c.dom.ls.LSOutput;

class Animal1 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Barking");
    }
}

public class TypeCasting {
    public static void main(String[] args) {


    //  upcasting
        Animal1 a = new Dog1();
        a.sound();
//        a.bark()


//        downcasting
        Dog1 d = (Dog1) a;
        d.bark();
    }
}
