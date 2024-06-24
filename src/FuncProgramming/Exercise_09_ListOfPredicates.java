package FuncProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Exercise_09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> dividers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .toList();
        for (int i = 1; i <= n; i++) {
            boolean isDivisable = true;
            for (Integer divider : dividers) {
                if (i % divider != 0){
                   isDivisable = false;
                }

            }
            if (isDivisable){
                System.out.print(i + " ");
            }


        }



    }
}
