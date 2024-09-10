package ticket_service_dao_maven;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {
    List<Ticket> findByUserId(int userId);
}
