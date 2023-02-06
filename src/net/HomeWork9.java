package net;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лотерея, угадайте как можно больше чисел (max 7) от 0 до 9 . \nВаши числа:");
        int[] lotteryNumbers = new int[7];
        int[] playerNumbers = new int[7];

        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = (int) (Math.random() * 9);
            System.out.print(i + 1 + ": ");
            playerNumbers[i] = scanner.nextInt();
        }
        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumbers);

        int luck = 0;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == playerNumbers[i]) {
                luck++;
            }
        }
        System.out.println(Arrays.toString(lotteryNumbers) + "\n" + Arrays.toString(playerNumbers));
        System.out.println("Количество совпадений: " + luck);
    }
}