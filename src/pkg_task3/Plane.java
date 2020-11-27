package pkg_task3;

public class Plane extends Vehicle {
    double height;
    int passengers;

    public Plane(double height, int passengers) {
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane (" +
               "Height: " + height + ", " +
               "Passengers: " + passengers + ", " +
               "Cost: " + cost + ", " +
               "Speed: " + speed + ", " +
               "Year: " + year + ")";

    }
}
