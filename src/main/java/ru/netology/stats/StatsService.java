package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public int calculateAverageSum(int[] sales) {
        int averageSum = calculateSum(sales) / 12;

        return averageSum;
    }

    public int calculateMaxSales(int[] sales) {
        int max = 0;
        for (int sale : sales) {
            if (sale >= max) {
                max = sale;
            }
        }

        int index = 0;
        for (int i = 0; i < sales.length; i++) {
            Integer sale = sales[i];
            if (sale.equals(max)) {
                index = i;
            }
        }

        return index + 1;
    }

    public int calculateMinSales(int[] sales) {
        int min = 10000;
        for (int sale : sales) {
            if (sale <= min) {
                min = sale;
            }
        }

        int index = 0;
        for (int i = 0; i < sales.length; i++) {
            Integer sale = sales[i];
            if (sale.equals(min)) {
                index = i;
            }
        }

        return index + 1;
    }

    public int calculateUnderAverageSumSales(int[] sales) {
        int averageSum = calculateAverageSum(sales);
        int underAverageSumQuantityMonth = 0;

        for (int sale : sales) {
            if (sale < averageSum) {
                underAverageSumQuantityMonth += 1;
            }
        }

        return underAverageSumQuantityMonth;
    }

    public int calculateOverAverageSumSales(int[] sales) {
        int averageSum = calculateAverageSum(sales);
        int overAverageSumQuantityMonth = 0;

        for (int sale : sales) {
            if (sale > averageSum) {
                overAverageSumQuantityMonth += 1;
            }
        }

        return overAverageSumQuantityMonth;
    }
}
