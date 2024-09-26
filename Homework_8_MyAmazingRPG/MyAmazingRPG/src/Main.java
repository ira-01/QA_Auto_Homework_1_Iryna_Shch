import java.util.Scanner;   //Import scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        boolean selected;

        Character firstPerson = new Character("DemonHunter", 40, 17, 3);
        Character secondPerson = new Character("DarkHorse", 53, 15, 4);


        while (firstPerson.isAlive() && secondPerson.isAlive()) {
            System.out.println("Select who attacks: 'false' for " + firstPerson.name + " or 'true' for " + secondPerson.name);
            selected = select.nextBoolean();

            if (selected) {
                secondPerson.attack(firstPerson);
            } else {
                firstPerson.attack(secondPerson);
            }

            firstPerson.displayStatus();
            secondPerson.displayStatus();

        }

        System.out.println("Final Status:");
        firstPerson.displayStatus();
        secondPerson.displayStatus();


        // Визначення переможця
        if (firstPerson.isAlive()) {
            System.out.println(firstPerson.name + " is the winner! ");  // Якщо перший персонаж живий, він переможець
        } else {
            System.out.println(secondPerson.name + " is the winner! ");  // Інакше другий персонаж переможець
        }


        System.out.println("Person count = " + Character.characterCount);
        System.out.println("GAME OVER");

        select.close();

    }
}
