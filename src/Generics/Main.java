package Generics;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());

//        Box<String> box = new Box<>();
//
//        for (int i = 0; i < n; i++) {
//            String input = scanner.nextLine();
//            box.add(input);
//        }
//        System.out.println(box);
//Задача 2
//        Box<Integer> box = new Box<>();
//        for (int i = 0; i < n; i++) {
//            Integer input = Integer.parseInt(scanner.nextLine());
//            box.add(input);
//        }
//        System.out.println(box);
        //Задача 3
//        Box<String> box = new Box<>();
//        for (int i = 0; i < n; i++) {
//            String input = scanner.nextLine();
//            box.add(input);
//        }
//        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        int index1 = indexes[0];
//        int index2 = indexes[1];
//        box.swap(index1, index2);
//        System.out.println(box);

        //Задача 4
//        Box<Integer> box = new Box<>();
//        for (int i = 0; i < n; i++) {
//            int input = Integer.parseInt(scanner.nextLine());
//            box.add(input);
//        }
//        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        int index1 = indexes[0];
//        int index2 = indexes[1];
//        box.swap(index1, index2);
//        System.out.println(box);


        //System.out.println("Ivan".compareTo("Ivan"));
        //Задача 5
//        Box<String> box = new Box<>();
//         for (int i = 0; i < n; i++) {
//           String input = scanner.nextLine();
//           box.add(input);
//      }
//         String strToCompare = scanner.nextLine();
//        System.out.println(box.countGreaterValue(strToCompare));

//Задача 6
//        Box<Double> box = new Box<>();
//        for (int i = 0; i < n; i++) {
//           Double input = Double.parseDouble(scanner.nextLine());
//           box.add(input);
//      }
//        Double doubleToCompare = Double.parseDouble(scanner.nextLine());
//        System.out.println(box.countGreaterValue(doubleToCompare));
//
//
//Задача 7

        String input = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();
        while (!input.equals("END")){
            String command = input.split(" ")[0];
            switch (command){

            }

        }

    }
}
