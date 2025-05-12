package pm.math.flightrequests.repositories;

import pm.math.flightrequests.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findByFlightNumberAndDepartureDate(String flightNumber, LocalDate departureDate);
}
