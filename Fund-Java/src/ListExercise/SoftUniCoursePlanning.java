package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> Lessons = Arrays.stream(input.nextLine().split(", ")).collect(Collectors.toList());

        String newInput = input.nextLine();

        while(!newInput.equalsIgnoreCase("course start")){
            List <String> Split = Arrays.stream(newInput.split(":")).collect(Collectors.toList());
            String Command = Split.get(0);
            String lessonTitle = Split.get(1);

            switch(Command){
                case"Add":
                    if(!Lessons.contains(lessonTitle)){
                        Lessons.add(lessonTitle);
                    }
                    break;
                case"Insert":
                    int Index = Integer.parseInt(Split.get(2));

                    if(!Lessons.contains(lessonTitle)){
                        if(Index>=0 && Index<Lessons.size()) {
                            Lessons.add(Index, lessonTitle);
                        }
                    }
                    break;
                case"Remove":
                    String exerciseTitle = Split.get(1)+"-Exercise";

                    if(Lessons.contains(lessonTitle) && Lessons.contains(exerciseTitle)){
                        Lessons.remove(lessonTitle);
                        Lessons.remove(exerciseTitle);
                    }
                    if(Lessons.contains(lessonTitle)){
                        Lessons.remove(lessonTitle);
                    }

                    if(Lessons.contains(exerciseTitle)){
                        Lessons.remove(exerciseTitle);
                    }

                    break;
                case"Swap":
                    String lessonTitle2 = Split.get(2);

                    if(Lessons.contains(lessonTitle) && Lessons.contains(lessonTitle2)) {
                        int indexOfFirst = Lessons.indexOf(lessonTitle);
                        int indexOfSecond = Lessons.indexOf(lessonTitle2);

                        String tempValue = Lessons.get(indexOfFirst);

                        Lessons.set(indexOfFirst, lessonTitle2);
                        Lessons.set(indexOfSecond, tempValue);

                        if(Lessons.contains(lessonTitle+"-Exercise")){
                            String tempName = lessonTitle+"-Exercise";
                            Lessons.remove(lessonTitle + "-Exercise");

                            if(indexOfSecond+1<=Lessons.size()-1){
                                Lessons.add(indexOfSecond+1,tempName);
                            }else{
                                Lessons.add(tempName);
                            }
                        }

                        else if(Lessons.contains(lessonTitle2+"-Exercise")){
                            String tempName = lessonTitle2+"-Exercise";
                            Lessons.remove(lessonTitle2 + "-Exercise");

                            if(indexOfFirst+1<=Lessons.size()-1){
                                Lessons.add(indexOfFirst+1,tempName);
                            }else{
                                Lessons.add(tempName);
                            }
                        }
                    }
                    break;
                case"Exercise":
                    String newValue = lessonTitle+"-Exercise";

                    if (Lessons.contains(lessonTitle)) {
                        if (!Lessons.contains(lessonTitle + "-Exercise")) {
                            int indexOf = Lessons.indexOf(lessonTitle);
                            if (indexOf <= Lessons.size() - 1) {
                                Lessons.add(indexOf + 1, newValue);
                            } else {
                                Lessons.add(newValue);
                            }
                        }
                    }
                    else{
                        Lessons.add(lessonTitle);
                        Lessons.add(newValue);
                    }
            }
            newInput=input.nextLine();
        }
        int count =0;
        for(int i=0;i<=Lessons.size()-1;i++){
            count++;
            System.out.printf("%s.%s\n",count,Lessons.get(i));
        }
    }
}
