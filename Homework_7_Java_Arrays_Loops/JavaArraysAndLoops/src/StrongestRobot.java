public class StrongestRobot {

    public static void main(String[] args) {

        int[] weights = {300, 450, 200, 500, 350}; // 1-ий робот підняв 300кг, другий 450 і т.п.
        String[] robotName = {"IronBolt", "MuscleBot", "PowerMax", "SteelStorm", "TitanLift"};

        int maxWeight = Integer.MIN_VALUE;
        int StrongestRobotIndex = -1;

        for (int i = 0; i < weights.length; i++) {
           // System.out.print(weights[i] + "");
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                StrongestRobotIndex = i;
            }

        }
        System.out.println("\nStrongest robot: " + robotName[StrongestRobotIndex]);
        System.out.println("\nWeight lifted: " + maxWeight + " kg");

    }
}

