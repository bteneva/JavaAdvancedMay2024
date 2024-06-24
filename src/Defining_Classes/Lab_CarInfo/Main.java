package Defining_Classes.Lab_CarInfo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Car myCar = new Car();

        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String brand = input[0];
            String model = input[1];
            int horsePower = Integer.parseInt(input[2]);
            myCar.setBrand(brand);
            myCar.setModel(model);
            myCar.setHorsePower(horsePower);
            System.out.println(myCar.carInfo());
        }




    }
}
