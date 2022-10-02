package com.operators_loops;

import java.util.Scanner;
import java.math.*;

public class CountCustomersDeposit {
    public static void main(String[] args) {
        System.out.println("Введіть суму вашого вкладу: ");
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextInt();
        System.out.println("Введіть кількість місяців: ");
        Scanner scanner1 = new Scanner(System.in);
        int numberOfMonths = scanner1.nextInt();
        for (int i = 1; i<numberOfMonths;i++){
        sum += (sum * 0.07);
        }
        BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
        BigDecimal bigDecimalSumRounded;
        bigDecimalSumRounded = bigDecimalSum.setScale(2,RoundingMode.HALF_DOWN);
        System.out.println("Через " + numberOfMonths + " місяців ваш вклад буде: " + bigDecimalSumRounded);

    }
}
