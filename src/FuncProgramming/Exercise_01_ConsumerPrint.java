package FuncProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Exercise_01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
        //names.stream().forEach(e -> System.out.println(e));
        Consumer<String> consumer = name -> System.out.println(name);
//        for (String name: names){
//            consumer.accept(name);
//        }
        names.forEach(consumer);
    }
}
