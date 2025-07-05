package Enums;

import java.math.BigDecimal;

public enum Coins implements CoinType {
    TWO_EURO(new BigDecimal("2"), "2 Euro"),
    ONE_EURO(new BigDecimal("1"), "1 Euro"),
    FIFTY_CENT(new BigDecimal("0.50"), "0,50 Euro"),
    TWENTY_CENT(new BigDecimal("0.20"), "0,20 Euro"),
    TEN_CENT(new BigDecimal("0.10"), "0,10 Euro"),
    FIVE_CENT(new BigDecimal("0.05"), "0,05 Euro"),
    TWO_CENT(new BigDecimal("0.02"), "0,02 Euro"),
    ONE_CENT(new BigDecimal("0.01"), "0,01 Euro");

    private final BigDecimal value;
    private final String text;

    Coins(BigDecimal value, String text) {
        this.value = value;
        this.text = text;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}