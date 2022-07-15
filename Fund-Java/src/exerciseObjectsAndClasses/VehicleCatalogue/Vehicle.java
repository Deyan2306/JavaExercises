package exerciseObjectsAndClasses.VehicleCatalogue;

public class Vehicle {
    private String typeOfVehicle;
    private String model;
    private String color;
    private double horsepower;

    public Vehicle (String typeOfVehicle, String model, String color, double horsepower){
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f",
                typeOfVehicle, model, color, horsepower);
    }
}
