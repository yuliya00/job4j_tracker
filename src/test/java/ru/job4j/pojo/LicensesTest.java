package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LicensesTest {

    @Test
    public void eqName() {
        Licenses first = new Licenses();
        first.setCode("audio");
        Licenses second = new Licenses();
        second.setCode("audio");
        assertThat(first).isEqualTo(second);
    }
}