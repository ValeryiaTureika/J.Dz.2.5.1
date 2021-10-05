package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSalesAmount() {
        StatsService service = new StatsService();

        int[] goodsSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        long actual = service.salesAmount(goodsSale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAvAmountSalesMonth() {
        StatsService service = new StatsService();

        int[] goodsSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        long actual = service.avAmountSalesMonth(goodsSale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthNumberMaximumSales() {
        StatsService service = new StatsService();

        int[] goodsSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        long actual = service.monthNumberMaximumSales(goodsSale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthNumberMinimumSales() {
        StatsService service = new StatsService();

        int[] goodsSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        long actual = service.monthNumberMinimumSales(goodsSale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumbMonthSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] goodsSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.numbMonthSalesBelowAverage(goodsSale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumbMonthsSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] goodsSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.numbMonthsSalesAboveAverage(goodsSale);

        assertEquals(expected, actual);
    }
}