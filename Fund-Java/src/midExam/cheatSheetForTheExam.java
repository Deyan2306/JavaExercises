package midExam;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Double> doubleList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        //Методи
        //- integerList.get(index)– връща елемента на индекса, подаден като аргумент в скобите
        //- integerList.size()– връща цяло число – брой на елементите в листа
        //- integerList.indexOf(element) – връща цяло число – Индекс, на който се намира елемента
        //- integerList.isEmpty()– връща булева стойност: true – при празен лист, с 0 елемента
        //- integerList.contains(element) – връща булева стойност: true – ако елемента се съдържа в
        //листа
        //- integerList.add(element) – добавя елемента в края на листа
        //- integerList.add(index, element) – добавя елемента на индекс, който сме подали като
        //аргумент
        //- integerList.set(1, 333) – замества елемент на конкретен индекс с новият елемент
        //- integerList.remove(index) – премахва елемент на даден индекс
        //- integerList.remove(Integer.valueOf(elment)) – премахва елемент, ако съществува в
        //листа. Ако елемента е примитивен тип данни (double, int), чрез ValueOf() трябва да го превърнем в
        //референтен тип данни, за да знае компилатора, че това е елемент. Ако го оставим int компилатора ще
        //припознае числото като индекс, а не като елемент от листа. Ако елемента не съществува няма да ни
        //даде ексепшън, просто ще игнорира командата.
        //- integerList.addAll(numList) – може да добавим всички елементи от една колекция в
        //друга. Добавят се в края на колекцията.
        //- Collections.sort(integerList)- сортираме елементите в листа
        //- Collections.reverse(integerList) – обръщаме реда на елементите в листа, независимо
        //от това дали са сортирани или не.

        //Принтиране на лист
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }

        for (int item : integerList) {
            System.out.print(item + " ");
        }

        System.out.println(String.join(", ", stringList));

        List<Integer> intList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> strList = new ArrayList<>(intList.size());
        for (int i = 0; i < intList.size(); i++) {
            strList.add(String.valueOf(intList.get(i)));
        }
        System.out.println(String.join(", ", strList));

        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));

        //////////* Decimal Format *//////////
        double num = 1.146000;
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        String formattedNum = decimalFormat.format(num);
        System.out.println(formattedNum); //1.146

        //https://www.dev2qa.com/java-decimalformat-example/
    }
}

Arrays.asList(); //check