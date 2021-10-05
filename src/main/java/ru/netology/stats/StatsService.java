package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public int avAmountSalesMonth(int[] sales) {
        return salesAmount(sales) / sales.length;
    }

    public int monthNumberMaximumSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int monthNumberMinimumSales(int[] sales) {
        int minMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int numbMonthSalesBelowAverage(int[] sales) {
        int averageAmount = avAmountSalesMonth(sales);
        int numberMonthsBelow = 0;
        for (int sale : sales) {
            if (averageAmount > sale) {
                numberMonthsBelow += 1;
            }
        }
        return numberMonthsBelow;
    }

    public int numbMonthsSalesAboveAverage(int[] sales) {
        int averageAmount = avAmountSalesMonth(sales);
        int numberMonthsAbove = 0;
        for (int sale : sales) {
            if (averageAmount < sale) {
                numberMonthsAbove += 1;
            }
        }
        return numberMonthsAbove;
    }
}