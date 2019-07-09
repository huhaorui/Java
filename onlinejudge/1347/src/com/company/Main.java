package com.company;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum=0;
        while (scan.hasNextInt()) {
            num=scan.nextInt();
            sum=sum^num;
        }
        System.out.println(sum);
    }
}
