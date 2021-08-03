import java.util.Arrays;

public class TestPuzzle {

    public static void main(String[] args) {
        PuzzleJava tester = new PuzzleJava();
        System.out.println(Arrays.toString(tester.getTenRolls()));
        System.out.println(tester.getRandomLetter());
        System.out.println(tester.generatePassword());
        System.out.println(Arrays.toString(tester.getNewPasswordSet(5)));
    }
}