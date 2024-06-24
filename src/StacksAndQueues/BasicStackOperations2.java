package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNSX = scanner.nextLine();
        String numbersToOperate = scanner.nextLine();
        //
        //N representing the number of elements to push into the stack,
        // an integer S representing the number of elements to pop from the stack,
        // and an integer X, an element that you should check whether is present in the stack.
        //· On a single line print, either "true" if X is present in the stack, otherwise,
        // print the smallest element in the stack.
        //Output
        //· If the stack is empty – print 0.

        ArrayDeque<Integer> stackOfElements = new ArrayDeque<>();
        String[] nsx = inputNSX.split("\\s");
        int n = Integer.parseInt(nsx[0]);
        int s = Integer.parseInt(nsx[1]);
        int x = Integer.parseInt(nsx[2]);
        int[] numArray = Arrays.stream(numbersToOperate.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < n; i++) {
            stackOfElements.push(numArray[i]);
        }
        for (int i = 0; i < s; i++) {
            stackOfElements.pop();
        }
        if (stackOfElements.isEmpty()) {
            System.out.println(0);
            return;
        }
        if (stackOfElements.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stackOfElements));
        }


    }
}
