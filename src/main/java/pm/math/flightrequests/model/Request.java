package pm.math.flightrequests.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destination;
    private String departure;         // нове поле
    private String flightNumber;
    private String passengerName;
    private LocalDate departureDate;
    private String flightDuration;    // нове поле
    private String aircraftType;      // нове поле


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getDeparture() { return departure; }
    public void setDeparture(String departure) { this.departure = departure; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public LocalDate getDepartureDate() { return departureDate; }
    public void setDepartureDate(LocalDate departureDate) { this.departureDate = departureDate; }

    public String getFlightDuration() { return flightDuration; }
    public void setFlightDuration(String flightDuration) { this.flightDuration = flightDuration; }

    public String getAircraftType() { return aircraftType; }
    public void setAircraftType(String aircraftType) { this.aircraftType = aircraftType; }
}
