package recursion;

public class Dice {

    static void diceGame(int start, int end, String result) {
        if (start == end) {
            System.out.print(result + " ");
            return;
        }
        // loop end case
        if (start > end) {
            return;
        }

        for (int dice = 1; dice <= 6; dice++) {
            diceGame(start + dice, end, result + dice);
        }
    }

    public static void main(String[] args) {
        diceGame(0, 6, "");
    }
}
