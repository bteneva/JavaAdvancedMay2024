package StacksAndQueues;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(fibonacciRecursive(n+1));
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n - 2);
        }
    }
}
