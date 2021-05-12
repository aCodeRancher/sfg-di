package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@EnableConfigurationProperties(TestConfiguration.class)
@Configuration
public class MyConfiguration {

    @Bean
     FakeDataSource testDataSource(TestConfiguration testConfig){
        FakeDataSource testDataSource = new FakeDataSource();
        testDataSource.setUsername(testConfig.getUsername());
        testDataSource.setPassword(testConfig.getPassword());
        testDataSource.setJdbcurl(testConfig.getJdbcurl());
        return testDataSource;
    }
}
