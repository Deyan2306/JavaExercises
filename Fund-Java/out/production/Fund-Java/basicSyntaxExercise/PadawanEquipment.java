package basicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Make the varibles
        double money = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        //Find the price of the sabers
        double lightsabers = 1;
        lightsabers = Math.ceil((lightsabers * numberOfStudents) + ((lightsabers * numberOfStudents) * 0.1));

        //Find the belts
        double belts = numberOfStudents;
        double beltsAgain = belts;
        double robes = numberOfStudents;

        //Check the belts
        while (beltsAgain >= 6){
            belts--;
            beltsAgain -= 6;
        }

        //Find the total price
        double totalMoney = (lightsabers * lightSaberPrice) + (belts * beltPrice) + (robePrice * robes);

        //Print the expression
        if (money >= totalMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalMoney - money));
        }
    }
}