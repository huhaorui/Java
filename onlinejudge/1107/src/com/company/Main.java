package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextInt())
        {
            int a=scan.nextInt(),b=scan.nextInt();
            long sum1=0,sum2=0;
            for (int i=a;i<=b;i++)
            {
                if (i%2==0){
                    sum1+=i*i;
                }
                else{
                    sum2+=i*i*i;
                }
            }
            System.out.print(sum1);
            System.out.print(" ");
            System.out.println(sum2);
        }
    }
}
