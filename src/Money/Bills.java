package Money;

import java.math.BigDecimal;

public enum Bills {
    FIVE_HUNDRED(new BigDecimal("500"), "500 Euro"),
    TWO_HUNDRED(new BigDecimal("200"), "200 Euro"),
    HUNDRED(new BigDecimal("100"), "100 Euro"),
    FIFTY(new BigDecimal("50"), "50 Euro"),
    TWENTY(new BigDecimal("20"), "20 Euro"),
    TEN(new BigDecimal("10"), "10 Euro"),
    FIVE(new BigDecimal("5"), "5 Euro");

    private final BigDecimal value;
    private final String text;

    Bills(BigDecimal value, String text) {
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