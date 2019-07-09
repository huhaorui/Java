package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        n=Integer.parseInt(in.next());
        for (int x=0;x<n;x++)
        {
            int[] num=new int[5];
            int sum=0;
            for (int y=0;y<5;y++)
            {
                num[y]=Integer.parseInt(in.next());
                sum+=num[y];
            }
            char c=(char)(sum%26+97);
            System.out.println(c);
        }
        in.close();
    }
}
