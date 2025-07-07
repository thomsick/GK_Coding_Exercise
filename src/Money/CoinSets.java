package Money;

import java.math.BigDecimal;
import java.util.List;

public final class CoinSets {
    public static final Coin TWO_EURO = new Coin(new BigDecimal("2"), "2 Euro");
    public static final Coin ONE_EURO = new Coin(new BigDecimal("1"), "1 Euro");
    public static final Coin FIFTY_CENT = new Coin(new BigDecimal("0.50"), "0,50 Euro");
    public static final Coin TWENTY_CENT = new Coin(new BigDecimal("0.20"), "0,20 Euro");
    public static final Coin TEN_CENT = new Coin(new BigDecimal("0.10"), "0,10 Euro");
    public static final Coin FIVE_CENT = new Coin(new BigDecimal("0.05"), "0,05 Euro");
    public static final Coin TWO_CENT = new Coin(new BigDecimal("0.02"), "0,02 Euro");
    public static final Coin ONE_CENT = new Coin(new BigDecimal("0.01"), "0,01 Euro");

    public static final List<Coin> ALL_COINS = List.of(
            TWO_EURO, ONE_EURO, FIFTY_CENT, TWENTY_CENT,
            TEN_CENT, FIVE_CENT, TWO_CENT, ONE_CENT
    );

    public static final List<Coin> MODIFIED_COINS = List.of(
            TWO_EURO, ONE_EURO, FIFTY_CENT, TWENTY_CENT,
            TEN_CENT, FIVE_CENT
    );
}
