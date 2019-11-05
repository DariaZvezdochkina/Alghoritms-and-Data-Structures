package com.company;
public class Main {

    public static int fibonacciRecursive ( int number) {
        if (number <= 1) {
            return number;
        } else {
            return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(8));
    }

}
