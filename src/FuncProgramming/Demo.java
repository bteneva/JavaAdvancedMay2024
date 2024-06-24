package FuncProgramming;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String msg = "Hello str";
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        list.forEach(e -> System.out.println(e));

        int sum = list.stream().filter(e -> e%2 ==0).mapToInt(e -> e).sum();

        System.out.println(sum);


    }
}
