package Classes.Exercises.ComparePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("END")){
            String name = input.split(" ")[0];
            String town = input.split(" ")[2];
            Integer age = Integer.parseInt(input.split(" ")[1]);

            Person person = new Person(name, town, age);
            personList.add(person);
            input = scanner.nextLine();
        }
        int equalCount = 0;
        int n = Integer.parseInt(scanner.nextLine());
//        for (Person person : personList) {
//            for (Person specialPerson : personList) {
//                if (specialPerson.compareTo(person) == 0){
//                    equalCount++;
//                }
//            }
//        }
        if (equalCount==0){
            System.out.println("Niama");
        }
        else{
            System.out.println(equalCount);
        }
    }
}
