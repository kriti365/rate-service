package com.lab.rate;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RateService {

    public static final String DEFAULT_CURRENCY = "USD";

    public List<Rate> getRates() {
        return List.of(
                new Rate("HLT001", DEFAULT_CURRENCY, new BigDecimal("149.00")),
                new Rate("HLT002", DEFAULT_CURRENCY, new BigDecimal("189.50")),
                new Rate("HLT003", DEFAULT_CURRENCY, new BigDecimal("229.00")));
    }
}
