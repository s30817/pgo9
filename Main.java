// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car=new Car("Honda","Civic",2012,152000,24000);
        Truck truck=new Truck("Volvo","FE",2024,200000,56000,8000);

        car.displayInfo();
        truck.displayInfo();
    }
}