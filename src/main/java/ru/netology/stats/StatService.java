package ru.netology.stats;

public class StatService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMonthBelow(int[] sales) {
        int monthBelow = 0;
        int month = 15;
        for (long sale : sales) {
            if (sale < month) {
                monthBelow = monthBelow + 1;
            }
        }
        return monthBelow;
    }

    public int findMonthAbove(int[] sales) {
        int monthAbove = 0;
        int month = 15;
        for (long sale : sales) {
            if (sale > month) {
                monthAbove = monthAbove + 1;
            }
        }
        return monthAbove;
    }

}




