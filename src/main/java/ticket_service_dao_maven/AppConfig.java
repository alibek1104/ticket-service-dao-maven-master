package ticket_service_dao_maven;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "ticket_service_dao_maven")
@EnableTransactionManagement
public class AppConfig {
}
