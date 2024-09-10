package ticket_service_dao_maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@Configuration
public class CustomConfig {

    @Bean
    @ConditionalOnProperty(name = "app.enableCustomBean", havingValue = "true")
    public String thisIsMyFirstConditionalBean() {
        return "This is my first conditional bean!";
    }
}
