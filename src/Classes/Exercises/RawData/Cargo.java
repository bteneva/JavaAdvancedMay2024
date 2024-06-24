package Classes.Exercises.RawData;

public class Cargo {
    private int cargoWeight;
    private String cargoType;

    public Cargo(int cargoWeight, String cargoType){
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public void setWeigth(int weight){
        this.cargoWeight = weight;
    }

    public int getWeight(){
        return this.cargoWeight;
    }

}
