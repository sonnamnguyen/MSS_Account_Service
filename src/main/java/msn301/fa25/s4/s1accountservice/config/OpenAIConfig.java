package msn301.fa25.s4.s1accountservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "S1 Account Service API",
                version = "1.0",
                description = "API documentation for S1 Account Service"
        ),
        servers = {
                @Server(url = "https://mssaccountservice-production.up.railway.app")
        }
)
public class OpenAIConfig {
        @Bean
        public WebMvcConfigurer corsConfigurer() {
                return new WebMvcConfigurer() {
                        @Override
                        public void addCorsMappings(CorsRegistry registry) {
                                registry.addMapping("/**")
                                        .allowedOrigins("https://mssaccountservice-production.up.railway.app")
                                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                                        .allowedHeaders("*");
                        }
                };
        }
}