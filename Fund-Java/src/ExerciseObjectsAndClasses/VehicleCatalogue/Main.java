package ExerciseObjectsAndClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        String input = scanner.nextLine();
        int counter = 1;

        while (!input.equals("End")) {
            if (counter >= 50) {
                break;
            }
            String typeOfVehicle = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            double horsepower = Double.parseDouble(input.split(" ")[3]);

            Vehicle currentVehicle = new Vehicle(typeOfVehicle, model, color, horsepower);
            vehicleList.add(currentVehicle);
            counter++;
            input = scanner.nextLine();
        }
        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            for(Vehicle item : vehicleList) {
                if (item.getModel().equals(model)) {
                    item.toString();
                }
            }
            model = scanner.nextLine();
        }

        double sumCars = 0;
        double sumTrucks = 0;
        int cars = 0;
        int trucks = 0;
        for (Vehicle item : vehicleList) {
            if (item.getTypeOfVehicle().equals("cars")) {
                sumCars += item.getHorsepower();
                cars++;
            } else {
                sumTrucks += item.getHorsepower();
                trucks++;
            }
        }
        sumCars /= cars;
        sumTrucks /= trucks;

        System.out.printf("Cars have average horsepower of %.2f.%n", sumCars);
        System.out.printf("Trucks have average horsepower of %.2f.%n", sumTrucks);
    }
}
