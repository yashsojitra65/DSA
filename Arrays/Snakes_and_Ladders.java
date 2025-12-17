package Arrays;
import java.util.*;

public class Snakes_and_Ladders {
    public static void main(String[] args) {
        Map<Integer, Integer> board = new HashMap<>();

        // Ladders
        board.put(4, 25);
        board.put(13, 46);
        board.put(33, 49);
        board.put(42, 63);
        board.put(50, 69);
        board.put(62, 81);
        board.put(74, 92);

        // Snakes
        board.put(99, 10);
        board.put(95, 75);
        board.put(88, 24);
        board.put(67, 55);
        board.put(54, 31);
        board.put(43, 18);

        Scanner scanner = new Scanner(System.in);
        int position = 0;

        System.out.println("🎲 Snakes and Ladders Game Started!");
        System.out.println("Enter dice value between 1 and 6");

        while (position < 100) {

            System.out.print("\nEnter Dice Value: ");
            int dice = scanner.nextInt();

            // Validate input
            if (dice < 1 || dice > 6) {
                System.out.println("❌ Invalid input! Enter number between 1 and 6.");
                continue;
            }

            // Move player
            if (position + dice <= 100) {
                position += dice;
            } else {
                System.out.println("⚠ Move ignored (cannot cross 100)");
            }

            // Snake or Ladder check
            if (board.containsKey(position)) {
                int newPosition = board.get(position);
                if (newPosition > position) {
                    System.out.println("🪜 Ladder! " + position + " → " + newPosition);
                } else {
                    System.out.println("🐍 Snake! " + position + " → " + newPosition);
                }
                position = newPosition;
            }

            System.out.println("📍 Current Position: " + position);
        }

        System.out.println("\n🏆 You reached 100! You win!");
        scanner.close();
    }
}
