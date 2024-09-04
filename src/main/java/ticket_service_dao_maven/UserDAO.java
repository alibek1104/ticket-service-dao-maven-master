package ticket_service_dao_maven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserDAO {

    @PersistenceContext
    private final EntityManager entityManager;

    @Value("${app.enableUserTicketUpdate}")
    private boolean enableUserTicketUpdate;

    public UserDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void updateUserAndCreateTicket(User user, Ticket ticket) {
        if (!enableUserTicketUpdate) {
            throw new IllegalStateException("User and Ticket update is disabled.");
        }

        entityManager.merge(user);
        ticket.setUser(user);
        entityManager.persist(ticket);
    }
}
