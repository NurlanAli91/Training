package car.com;

public class VWGolf {
    public static void main(String[] args) {


        Car golf = new Car();

        golf.startEngine();
        golf.drive();

        String newColor = golf.color = "green";

        double price = golf.price = 35000.00;

        System.out.println(golf.color);
        System.out.println(golf.getEngine(2.5));
        System.out.println(golf.price);

    }
}