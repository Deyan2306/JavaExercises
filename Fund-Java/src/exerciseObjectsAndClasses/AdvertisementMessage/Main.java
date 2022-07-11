package exerciseObjectsAndClasses.AdvertisementMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNum = new Random();
        int n = Integer.parseInt(scanner.nextLine());
        List<Advertisement> adv = new ArrayList<>();


        //Possbile Details About The Advertisement
        String[] possiblePhrases = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        String[] possibleEvents = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };

        String[] possibleAuthors = {
                "Diana", "Petya", "Stella", "Elena",
                "Katya", "Iva", "Annie", "Eva"
        };

        String[] possibleCities = {
                "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"
        };

        for (int i = 1; i <= n; i++) {
            int phraseIndex = randomNum.nextInt(possiblePhrases.length - 1);
            int eventIndex = randomNum.nextInt(possibleEvents.length - 1);
            int authorIndex = randomNum.nextInt(possibleAuthors.length - 1);
            int cityIndex = randomNum.nextInt(possibleCities.length - 1);

            Advertisement currentAdv = new Advertisement(
                    possiblePhrases[phraseIndex],
                    possibleEvents[eventIndex],
                    possibleAuthors[authorIndex],
                    possibleCities[cityIndex]);

            adv.add(currentAdv);
        }

        for (Advertisement current : adv) {
            System.out.printf("%s %s %s - %s%n",
                    current.getLaudatoryPhrase(),
                    current.getEvent(),
                    current.getAuthor(),
                    current.getCity());
        }
    }
}
