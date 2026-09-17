package Array;

import java.util.Scanner;

public class Array_1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements in array");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("enter a number at index : " + i);
            numbers[i] = sc.nextInt();
        }

        for(int num : numbers){
            System.out.println(num);
        }
    }
}
