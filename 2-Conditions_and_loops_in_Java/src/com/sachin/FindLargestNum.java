package com.sachin;

import java.util.Scanner;

public class FindLargestNum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
//         int max = A;
         
         if (A>B && A>C){
             System.out.println(A);
         } else if (B>A && B>C) {
             System.out.println(B);
         } else if (C>A && C>B) {
             System.out.println(C);
         }

         //Math.max
        int max = Math.max(A,Math.max(B,C));
        System.out.println(max);
    }
}
