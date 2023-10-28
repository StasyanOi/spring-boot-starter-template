package test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CustomProperties.class)
public class CustomAutoConfiguration {

    private final CustomProperties customProperties;

    public CustomAutoConfiguration(CustomProperties customProperties) {
        this.customProperties = customProperties;
    }

    @Bean
    public String customBean() {
        return customProperties.getProperty();
    }
}
