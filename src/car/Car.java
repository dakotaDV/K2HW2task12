package car;

public class Car {

    String brand;
    String model;
    String engineVolume;
    String color;
    String productionYear;
    String productionCountry;

    public Car(String brand,  String model, String engineVolume, String color, String productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this. productionCountry =  productionCountry;
    }
    public void  specifications(){
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, " + "сборка  " + productionCountry + ", " + color + " цвета, " + "объем двигателя - " + engineVolume + " л.");
    }
}


