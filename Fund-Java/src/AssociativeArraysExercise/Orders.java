package AssociativeArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Double> orders = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> rememberProducts = new LinkedHashMap<>();

        String input = "";
        while(!"buy".equals( input = reader.readLine())){

            String[] data = input.split("\\s+");

            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if(!orders.containsKey(product)){
                orders.put(product,quantity*price);
                rememberProducts.put(product, quantity);

            }else {
                rememberProducts.put(product, rememberProducts.get(product) + quantity);
                orders.put(product, rememberProducts.get(product) * price);
            }

        }

        orders.forEach((key, value) ->
                System.out.println(String.format("%s -> %.2f", key, value)));

    }
}
