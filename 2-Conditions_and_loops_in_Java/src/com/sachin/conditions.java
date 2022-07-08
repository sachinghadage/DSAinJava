package com.sachin;
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);

        int a = in.nextInt();

        if (a>0) {
            System.out.println("Positive");
        }
        else if (a<0){
            System.out.println("Neagative");
        }
        else {
            System.out.println("Neutral");
        }

    }
}