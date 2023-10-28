package test.template;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MainConfigurationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAutoConfiguration() {
        Object customBean = applicationContext.getBean("customBean");

        assertThat(customBean).isInstanceOf(String.class).isEqualTo("test_property");
    }
}