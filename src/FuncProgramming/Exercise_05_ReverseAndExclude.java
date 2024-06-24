package FuncProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise_05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();
        int m = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> predicat = n -> n % m !=0;
        List<Integer> newList = intList.stream()
                .filter(predicat)
                .collect(Collectors.toList());
        Collections.reverse(newList);
        for (Integer i : newList) {
            System.out.print(i + " ");
        }


    }
}
