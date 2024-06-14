package ru.netology.stats;

public class StatsService {

    public int minMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return ++minMonth;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return ++maxMonth;
    }

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageValue(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int belowAverageValue(long[] sales) {
        int below = 0;
        long average = averageValue(sales);
        for (long sale : sales) {
            if (sale < average) {
                below++;
            }
        }
        return below;
    }

    public int aboveAverageValue(long[] sales) {
        int above = 0;
        long average = averageValue(sales);
        for (long sale : sales) {
            if (sale > average) {
                above++;
            }
        }
        return above;
    }
}
