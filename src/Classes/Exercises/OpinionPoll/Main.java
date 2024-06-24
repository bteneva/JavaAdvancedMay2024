package Classes.Exercises.OpinionPoll;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> nameAge = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            if (person.getAge() > 30){
               nameAge.put(person.getName(), person.getAge());
            }
        }
        nameAge.forEach((name, age) -> System.out.printf("%s - %d%n", name, age));
    }
}
