import java.util.Random;

public class DiceSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] diceRolls = new int[6];

        // Simulate rolling a die 1,000,000 times
        for (int i = 0; i < 1_000_000; i++) {
            diceRolls[rand.nextInt(6)]++;
        }

        int mostFrequentFace = 1;

        // Print results and find the most frequent face
        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + ": " + diceRolls[i] + " times.");
            if (diceRolls[i] > diceRolls[mostFrequentFace - 1]) {
                mostFrequentFace = i + 1;
            }
        }

        System.out.println("------------------------------");
        System.out.println("Most frequent face: " + mostFrequentFace);
    }
}