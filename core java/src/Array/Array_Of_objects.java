package Array;
class Students{
    int roll, marks;
    String name;

    Students(int roll, int marks, String name){
        this.roll = roll;
        this.marks=marks;
        this.name = name;
    }

    public void displayStudent(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("ROLL : "+ roll);
        System.out.println("NAME : "+ name);
        System.out.println("MARKS : "+ marks);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
    }
}

public class Array_Of_objects {
    public static void main(String[] args) {
        Students s1 = new Students(101, 89, "omkar");
        Students s2 = new Students(102, 69, "vaibhav");
        Students s3 = new Students(103, 83, "avinash");
        Students s4 = new Students(104, 65, "om");

        Students[] students = new Students[]{s1, s2, s3, s4};

        for(Students st : students){
            st.displayStudent();
        }


    }
}
