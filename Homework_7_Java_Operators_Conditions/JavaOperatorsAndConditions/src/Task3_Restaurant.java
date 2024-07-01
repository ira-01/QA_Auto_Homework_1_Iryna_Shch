import java.util.Scanner;

public class Task3_Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть страву(1-Закуска, 2-Основна страва, 3-Десерт, 4-Напій): ");
        int food = scanner.nextInt();

        switch (food) {
            case 1:
                System.out.println("Закуска");
                break;
            case 2:
                System.out.println("Основна страва");
                break;
            case 3:
                System.out.println("Десерт");
                break;
            case 4:
                System.out.println("Напій");
                break;
        }
    }
}
