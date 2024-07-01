import java.util.Scanner;

public class Task1_MagicApple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть поточну годину (0-23): ");
        int hour = scanner.nextInt();
        int energy;

        if (hour >= 6  && hour <=10) {
            energy  = 10;
            System.out.println("energy =" +energy);
        }
        else if ( hour >= 12  && hour <= 18) {
            energy  = 20;
            System.out.println("energy =" +energy);
        }
        else if (hour >= 18 && hour <= 24) {
            energy  = 30;
            System.out.println("energy =" +energy);
        }
        else if (hour >= 0 && hour <= 6) {
            energy  = 5;
            System.out.println("energy =" +energy);
        }
    }
}