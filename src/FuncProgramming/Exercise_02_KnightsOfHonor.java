package FuncProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Exercise_02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
        //1. начин
        // names.stream().forEach(e -> System.out.println("Sir " + e));

        Function<String, String> rename = name -> "Sir " + name;
        names.stream()
                .map(rename)
                .forEach(name -> System.out.println(name));

    }
}
