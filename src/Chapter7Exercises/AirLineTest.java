package Chapter7Exercises;

public class AirLineTest {
    public static void main(String[] args) {
        AirLineSimulation airline = new AirLineSimulation();
        airline.setInitialValuesOfSeatingChart();
        for (int i = 0; i < 5; i++) {
            airline.displayInitialMessage();
            airline.setSeatingPosition();
            System.out.println(airline.getSeatingChart());
        }

        airline.setSeatIfAParticularClassIsFull();
        System.out.println(airline.getSeatingChart());

    }
}
