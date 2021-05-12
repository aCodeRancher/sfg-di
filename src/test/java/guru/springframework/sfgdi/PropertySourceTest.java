package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.MyConfiguration;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
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
