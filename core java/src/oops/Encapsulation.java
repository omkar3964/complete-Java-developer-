package oops;

class Student{
    private int roll;
    private String name;
    private float marks;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRoll(101);
        s1.setName("Omkar");
        s1.setMarks(90.2f);

        System.out.println(s1.getRoll());
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
    }

}
