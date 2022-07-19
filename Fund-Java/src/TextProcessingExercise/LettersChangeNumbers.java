package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        double sum =0;

        for (int i = 0; i < input.length; i++) {
            sum = sum + theGreatSummariser(input[i]);

        }
        System.out.println(String.format("%.2f",sum));

    }

    private static double theGreatSummariser (String word){

        double sum1 =0;
        double sum2 =0;

        String[] workWord = word.split("");

        String first = workWord[0];
        String second = workWord[workWord.length-1];
        String rawNumber = "";

        for (int i = 0; i < workWord.length ; i++) {
            if (Character.isDigit(workWord[i].charAt(0))) {
                rawNumber = rawNumber + workWord[i];
            }
        }
        double number = Double.parseDouble(rawNumber);

        boolean firstHasUppercase = !first.equals(first.toLowerCase());
        boolean firstHasLowercase = !first.equals(first.toUpperCase());
        boolean secondHasUppercase = !second.equals(second.toLowerCase());
        boolean secondHasLowercase = !second.equals(second.toUpperCase());

        if (firstHasUppercase){
            double asci = ((char)first.charAt(0)-64);
            sum1 = number/asci;
        }else if (firstHasLowercase){
            double asci = ((char)first.charAt(0)-96);
            sum1 = number * asci;
        }

        if (secondHasUppercase){
            double asci = ((char)second.charAt(0)-64);
            sum2 = sum1 - asci;
        }else if (secondHasLowercase){
            double asci = ((char)second.charAt(0) - 96);
            sum2 = sum1 + asci;
        }


        return sum2;
    }

}
