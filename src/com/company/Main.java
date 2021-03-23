package com.company;

public class Main {

    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int i;
        int fib;
        System.out.print(n1);
        for (i = 1; i<=100; i++)
        {
            fib=n0+n1;
            n0=n1;
            n1=fib;
            System.out.print(" " + fib);

        }
	// write your code here
    }
}
