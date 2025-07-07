import Money.Bills;
import Money.Coin;
import Money.CoinSets;


import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // input
        String amountToPayInput = "16.09";
        String amountPayedInput = "50";

        System.out.println("STEP1");
        change(amountToPayInput, amountPayedInput);

        System.out.println();

        System.out.println("STEP2");
        change(amountToPayInput, amountPayedInput, true);
    }

    public static void change(String amountToPayInput, String amountPayedInput) {
        change(amountToPayInput, amountPayedInput, false);
    }

    public static void change(String amountToPayInput, String amountPayedInput, boolean coinModifierOn){
        System.out.println("The customer bought items with a total value of");
        System.out.println(amountToPayInput + "€");
        System.out.println();
        System.out.println("The customer pays with " + amountPayedInput + "€");
        System.out.println();

        System.out.println("The cashier has to return to the customer:");

        BigDecimal amountToPay = new BigDecimal(amountToPayInput);
        BigDecimal amountPayed = new BigDecimal(amountPayedInput);
        BigDecimal rest = amountPayed.subtract(amountToPay);

        System.out.println("BILLS:");
        for (Bills bill : Bills.values()){
            BigDecimal billValue = bill.getValue();
            if (rest.compareTo(billValue) >= 0){
                System.out.println(bill.getText() + " bills: " + rest.divideToIntegralValue(billValue).intValue());
                rest = rest.remainder(billValue);
            }
        }

        List<Coin> coins;
        if (coinModifierOn){
            coins = CoinSets.ALL_COINS;
        } else {
            coins = CoinSets.MODIFIED_COINS;
        }

        System.out.println("COINS:");
        for (Coin coin : coins){
            BigDecimal billValue = coin.value();
            if (rest.compareTo(billValue) >= 0){
                System.out.println(coin.text() + " coins: " + rest.divideToIntegralValue(billValue).intValue());
                rest = rest.remainder(billValue);
            }
        }
    }
}