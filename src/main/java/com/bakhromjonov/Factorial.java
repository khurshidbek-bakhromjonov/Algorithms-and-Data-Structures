package com.bakhromjonov;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int x) {
        if (x == 1)
            return 1;
        else
            return x * factorial(x - 1);
    }
}
