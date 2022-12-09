package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day5 {

    public static List<List<String>> stackArrangement(String input){
        String[] stack = input.split("\n\n");
        String[] stackLines = stack[0].split("\n");
        int numberOfLines = stackLines.length;
        String[] arrayOfStacks = stackLines[numberOfLines-1].trim().split("   ");
        int numberOfStacks = arrayOfStacks.length;
        List<List<String>> arrangementsOfStacks = new ArrayList<>();
        for (int t=0; t <numberOfStacks;t++){
            arrangementsOfStacks.add(new ArrayList<>(Arrays.asList("place_holder"))); //put values in the list so that the get method may work later on
        }
        for (int i=0; i<numberOfStacks;i++){
            for (int j=0; j<numberOfLines-1;j++){
               String[] storage = stackLines[numberOfLines-2-j].split("");
               for (int listToAdd =0; listToAdd < numberOfStacks;listToAdd++){
                   if (storage[1+4*listToAdd].matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]")&& j==0){
                       arrangementsOfStacks.set(listToAdd, new ArrayList<>(Arrays.asList(storage[1+4*listToAdd]))); //the pattern in which characters should appear - 2 character = 1st stack, 6th character = 2nd stack and so on
                   }else if ((storage[1+4*listToAdd].matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]")&& j!=0)){
                       arrangementsOfStacks.get(listToAdd).add(storage[1+4*listToAdd]);
                   }

               }
            }
        }
        return  arrangementsOfStacks;
    }
}
