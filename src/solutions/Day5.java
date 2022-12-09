package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
    public static String stackingInstructions(String input){
        String newWord = input.replaceAll("move ", "").replaceAll(" from "," ").replaceAll(" to "," ");
        String[] stack = newWord.split("\n\n");
        String[] stackLines = stack[1].split("\n");
        List<List<String>> arrangement = stackArrangement(input);
        for (String instructions : stackLines){
            String[] storage = instructions.split(" ");
            int[] intStorage = Stream.of(storage).mapToInt(Integer::parseInt).toArray();
            //get size of lists so that I can remove the last elements
            for (int i=0;i<intStorage[0];i++){
                int k = arrangement.get(intStorage[1]-1).size()-1;
                arrangement.get(intStorage[2]-1).add(arrangement.get(intStorage[1]-1).get(k));
                arrangement.get(intStorage[1]-1).remove(k);
            }
        }String result = "";
        for (int j=0;j<arrangement.size();j++){
            result += arrangement.get(j).get(arrangement.get(j).size()-1);
        } return result;
    }
}
