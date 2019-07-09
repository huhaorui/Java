package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        for (int a=0;a<10;a++) {
            int t;
            t=scan.nextInt();
            sum+=t*t;
        }
        System.out.println(sum);
    }
}
