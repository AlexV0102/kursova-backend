package pm.math.flightrequests.controllers;

import pm.math.flightrequests.model.Request;
import pm.math.flightrequests.services.RequestService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class RequestController {
    private final RequestService service;

    public RequestController(RequestService service) {
        this.service = service;
    }

    @PostMapping
    public Request add(@RequestBody Request request) {
        return service.add(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<Request> getAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    public List<Request> search(
            @RequestParam String flightNumber,
            @RequestParam String departureDate) {
        return service.findByFlightAndDate(flightNumber, LocalDate.parse(departureDate));
    }
}
