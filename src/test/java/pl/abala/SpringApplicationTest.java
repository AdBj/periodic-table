package pl.abala;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringApplicationTest {
    @Mock
    private PeriodicTableApplication periodicTableApplication;

    @Test
    public void runPeriodicTableApplication() throws Exception {
        String[] args = {""};
        periodicTableApplication.main(args);
        assertThat(periodicTableApplication).isNotNull();
    }
}