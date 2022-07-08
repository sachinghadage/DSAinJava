package com.sachin;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a= in.nextInt();

        //for loop
        for (int i=1; i<=a; i++){
            System.out.println(i);
        }

        //while loop
        int i=1;
        while (i<=a ){
            System.out.println("20 lpa");
            i++;
        }

        //Do while
        int n = 1;
        do {
            System.out.println(n);

        }while (n!=1);
    }
}
