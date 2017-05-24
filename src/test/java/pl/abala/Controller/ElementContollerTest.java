package pl.abala.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by abala on 5/25/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ElementContollerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void getPeriodicTable() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/elements").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"atomicNumber\":1,\"atomicMass\":1.00794,\"symbol\":\"H\",\"name\":\"Hydrogen\"},{\"atomicNumber\":2,\"atomicMass\":4.0026,\"symbol\":\"He\",\"name\":\"Helium\"},{\"atomicNumber\":3,\"atomicMass\":6.941,\"symbol\":\"Li\",\"name\":\"Lithium\"},{\"atomicNumber\":5,\"atomicMass\":10.811,\"symbol\":\"B\",\"name\":\"Boron\"},{\"atomicNumber\":6,\"atomicMass\":12.011,\"symbol\":\"C\",\"name\":\"Carbon\"},{\"atomicNumber\":7,\"atomicMass\":14.0067,\"symbol\":\"N\",\"name\":\"Nitrogen\"},{\"atomicNumber\":8,\"atomicMass\":15.9994,\"symbol\":\"O\",\"name\":\"Oxygen\"},{\"atomicNumber\":9,\"atomicMass\":18.9984,\"symbol\":\"F\",\"name\":\"Fluorine\"},{\"atomicNumber\":10,\"atomicMass\":20.1797,\"symbol\":\"Ne\",\"name\":\"Neon\"},{\"atomicNumber\":11,\"atomicMass\":22.98977,\"symbol\":\"Na\",\"name\":\"Sodium\"},{\"atomicNumber\":12,\"atomicMass\":24.305,\"symbol\":\"Mg\",\"name\":\"Magnesium\"},{\"atomicNumber\":13,\"atomicMass\":26.98154,\"symbol\":\"Al\",\"name\":\"Aluminum\"},{\"atomicNumber\":14,\"atomicMass\":28.0855,\"symbol\":\"Si\",\"name\":\"Silicon\"},{\"atomicNumber\":15,\"atomicMass\":30.97376,\"symbol\":\"P\",\"name\":\"Phosphorus\"},{\"atomicNumber\":16,\"atomicMass\":32.066,\"symbol\":\"S\",\"name\":\"Sulfur\"},{\"atomicNumber\":17,\"atomicMass\":35.4527,\"symbol\":\"Cl\",\"name\":\"Chlorine\"},{\"atomicNumber\":18,\"atomicMass\":39.948,\"symbol\":\"Ar\",\"name\":\"Argon\"},{\"atomicNumber\":19,\"atomicMass\":39.0983,\"symbol\":\"K\",\"name\":\"Potassium\"},{\"atomicNumber\":20,\"atomicMass\":40.078,\"symbol\":\"Ca\",\"name\":\"Calcium\"},{\"atomicNumber\":21,\"atomicMass\":44.9559,\"symbol\":\"Sc\",\"name\":\"Scandium\"},{\"atomicNumber\":22,\"atomicMass\":47.88,\"symbol\":\"Ti\",\"name\":\"Titanium\"},{\"atomicNumber\":23,\"atomicMass\":50.9415,\"symbol\":\"V\",\"name\":\"Vanadium\"},{\"atomicNumber\":24,\"atomicMass\":51.996,\"symbol\":\"Cr\",\"name\":\"Chromium\"},{\"atomicNumber\":25,\"atomicMass\":54.938,\"symbol\":\"Mn\",\"name\":\"Manganese\"},{\"atomicNumber\":26,\"atomicMass\":55.847,\"symbol\":\"Fe\",\"name\":\"Iron\"},{\"atomicNumber\":27,\"atomicMass\":58.9332,\"symbol\":\"Co\",\"name\":\"Cobalt\"},{\"atomicNumber\":28,\"atomicMass\":58.6934,\"symbol\":\"Ni\",\"name\":\"Nickel\"},{\"atomicNumber\":29,\"atomicMass\":63.546,\"symbol\":\"Cu\",\"name\":\"Copper\"},{\"atomicNumber\":30,\"atomicMass\":65.39,\"symbol\":\"Zn\",\"name\":\"Zinc\"},{\"atomicNumber\":31,\"atomicMass\":69.723,\"symbol\":\"Ga\",\"name\":\"Gallium\"},{\"atomicNumber\":32,\"atomicMass\":72.61,\"symbol\":\"Ge\",\"name\":\"Germanium\"}]")));
    }
}