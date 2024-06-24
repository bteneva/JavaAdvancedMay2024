package ExamPreparation1306;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OffroadChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> initialFuel = new ArrayDeque<>(); // LIFO stack
        ArrayDeque<Integer> additionalConsumption = new ArrayDeque<>(); // FIFO queue
        ArrayDeque<Integer> amountFuelNeeded = new ArrayDeque<>(); // FIFO queue
        List<Integer> reachedAltitudesList = new ArrayList<>();

        int[] inputFuel = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int fuel : inputFuel) {
            initialFuel.push(fuel);
        }

        int[] additionalConsum = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int consumption : additionalConsum) {
            additionalConsumption.offer(consumption);
        }

        int[] fuelNeeded = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int altitudes = 0;
        for (int fuelNeed : fuelNeeded) {
            amountFuelNeeded.offer(fuelNeed);
            altitudes++;
        }

        int reachedAltitudeCount = 0;

        while (!initialFuel.isEmpty() && !additionalConsumption.isEmpty() && !amountFuelNeeded.isEmpty()) {
            if ((initialFuel.peek() - additionalConsumption.peek()) >= amountFuelNeeded.peek()) {
                initialFuel.pop();
                additionalConsumption.poll();
                amountFuelNeeded.poll();
                reachedAltitudeCount++;
                System.out.printf("John has reached: Altitude %d%n", reachedAltitudeCount);
                reachedAltitudesList.add(reachedAltitudeCount);
            } else {
                System.out.printf("John did not reach: Altitude %d%n", reachedAltitudeCount+1);
                break;
            }
        }

        if (altitudes == reachedAltitudeCount) {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        } else {
            System.out.println("John failed to reach the top.");
            if (reachedAltitudeCount == 0) {
                System.out.println("John didn't reach any altitude.");
            } else {
                System.out.print("Reached altitudes: ");
                String reachedAltitudes = reachedAltitudesList.stream()
                        .map(altitude -> "Altitude " + altitude)
                        .collect(Collectors.joining(", "));
                System.out.println(reachedAltitudes);
            }
        }
    }
}
