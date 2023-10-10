public final class Audi extends BMW {
    int wheels;
    int maxSpeed;

    @Override
    public void speed() {
        System.out.println("CAR");
    }

    public Audi(int wheels, int speed, String color, String engine) {
        super(wheels, speed, color, engine);
    }

    String color;
    String engine;
}
