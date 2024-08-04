import java.util.Scanner;   //Import scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {      //створeння персонажів
        Scanner select = new Scanner(System.in);
        boolean selected;

        character firstPerson = new character("DemonHunter", 40, 17, 3);
        character secondPerson = new character("DarkHorse", 53, 15, 4);


         while (firstPerson.isAlive() & secondPerson.isAlive()){
            System.out.println("Select who beats 'false' = " + firstPerson.name + " or 'true' = " + secondPerson.name);
            selected = select.nextBoolean();

            if (selected = true) {
                secondPerson.attack(firstPerson);
            }
            else{
                firstPerson.attack(secondPerson);
            }
             firstPerson.displayStatus();
             secondPerson.displayStatus();

        }


        firstPerson.displayStatus();
        secondPerson.displayStatus();
        System.out.println("Person count = " + character.characterCount);
        System.out.println("GAME OVER");

        }
    }
