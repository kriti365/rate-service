package com.lab.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * FAILURE DRILL TEST - intentionally brittle.
 *
 * It pins exact values, so a tiny change breaks the build. Use it to practise
 * pipeline failure handling (Jenkins test stage, SonarQube gate, rollback).
 *
 * Ways to break it:
 *   - change RateService.DEFAULT_CURRENCY from "USD" to anything else
 *   - add or remove a Rate in RateService.getRates()
 *   - change the first rate from 149.00
 * To fix: revert the change (or update the expected values here).
 */
class RateFailureDrillTest {

    private final RateService service = new RateService();

    @Test
    void drill_exactlyThreeRatesInUsdStartingAt149() {
        var rates = service.getRates();

        assertEquals(3, rates.size());
        assertEquals("USD", rates.get(0).currency());
        assertEquals("149.00", rates.get(0).nightlyRate().toPlainString());
    }
}
