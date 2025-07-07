package euro;

import java.math.BigDecimal;
import java.util.List;

public final class EuroSets {
    public static final Euro FIVE_HUNDRED = new Euro(new BigDecimal("500"), "500 Euro");
    public static final Euro TWO_HUNDRED = new Euro(new BigDecimal("200"), "200 Euro");
    public static final Euro HUNDRED = new Euro(new BigDecimal("100"), "100 Euro");
    public static final Euro FIFTY = new Euro(new BigDecimal("50"), "50 Euro");
    public static final Euro TWENTY = new Euro(new BigDecimal("20"), "20 Euro");
    public static final Euro TEN = new Euro(new BigDecimal("10"), "10 Euro");
    public static final Euro FIVE = new Euro(new BigDecimal("5"), "5 Euro");

    public static final Euro TWO_EURO = new Euro(new BigDecimal("2"), "2 Euro");
    public static final Euro ONE_EURO = new Euro(new BigDecimal("1"), "1 Euro");
    public static final Euro FIFTY_CENT = new Euro(new BigDecimal("0.50"), "0,50 Euro");
    public static final Euro TWENTY_CENT = new Euro(new BigDecimal("0.20"), "0,20 Euro");
    public static final Euro TEN_CENT = new Euro(new BigDecimal("0.10"), "0,10 Euro");
    public static final Euro FIVE_CENT = new Euro(new BigDecimal("0.05"), "0,05 Euro");
    public static final Euro TWO_CENT = new Euro(new BigDecimal("0.02"), "0,02 Euro");
    public static final Euro ONE_CENT = new Euro(new BigDecimal("0.01"), "0,01 Euro");

    public static final List<Euro> ALL_BILLS = List.of(
            FIVE_HUNDRED, TWO_HUNDRED, HUNDRED, FIFTY, TWENTY, TEN, FIVE
    );

    public static final List<Euro> ALL_COINS = List.of(
            TWO_EURO, ONE_EURO, FIFTY_CENT, TWENTY_CENT,
            TEN_CENT, FIVE_CENT, TWO_CENT, ONE_CENT
    );

    public static final List<Euro> NO1NO2_COINS = List.of(
            TWO_EURO, ONE_EURO, FIFTY_CENT, TWENTY_CENT,
            TEN_CENT, FIVE_CENT
    );
}
