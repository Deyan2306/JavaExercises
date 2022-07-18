package ListLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        int i = 1;
        for (String s : products) {
            System.out.println(i + "." + s);
            i++;
        }
    }
}
