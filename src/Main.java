public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW(
                4,
                250,
                "Black",
                "V14"
        );
        bmw.speed();

        Audi audi = new Audi(
                4,
                250,
                "White",
                "V7"
                );
        audi.speed();

        Audi audi1 = new Audi(
                4,
                250,
                "GRAY",
                "V5"
        );
        audi1.speed();

        System.out.println(bmw.getEngine());
        System.out.println(bmw.getMaxSpeed());
        System.out.println(bmw.getWheels());
        System.out.println(bmw.getColor());

        System.out.println(audi.getEngine());
        System.out.println(audi.getMaxSpeed());
        System.out.println(audi.getWheels());
        System.out.println(audi.getColor());

        System.out.println(audi1.getEngine());
        System.out.println(audi1.getMaxSpeed());
        System.out.println(audi1.getWheels());
        System.out.println(audi1.getColor());
    }
}