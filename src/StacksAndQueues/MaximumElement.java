package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int[] commands = Arrays.stream(input.split("\\s")).mapToInt(Integer::parseInt)
                    .toArray();
            switch (commands[0]){
                case 1 -> numbersStack.push(commands[1]);
                case 2 -> numbersStack.pop();
                case 3 -> System.out.println(Collections.max(numbersStack));

            }

        }
    }
}
