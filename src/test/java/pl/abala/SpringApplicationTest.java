package pl.abala;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SpringApplicationTest {
    @Mock
    private SpringApplication springApplication;

    @Test
    public void runSpringApplication() throws Exception {
        //SpringApplication.run( InitialFileBatchApplication.class, args);
        String[] args = {""};
        SpringApplication.run(PeriodicTableApplication.class, args);
        assertThat(springApplication).isNotNull();
    }
}