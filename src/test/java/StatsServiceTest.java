package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.calculateSumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.findMaxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.findMinSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSalesBelowAvgMonths() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.countSalesBelowAvgMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSalesAboveAvgMonths() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.countSalesAboveAvgMonths(sales);
        assertEquals(expected, actual);
    }
}
