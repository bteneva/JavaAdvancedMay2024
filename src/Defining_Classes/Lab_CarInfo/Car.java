package Defining_Classes.Lab_CarInfo;

public class Car {
    // Fields for Car class
    public String brand;
    public String model;
    public int horsePower;

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for brand
    public String getBrand() {
        return this.brand;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for model
    public String getModel() {
        return this.model;
    }

    // Setter for horsePower
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // Getter for horsePower
    public int getHorsePower() {
        return this.horsePower;
    }

    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsePower());
    }

}
