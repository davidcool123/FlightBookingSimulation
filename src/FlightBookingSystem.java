import java.time.*;
import java.time.temporal.ChronoUnit;

public class FlightBookingSystem {

    public static void main(String[] args) {
        // TODO 1: Flight Booking Date (LocalDate)
        // - Create a LocalDate object representing the flight booking date (today's date).
        // - Print the booking date.
        // - Simulate a user booking a flight for a specific future date (e.g., 2024-12-15).
        // - Print the flight booking date and the days until the flight.
        LocalDate bookingDate;  // Initialize booking date (today)
        LocalDate flightDate;   // Initialize future flight date
        long daysUntilFlight;   // Calculate days between booking and flight

        // TODO 2: Flight Time (LocalTime)
        // - Create a LocalTime object for the flight departure time (e.g., 14:30).
        // - Print the departure time.
        // - Simulate the flight duration (e.g., 5 hours and 45 minutes) and calculate the arrival time.
        // - Print the arrival time.
        LocalTime departureTime;
        LocalTime arrivalTime;
        Duration flightDuration;

        // TODO 3: Full Flight Schedule (LocalDateTime)
        // - Create a LocalDateTime object for the full flight schedule (departure date and time).
        // - Print the departure date and time.
        // - Calculate the flight's estimated arrival date and time.
        LocalDateTime departureDateTime;
        LocalDateTime arrivalDateTime;

        // TODO 4: Instant for Exact Flight Event
        // - Create an Instant object for the exact moment of takeoff (current UTC time).
        // - Print the flight takeoff moment in UTC.
        // - Simulate a delay of 10 minutes and print the updated takeoff time.
        Instant takeoffInstant;
        Instant updatedTakeoffInstant;

        // TODO 5: Flight Layover Period (Period)
        // - Create a Period representing a layover between connecting flights (e.g., 1 day layover).
        // - Add this layover to the arrival date-time of the first flight to get the departure date-time of the next flight.
        Period layoverPeriod;
        LocalDateTime nextFlightDeparture;

        // TODO 6: Flight Duration (Duration)
        // - Create a Duration representing the total flight time (e.g., 8 hours).
        // - Print the flight duration.
        // - Calculate the total travel time, including the layover period.
        Duration totalFlightDuration;
        Duration totalTravelTime;

        // TODO 7: Time Zones for International Flights (ZonedDateTime)
        // - Get the ZoneId for the departure airport (e.g., "America/New_York").
        // - Get the ZoneId for the destination airport (e.g., "Europe/Paris").
        // - Create ZonedDateTime objects for the departure and arrival times at the respective airports.
        // - Print the departure time in the departure time zone and the arrival time in the destination time zone.
        ZoneId departureZone;
        ZoneId arrivalZone;
        ZonedDateTime zonedDepartureTime;
        ZonedDateTime zonedArrivalTime;

        // TODO 8: Time Between Flights (ChronoUnit.between)
        // - Use ChronoUnit to calculate the number of hours between the arrival of one flight and the departure of the next.
        // - Print the number of hours between the flights.
        long hoursBetweenFlights;
    }
}