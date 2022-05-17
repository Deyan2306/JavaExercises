package basicSyntaxLab;

import java.util.Locale;
import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeDay = scanner.nextLine().toLowerCase(Locale.ROOT);
        double ageOfThePerson = Integer.parseInt(scanner.nextLine());
        String typeAge;

        if (ageOfThePerson <= 18){
            typeAge = "Min";
        } else if (ageOfThePerson <= 64){
            typeAge = "Mid";
        } else {
            typeAge = "Old";
        }

        int price = 0;
        switch (typeDay){
            case "weekday":
                switch (typeAge) {
                    case "Min" -> price = 12;
                    case "Mid" -> price = 18;
                    case "Old" -> price = 12;
                }
                break;
            case "weekend":
                price = switch (typeAge) {
                    case "Min" -> 15;
                    case "Mid" -> 20;
                    case "Old" -> 15;
                    default -> price;
                };
                break;
            case "holiday":
                price = switch (typeAge) {
                    case "Min" -> 5;
                    case "Mid" -> 12;
                    case "Old" -> 10;
                    default -> price;
                };
                break;
            default:
                break;
        }
        if (ageOfThePerson >= 0 && ageOfThePerson <= 122){
            System.out.print(price + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
