import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {

        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        String[] StudentName = {"Bread", "Andry", "Max", "Theo", "David"};
        Scanner NameIn = new Scanner(System.in);
        int i = 0;
        Boolean Found = Boolean.FALSE;

        System.out.println("Enter student ID");
        int StudentID = NameIn.nextInt();

        for (String Name : StudentName) {
            if (StudentID == studentIDs[i]) {
                System.out.println(StudentName[i]);
                Found = Boolean.TRUE;
            }
            i ++;

        }

        if (!Found) {
           System.out.println("Do not find student");
        }


    }
}
