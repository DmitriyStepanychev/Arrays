package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatisticCalculatorTest {

    @Test
    public void summAllSales() {
        StatisticCalculator service = new StatisticCalculator();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.summAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAllSales() {
        StatisticCalculator service = new StatisticCalculator();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSales() {
        StatisticCalculator service = new StatisticCalculator();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinSales() {
        StatisticCalculator service = new StatisticCalculator();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.getMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityMonthLowerAverageSales() {
        StatisticCalculator service = new StatisticCalculator();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.quantityMonthLowerAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityMonthHigherAverageSales() {
        StatisticCalculator service = new StatisticCalculator();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.quantityMonthHigherAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}