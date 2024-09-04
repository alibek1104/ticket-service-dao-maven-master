package ticket_service_dao_maven;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class TicketService {

    private final ObjectMapper objectMapper;

    public TicketService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Ticket> loadTickets() throws IOException {
        Resource resource = new ClassPathResource("tickets.json");
        // Преобразование JSON в список объектов Ticket
        return objectMapper.readValue(resource.getInputStream(), new TypeReference<List<Ticket>>() {});
    }
}
