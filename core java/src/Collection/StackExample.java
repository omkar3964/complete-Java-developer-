package Collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();
        s.add(34);
        s.push(21);
        s.push(90);
        s.push(54);

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());

        System.out.println(s.empty());
        System.out.println(s.search(21));
        System.out.println(s);




    }
}
