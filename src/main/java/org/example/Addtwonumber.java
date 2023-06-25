package org.example;

import java.util.Scanner;

public class Addtwonumber {

    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();b=in.nextInt();
        System.out.println(add(a,b));
    }
    private static int add(int a,int b){
        return a+b;
    }
}
