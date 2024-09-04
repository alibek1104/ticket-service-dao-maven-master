package ticket_service_dao_maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ticket_service_dao_maven.Ticket;
import ticket_service_dao_maven.TicketService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/load")
    public List<Ticket> loadTickets() throws IOException {
        return ticketService.loadTickets();
    }
}
