package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //{, }, (, ), [, ]
        ArrayDeque<String> openBrackets = new ArrayDeque<>();

        String[] brackets = input.split("");
        for (String bracket : brackets) {
            if (bracket.equals("{") || bracket.equals("(") || bracket.equals("[")) {
                openBrackets.push(bracket);
            } else {
                if (bracket.equals("}")) {
                    if (!openBrackets.isEmpty() && openBrackets.pop().equals("{")) {
                        continue;
                    } else {
                        System.out.println("NO");
                        return; // Stop processing further
                    }
                } else if (bracket.equals("]")) {
                    if (!openBrackets.isEmpty() && openBrackets.pop().equals("[")) {
                        continue;
                    } else {
                        System.out.println("NO");
                        return; // Stop processing further
                    }

                } else if (bracket.equals(")")) {
                    if (!openBrackets.isEmpty() && openBrackets.pop().equals("(")) {
                        continue;
                    } else {
                        System.out.println("NO");
                        return; // Stop processing further
                    }

                }
            }

        }
        if (openBrackets.isEmpty()) {
            System.out.println("YES");
//        } else {
//            System.out.println("NO");
      }
    }
}
