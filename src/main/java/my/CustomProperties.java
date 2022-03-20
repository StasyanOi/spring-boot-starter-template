package my;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.custom")
public class CustomProperties {

    private String property = "custom";

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
