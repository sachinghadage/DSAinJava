package com.sachin;

import java.util.Scanner;

public class count_num_occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int req_num = in.nextInt();
        int count = 0;
        System.out.println("Entered the number "+n);
        System.out.println("Entered reqired number to check occerance "+req_num);
        while (n>0){
            if (req_num==n%10){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
