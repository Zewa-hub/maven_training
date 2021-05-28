package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void op_test() {
        Sample sample = new Sample();

        int a = 1;
        int b = 2;

        Assertions.assertThat(sample.op(Sample.Operation.ADD, a, b))
            .isEqualTo(3);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, a, b))
            .isEqualTo(2);
    }

    @Test
    void fact_throws() {
        Sample sample = new Sample();

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1))
            .withMessage("N should be positive");
    }

    @Test
    void fact_calc() {
        Sample sample = new Sample();

        Assertions.assertThat(sample.fact(3))
            .isEqualTo(6);
    }
}
