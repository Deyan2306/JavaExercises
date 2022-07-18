package ArraysExercise;

        import java.util.Arrays;
        import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] allNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long specialNumber = Long.parseLong(scanner.nextLine());

        for (int i = 0; i < allNumbers.length; i++) {

            for (int j = i + 1; j < allNumbers.length; j++) {
                if (allNumbers[i] == allNumbers[j]){
                    break;
                }

                if (allNumbers[i] + allNumbers[j] == specialNumber){
                    System.out.println(allNumbers[i] + " " + allNumbers[j]);
                }
            }
        }
    }
}