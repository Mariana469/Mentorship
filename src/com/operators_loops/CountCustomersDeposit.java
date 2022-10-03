package com.operators_loops;

import java.util.Scanner;
import java.math.*;

public class CountCustomersDeposit {

    private static final String ЧЕРЕЗ = "Через ";
    private static final String МІСЯЦІВ_ВАШ_ВКЛАД_БУДЕ = " місяців ваш вклад буде: ";
    private static final String ВВЕДІТЬ_КІЛЬКІСТЬ_МІСЯЦІВ = "Введіть кількість місяців: ";
    private static final String ВВЕДІТЬ_СУМУ_ВАШОГО_ВКЛАДУ = "Введіть суму вашого вкладу: ";

    public static void main(String[] args) {
        System.out.println(ВВЕДІТЬ_СУМУ_ВАШОГО_ВКЛАДУ);
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextInt();
        System.out.println(ВВЕДІТЬ_КІЛЬКІСТЬ_МІСЯЦІВ);
        Scanner scanner1 = new Scanner(System.in);
        int numberOfMonths = scanner1.nextInt();
        for (int i = 1; i<numberOfMonths;i++){
        sum += (sum * 0.07);
        }
        BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
        BigDecimal bigDecimalSumRounded;
        bigDecimalSumRounded = bigDecimalSum.setScale(2,RoundingMode.HALF_DOWN);
        System.out.println(ЧЕРЕЗ + numberOfMonths + МІСЯЦІВ_ВАШ_ВКЛАД_БУДЕ + bigDecimalSumRounded);

    }
}
