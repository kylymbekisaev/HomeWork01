public class Car {
    int wheels;
    int maxSpeed;

    public Car() {
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public Car(int wheels, int speed, String color, String engine) {
        this.wheels = wheels;
        this.maxSpeed = speed;
        this.color = color;
        this.engine = engine;
    }

    String color;
    String engine;
}
