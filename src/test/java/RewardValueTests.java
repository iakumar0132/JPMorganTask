import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void testCashToMilesConversion() {
        double cashValue=100;
        double expectedMiles = 5.0;
        double actualMiles = cashValue/20;
        assertEquals(expectedMiles, actualMiles, 0.01);
    }


    @Test
    void testMilesToCashConversion() {
        int milesValue = 10000;
        double expectedCash = 1000.0;
        double actualCash = milesValue/20;
        assertEquals(expectedCash, actualCash, 0.01);
    }

}
