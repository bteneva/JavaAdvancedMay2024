package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        String[] commandArray = commands.split("\\s+");
        int N = Integer.parseInt(commandArray[0]);
        int S = Integer.parseInt(commandArray[1]);
        int X = Integer.parseInt(commandArray[2]);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            stack.push(number);
        }
        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        if (!stack.isEmpty()){
           if (stack.contains(X)){
               System.out.println("true");
           }
           else {
               System.out.println(Collections.min(stack));
           }
        }
        else{
            System.out.println(0);
        }

    }
}
