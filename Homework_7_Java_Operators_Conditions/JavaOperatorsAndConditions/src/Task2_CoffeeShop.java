import java.util.Scanner;

public class Task2_CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість еспресо: ");
        int espresso = scanner.nextInt();

        if (espresso <= 0) {
            System.out.println("Введені некоректні дані, дані автоматично зміняться на додатні");
            espresso = espresso*(-1);
        }

        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt();

        if (latte <= 0) {
            System.out.println("Введені некоректні дані, дані автоматично зміняться на додатні");
            latte = latte*(-1);
        }

        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();

        if (cappuccino < 0) {
            System.out.println("Введені некоректні дані, дані автоматично зміняться на додатні");
            cappuccino = cappuccino*(-1);
        }

        int price = espresso * 3 + latte * 4 + cappuccino * 5;
        System.out.println("Загальна сума замовлення =" +price +"$");
        }
    }
