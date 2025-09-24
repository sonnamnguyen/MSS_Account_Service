package msn301.fa25.s4.s1accountservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "S1 Account Service API",
                version = "1.0",
                description = "API documentation for S1 Account Service"
        )
)
public class OpenAIConfig {

}
