package Homework_4;

public class Car {

    private String firmName;
    private String carModel;
    private int releaseYear;
    private String color;

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFirmName() {
        return firmName;
    }
    public String getCarModel() {
        return carModel;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public String getColor() {
        return color;
    }

    public Car(String firmName) {
        this.firmName = firmName;
    }
    public Car(String firmName, String carModel) {
        this.firmName = firmName;
        this.carModel = carModel;
    }
    public Car(String firmName, String carModel, int releaseYear) {
        this.firmName = firmName;
        this.carModel = carModel;
        this.releaseYear = releaseYear;
    }
    public Car(String firmName, String carModel, int releaseYear, String color) {
        this.firmName = firmName;
        this.carModel = carModel;
        this.releaseYear = releaseYear;
        this.color = color;
    }

    @Override
    public String toString() {
        return firmName+" "+carModel+" released in year "+releaseYear+" with color "+color;
    }
}
