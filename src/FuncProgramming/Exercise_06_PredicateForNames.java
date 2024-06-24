package FuncProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Exercise_06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredLength = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
        Predicate<String> predicate = name -> name.length() <= requiredLength;
//        names.stream()
//                .filter(predicate)
//                .forEach(name -> System.out.println(name));

        for (String name: names){
            if (predicate.test(name)){
                System.out.println(name);
            }
        }
    }
}
