package MidExamPreparation;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while(!commands.equals("Craft!")){
            String[] tokens = commands.split(" - ");
            String command = tokens[0];
            String item = tokens[1];
            switch (command){
                case "Collect":
                    if(!list.contains(item)){
                        list.add(item);
                    }
                    break;
                case "Drop":
                    if(list.contains(item)) {
                        list.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] splinted = item.split(":");
                    String oldItem = splinted[0];
                    String newItem = splinted[1];
                    int index = list.indexOf(oldItem) + 1;
                    if(list.contains(oldItem)) {
                        list.add(index, newItem);
                    }
                    break;
                case "Renew":
                    if(list.contains(item)){
                        index = list.indexOf(item);
                        list.remove(item);
                        list.add(item);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println(String.join(", ",list));
    }
}
