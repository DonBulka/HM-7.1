package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSum = service.sum(sales);
        long expectedSum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualAverage = service.average(sales);
        long expectedAverage = 15;
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualMaxSales = service.maxSales(sales);
        long expectedMaxSales = 8;
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualMinSales = service.minSales(sales);
        long expectedMinSales = 9;
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void testBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualBelowAverage = service.belowAverage(sales);
        long expectedBelowAverage = 5;
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void testAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualAboveAverage = service.aboveAverage(sales);
        long expectedAboveAverage = 5;
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }

}
