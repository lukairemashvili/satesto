
public class Main {
    public static void main(String[] args) {
        Car car = new Car(2, 2023, "camaro");
        Motorcycle motorcycle = new Motorcycle(2022, "BMW", true);

        car.displayCarInfo();
        System.out.println();
        motorcycle.displayMotorcycleInfo();
    }
}