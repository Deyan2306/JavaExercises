package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class cheatSheetForTheExam {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //////////* Масиви *//////////

        //Четене на масиви от конзолата
        String[] stringArr = scanner.nextLine().split("\\s+"); // s+ ни защитава в случай че има повече от един спейс
        int[] integerArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        double[] doubleArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        //Достъпване на масив
        int firstItem = integerArr[0];

        //Сортиране на масив
        Arrays.sort(integerArr);

        //Принтиране на масив
        for (int i = 0; i < integerArr.length; i++) {
            System.out.print(integerArr[i] + " ");
        }

        for (int item : integerArr){
            System.out.print(item + " ");
        }

        System.out.println(String.join(", ", stringArr));

        System.out.println(Arrays.toString(integerArr).replaceAll("[\\[\\]", ""));

        //Превръщане на типове масиви
        String[] numsAsStringsArr = new String[integerArr.length];
        for (int i = 0; i < numsAsStringsArr.length; i++) {
            numsAsStringsArr[i] = String.valueOf(integerArr[i]);
        }


        //////////* Листове *//////////

        //Четене на лист от конзолата
        List<String>
                //TODO
    }
}
