package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Конвертер одиниць температури");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть градуси в Фаренгейтах: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f Фаренгейт це %.2f Цельсій%n", fahrenheit, celsius);
        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
