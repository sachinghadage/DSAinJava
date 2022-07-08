package com.sachin;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // take the operator to perform the operation

        while (true){
            //Take operator as input
            System.out.println("Enter the operator");
            char operator = in.next().trim().charAt(0);
            if(operator=='+' || operator=='-' || operator=='*' || operator=='/' || operator=='%' ){
                // input two numbers
                System.out.println("Enter num 1");
                int num1 = in.nextInt();
                System.out.println("Enter num 2");
                int num2 =in.nextInt();

                if (operator=='+'){
                    System.out.println(num1+num2);
                } else if (operator=='-') {
                    System.out.println(num1-num2);
                } else if (operator=='*') {
                    System.out.println(num1*num2);
                } else if (operator=='/') {
                    System.out.println(num1/num2);
                }else if(operator=='%'){
                    System.out.println(num1%num2);
                }

            }
            else if (operator=='x' || operator=='X') {
                break;
            }else {
                System.out.println("invalid input");
            }
        }

    }
}
