package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {

    @Test
    void testExampleOne() {
        FreelanceService service = new FreelanceService();
        int income = 10_000;       // Доход
        int expenses = 3_000;      // Расходы
        int threshold = 20_000;    // Порог для отдыха
        int expected = 3;          // Ожидаемый результат
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual, "Failed for testExampleOne");
    }

    @Test
    void testExampleTwo() {
        FreelanceService service = new FreelanceService();
        int income = 100_000;      // Доход
        int expenses = 60_000;     // Расходы
        int threshold = 150_000;   // Порог для отдыха
        int expected = 2;          // Ожидаемый результат
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual, "Failed for testExampleTwo");
    }
}