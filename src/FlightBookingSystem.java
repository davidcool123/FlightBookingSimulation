import java.time.*;
import java.time.temporal.ChronoUnit;

public class FlightBookingSystem {

    public static void main(String[] args) {
        // TODO 1: Flight Booking Date (LocalDate)


        LocalDate bookingDate = LocalDate.now();
        System.out.println("Today is the day is " + bookingDate);

        LocalDate flightDate = LocalDate.of(2024, 12, 15);
        System.out.println("Your booking date is " + flightDate);

        Period daysUntilFLight = Period.between(bookingDate, flightDate);  // Calculate days between booking and flight .
        Long daysUntilFlight2 = ChronoUnit.DAYS.between(bookingDate, flightDate);
        System.out.println("Your flight will be in" + daysUntilFlight2 + "Or in " + daysUntilFLight + "ays");


        // TODO 2: Flight Time (LocalTime)

        LocalTime CurrentTime = LocalTime.of(14, 30);
        LocalTime departureTime = LocalTime.of(15, 0);
        LocalTime arrivalTime = departureTime.plusHours(5).plusMinutes(45);
        Duration flightDuration = Duration.between(departureTime, arrivalTime);
        System.out.println("You arrived at" + arrivalTime + "The flight lasted" + flightDuration);


        // TODO 3: Full Flight Schedule (LocalDateTime)
        // - Create a LocalDateTime object for the full flight schedule (departure date and time).
        // - Print the departure date and time.
        // - Calculate the flight's estimated arrival date and time.
        LocalDateTime departureDateTime = LocalDateTime.of(flightDate, departureTime);
        LocalDateTime arrivalDataTime = departureDateTime = departureDateTime.plus(flightDuration);
        System.out.println("Departure at:" + departureDateTime);
        System.out.println("Arriving at:" + arrivalDataTime);
        System.out.println();

    }
}