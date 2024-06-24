package Classes.Exercises.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4
        //Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1
        //"{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType}
        // {Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure}
        // {Tire]’3Age} {Tire4Pressure} {Tire4Age}", where the speed,
        // power, weight and tire age are integers, tire pressure is a double.
        Map<String, List<Car>> carsByCargoType = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Tire> tireList = new ArrayList<>();
            for (int j = 5; j < 12; j+=2) {
                Tire currentTire = new Tire(Double.parseDouble(input[j]), Integer.parseInt(input[j+1]));
                tireList.add(currentTire);
            }
            Car currentCar = new Car(model, engine, cargo, tireList);
            carsByCargoType.putIfAbsent(cargoType, new ArrayList<>());
            carsByCargoType.get(cargoType).add(currentCar);

        }
        String command = scanner.nextLine();
        carsByCargoType.get(command).forEach(car -> car.extract(command));
    }
}
