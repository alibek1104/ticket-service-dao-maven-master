package ticket_service_dao_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ticket_service_dao_maven")
public class TicketServiceDaoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketServiceDaoMavenApplication.class, args);
	}
}
