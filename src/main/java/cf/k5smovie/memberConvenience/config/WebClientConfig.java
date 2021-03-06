package cf.k5smovie.memberConvenience.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${msa.auth}")
    String authServerUrl;

    @Bean
    public WebClient webClient(){
        return WebClient.builder().baseUrl(authServerUrl).build();
    }
}
