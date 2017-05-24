package pl.abala;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.abala.Controller.HomeController;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by abala on 5/25/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {
    @Autowired
    private HomeController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}