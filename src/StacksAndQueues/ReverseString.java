
package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+"); // Split the input string by whitespace
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Parse each number and push it onto the stack
        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }

        // Pop and print the numbers to reverse the order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
