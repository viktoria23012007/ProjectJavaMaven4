package ru.netology.stats;

public class StatsService {

    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageSales(long[] sales) {
        long avg = calculateSumSales(sales) / sales.length;
        return avg;
    }

    public int findMaxSalesMonth(long[] sales) {
        int month = 0; // индекс рассматриваемого месяца в массиве
        int maxMonth = 0; // индекс месяца с максимальными продажами в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int findMinSalesMonth(long[] sales) {
        int month = 0; // индекс рассматриваемого месяца в массиве
        int minMonth = 0; // индекс месяца с минимальными продажами в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int countSalesBelowAvgMonths(long[] sales) {
        int months = 0; // счетчик месяцев
        long avg = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale < avg) {
                months++;
            }
        }
        return months;
    }

    public int countSalesAboveAvgMonths(long[] sales) {
        int months = 0; // счетчик месяцев
        long avg = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale > avg) {
                months++;
            }
        }
        return months;
    }
}
