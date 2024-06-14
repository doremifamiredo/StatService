package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.calcSum(sales);
        long expected = 180;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.averageValue(sales);
        long expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMinMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.minMonth(sales);
        long expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMaxMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.maxMonth(sales);
        long expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testBelowAverageValue() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.belowAverageValue(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testAboveAverageValue() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.aboveAverageValue(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);

    }
}