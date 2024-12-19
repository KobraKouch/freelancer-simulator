package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int restMonths = 0; // Количество месяцев отдыха
        int money = 0;      // Накопленные деньги

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                // Если денег достаточно для отдыха
                restMonths++;
                money -= expenses; // Тратим на расходы
                money -= money / 3; // Тратим треть остатка
                System.out.println("Month " + month + ": Resting. Money = " + money + ", Rest months = " + restMonths);
            } else {
                // Работаем, если денег недостаточно
                money += income;  // Получаем доход
                money -= expenses; // Тратим на расходы
                System.out.println("Month " + month + ": Working. Money = " + money + ", Rest months = " + restMonths);
            }

            // Если деньги ушли в минус, обнуляем их
            if (money < 0) {
                money = 0;
            }
        }

        return restMonths;
    }
}