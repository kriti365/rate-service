package com.lab.rate;

import java.math.BigDecimal;

public record Rate(String hotelId, String currency, BigDecimal nightlyRate) {
}
