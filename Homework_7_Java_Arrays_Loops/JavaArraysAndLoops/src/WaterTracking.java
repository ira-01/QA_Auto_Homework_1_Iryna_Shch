public class WaterTracking {
    public static void main(String[] args) {

        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
        int sum = 0;
        int i = 0;

        while (i < waterIntake.length) {
            if (waterIntake[i] > 1) {
                sum += waterIntake[i];
            }
            i++;

        }
        System.out.println("\nSum waterIntake: " + sum + " liters");

    }
}
