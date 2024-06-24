package FuncProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise_04_AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        Function<List<Integer>, List<Integer>> add = list -> list.stream().map(e -> e + 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = list -> list.stream().map(e -> e - 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = list -> list.stream().map(e -> e * 2).collect(Collectors.toList());
        Consumer<List<Integer>> print = list -> list.forEach(e -> System.out.print(e + " "));

        while (!command.equals("end")) {
            switch (command) {
                case "add" -> numbers = add.apply(numbers);
                case "subtract" -> numbers = subtract.apply(numbers);
                case "multiply" -> numbers = multiply.apply(numbers);
                case "print" -> {
                    print.accept(numbers);
                    System.out.println();
                }
            }
            command = scanner.nextLine();
        }
    }
}
