package pkg_task3;

public class Ship extends Vehicle {
    int passengers;
    String port;

    public Ship(int passengers, String port) {
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship (" +
               "Passengers: " + passengers + ", " +
               "Port: " + port + ", " +
               "Cost: " + cost + ", " +
               "Speed: " + speed + ", " +
               "Year: " + year + ")";

    }
}
