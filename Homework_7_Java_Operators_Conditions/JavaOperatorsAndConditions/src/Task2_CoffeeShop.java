import java.util.Scanner;

public class Task2_CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість еспресо: ");
        int espresso = scanner.nextInt(); // запам*ятовуємо скільки чашок еспресо
        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt(); // скільки лате
        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();  // скільки капучино

        int price = espresso * 3 + latte * 4 + cappuccino * 5;
        System.out.println("Загальна сума замовлення =" +price +"$");
        }
    }
