package ru.work.workcaraccident;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.work.workcaraccident.model.Accident;
import ru.work.workcaraccident.model.AccidentType;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MainTests {

    @Test
    void contextLoads() {
        AccidentType accidentType = new AccidentType(1, "type");
        assertThat(accidentType.getId()).isEqualTo(1);
    }

}
