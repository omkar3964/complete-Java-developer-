package InnerClass;
class Animal{
    public void eat(){
        System.out.println("Animal can Eat");
    }
    public void sound(){
        System.out.println("Animal make Sound");
    }

}
//instead of creating new class for dog method and write dog can bark you can create anonymous class
// at time of creating objectinstead of creating a new class because if you create new class it take memory.

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void sound() {
                System.out.println("Dog make sound like bark");;
            }
        };
        a.eat();
        a.sound();
    }
}
