package ru.netology.stats;


public class StatisticCalculator {

    public long summAllSales(long[] sales) {
        long summSales = 0;
        for (long s : sales) {
            summSales = summSales + s;
        }
        return summSales;
    }

    public long averageAllSales(long[] sales) {
        long summSales = 0;
        long averageSales = 0;
        for (long s : sales) {
            summSales = summSales + s;
            averageSales = summSales / sales.length;
        }
        return averageSales;
    }

    public int getMaxSales(long[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    public int getMinSales(long[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int quantityMonthLowerAverageSales(long[] sales) {
        long summSales = 0;
        long averageSales = 0;
        int salesLowerAverageSales = 0;
        for (long s : sales) {
            summSales = summSales + s;
            averageSales = summSales / sales.length;
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                salesLowerAverageSales = salesLowerAverageSales + 1;
            }
        }
        return salesLowerAverageSales;
    }

    public int quantityMonthHigherAverageSales(long[] sales) {
        long summSales = 0;
        long averageSales = 0;
        int salesHigherAverageSales = 0;
        for (long s : sales) {
            summSales = summSales + s;
            averageSales = summSales / sales.length;
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                salesHigherAverageSales = salesHigherAverageSales + 1;
            }
        }
        return salesHigherAverageSales;
    }
}
