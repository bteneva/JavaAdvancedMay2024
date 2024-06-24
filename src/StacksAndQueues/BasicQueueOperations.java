package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        String[] commandArray = commands.split("\\s+");
        int N = Integer.parseInt(commandArray[0]);
        int S = Integer.parseInt(commandArray[1]);
        int X = Integer.parseInt(commandArray[2]);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            queue.offer(number);
        }
        for (int i = 0; i < S; i++) {
            queue.poll();
        }
        if (!queue.isEmpty()){
            if (queue.contains(X)){
                System.out.println("true");
            }
            else {
                System.out.println(Collections.min(queue));
            }
        }
        else{
            System.out.println(0);
        }

    }
}


