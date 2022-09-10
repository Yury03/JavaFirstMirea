package ru.mirea.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 1\nВведите количество элементов массива ");
        int n = in.nextInt();
        System.out.println("Введите вариант суммирования (1-for; 2-while; 3-do while)");
        int var = in.nextInt();
        int n2 = n;
        int[] arr = new int[n];
        System.out.println("Введите элементы массива ");
        for(int i = 0; i < n; i += 1){
            arr[i]=in.nextInt();
        }
        int sum = 0;
        switch (var){
            case 1:
                for (int i = 0; i<n; i++){
                    sum += arr[i];
                }
                break;
            case 2:
                while(n2>0){
                    n2--;
                    sum +=arr[n2];
                }
                break;
            case 3:
                do{
                    n2--;
                    sum +=arr[n2];
                }while (n2>0);
            default:
                break;
        }
        System.out.println(sum);
        in.close();
    }
}
