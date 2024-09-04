package ticket_service_dao_maven;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TicketDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveTicket(Ticket ticket) {
        entityManager.persist(ticket);
    }

    public Ticket getTicketById(int id) {
        return entityManager.find(Ticket.class, id);
    }

    public List<Ticket> getTicketsByUserId(int userId) {
        return entityManager.createQuery("SELECT t FROM Ticket t WHERE t.user.id = :userId", Ticket.class)
                .setParameter("userId", userId)
                .getResultList();
    }

    public void updateTicketType(int ticketId, TicketType newTicketType) {
        Ticket ticket = entityManager.find(Ticket.class, ticketId);
        if (ticket != null) {
            ticket.setTicketType(newTicketType);
            entityManager.merge(ticket);
        }
    }

    public void deleteTicketById(int ticketId) {
        Ticket ticket = entityManager.find(Ticket.class, ticketId);
        if (ticket != null) {
            entityManager.remove(ticket);
        }
    }
}
