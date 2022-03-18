package Car;

public class Car {
    String carType;
    String color;
    String fuelType;
    int engineCapacity;
    int enginePower;

    public Car (String carType, String color, int engineCapacity, String fuelType, int enginePower){
        this.carType = carType;
        this.color = color;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
    }

    public String toString(){
        String detailsCar = "Car model - " + carType + ", Color - " + color + ", " +
                "Fuel Type - " + fuelType + ", Engine Capacity - " + engineCapacity + " ml" +
                ", Engine power - " + enginePower + " hp";
        return detailsCar;

    }
}
