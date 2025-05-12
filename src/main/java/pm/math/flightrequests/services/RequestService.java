package pm.math.flightrequests.services;


import pm.math.flightrequests.model.Request;
import pm.math.flightrequests.repositories.RequestRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RequestService {
    private final RequestRepository repository;

    public RequestService(RequestRepository repository) {
        this.repository = repository;
    }

    public Request add(Request request) {
        return repository.save(request);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Request> findAll() {
        return repository.findAll();
    }

    public List<Request> findByFlightAndDate(String flightNumber, LocalDate departureDate) {
        return repository.findByFlightNumberAndDepartureDate(flightNumber, departureDate);
    }
}
