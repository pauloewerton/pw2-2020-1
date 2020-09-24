package br.edu.ifpb;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class CoffeeExpertTest {
    private static final CoffeeExpert expert = new CoffeeExpert();

    @Test
    public void getBrandsTest() {
        String intensity = "medium";
        List<String> result = this.expert.getBrands(intensity);

        Assertions.assertEquals(2, result.size());
    }
}
