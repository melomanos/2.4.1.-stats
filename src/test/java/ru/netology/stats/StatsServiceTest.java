package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.calculateSum(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.calculateAverageSum(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.calculateMaxSales(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.calculateMinSales(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUnderAverageSumSales() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.calculateUnderAverageSumSales(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateOverAverageSumSales() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.calculateOverAverageSumSales(salesByMonth);

        assertEquals(expected, actual);
    }
}