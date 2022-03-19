package car.com;

public class Car {

//    double engine = 2.5;
//    int seats = 4;
//    int wheel = 4;
//    String color = "red";
//    double price = 35000;
//    String interior = "white";
//    boolean isElectric = false;
//    String model = "Golf";
//    String make = "VW";

    double engine;
    int seats;
    int wheel;
    String color;
    double price;
    String interior;
    boolean isElectric;
    String model;
    String make;


            public double getEngine(double engine){
        engine = engine;
        return engine;
            }

    public void drive(){
        System.out.println(make + " " + model + " is driving");
    }

    public void startEngine(){
        System.out.println(make + " " + model + " start engine");
    }

    public void stopEngine(){
        System.out.println(make + " " + model + " stop engine");
    }

    public void brokeDown(){
        System.out.println(make + " " + model + " is broke down");
    }

    public void honk(){
        System.out.println(make + " " + model + " is beep beep");
    }

}
