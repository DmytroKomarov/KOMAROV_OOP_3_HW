package pkg_task3;

public class Main {
    public static void main(String[] args) {

        Vehicle plane = new Plane(1000, 200);
        plane.setCost(5000000);
        plane.setSpeed(1200);

        Vehicle car = new Car();
        car.setCost(20000);

        Vehicle ship = new Ship(500, "Stambul");
        ship.setCost(500000);
        ship.setSpeed(30);

        System.out.println(plane.toString());
        System.out.println(car.toString());
        System.out.println(ship.toString());

    }
}