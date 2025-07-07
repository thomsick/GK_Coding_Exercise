import euro.Euro;
import euro.EuroSets;


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
        for (Euro euro : EuroSets.ALL_BILLS){
            BigDecimal billValue = euro.value();
            if (rest.compareTo(billValue) >= 0){
                System.out.println(euro.text() + " bills: " + rest.divideToIntegralValue(billValue).intValue());
                rest = rest.remainder(billValue);
            }
        }

        List<Euro> coins;
        if (coinModifierOn){
            coins = EuroSets.NO1NO2_COINS;
        } else {
            coins = EuroSets.ALL_COINS;
        }

        System.out.println("COINS:");
        for (Euro euro : coins){
            BigDecimal coinValue = euro.value();
            if (rest.compareTo(coinValue) >= 0){
                System.out.println(euro.text() + " coins: " + rest.divideToIntegralValue(coinValue).intValue());
                rest = rest.remainder(coinValue);
            }
        }
    }
}