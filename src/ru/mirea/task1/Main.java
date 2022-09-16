package ru.mirea.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        workWithArray();
//test
    }
    public static void workWithArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Задание 1\nКоличество элементов массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        float mean = sum / arr.length;
        System.out.println("Сумма всех элементов: " + sum + "\nСреднее значение: " + mean);
    }
}
