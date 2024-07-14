public class WaterTracking {
    public static void main(String[] args) {

        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
        int Sum = 0;
        int i = 0;

        while (i < waterIntake.length) {
            if (waterIntake[i] > 1) {
                Sum += waterIntake[i];
            }
            i++;

        }
        System.out.println("\nSum waterIntake: " + Sum + " liters");

    }
}
