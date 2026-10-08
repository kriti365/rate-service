package com.lab.rate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

/** Real unit test: checks behaviour that should always hold. */
class RateServiceTest {

    private final RateService service = new RateService();

    @Test
    void ratesAreNotEmptyAndAllPositive() {
        var rates = service.getRates();

        assertFalse(rates.isEmpty());
        assertTrue(rates.stream()
                .allMatch(r -> r.nightlyRate().compareTo(BigDecimal.ZERO) > 0));
    }
}
