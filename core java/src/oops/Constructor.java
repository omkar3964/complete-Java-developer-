package oops;
class Students{
    String name;
    int age;

    Students(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void getStudents(){
        System.out.println("name : "+ name);
        System.out.println("age : "+ age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Students s = new Students( 23, "omkar");
        s.getStudents();

    }
}
