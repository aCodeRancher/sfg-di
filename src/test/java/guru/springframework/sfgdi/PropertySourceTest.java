package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.MyConfiguration;
import guru.springframework.sfgdi.config.TestConfiguration;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;


@TestPropertySource(locations="classpath:application-test.yml")
@SpringBootTest
@ContextConfiguration(classes=MyConfiguration.class)
@ActiveProfiles("test")
public class PropertySourceTest {

    @Autowired
    FakeDataSource testDataSource;

    @Test
    public void configIsCorrect(){
        assertTrue(testDataSource.getUsername().equals("YmlTestUserName"));
    }

}
