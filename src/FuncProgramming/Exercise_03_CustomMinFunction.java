package FuncProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Exercise_03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .toList();
        Function<List<Integer>, Integer> function = listOfNumers -> Collections.min(listOfNumers);
        Integer minValue = function.apply(numbers);
        System.out.println(minValue);

    }
}
