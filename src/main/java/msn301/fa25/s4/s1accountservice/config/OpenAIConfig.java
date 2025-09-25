package msn301.fa25.s4.s1accountservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
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