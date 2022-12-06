package solutions;
import java.util.*;
public class Day3 {
    public static List<String> priorityList(String s){
        //split lines
        String[] rowStore = s.split("\n");
        List<String> intersections = new ArrayList<>();
        //for each line get chars - initialise long into in every loop
        for (String i : rowStore){
            int k = Integer.parseInt(Long.toString(i.chars().count()));
            String[] charStorage = i.split("");
            List<String> firstRucksack = new ArrayList<>(Arrays.asList(charStorage).subList(0, k / 2));
            List<String> secondRucksack = new ArrayList<>(Arrays.asList(charStorage).subList(k / 2, k));
            firstRucksack.retainAll(secondRucksack); //find intersection
            intersections.add(firstRucksack.get(0)); //so we don't retain copies of the same letter
        }return intersections;
    }
    public static HashMap<String,Integer> hashDictionary(){
        String j = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] jStore = j.split("");
        HashMap<String,Integer> priorityPoints = new HashMap<>();
        for (int k=0; k<52;k++){
            priorityPoints.put(jStore[k],k+1);
        }return priorityPoints;
    }
    public static int prioritySum(List<String> s){
        int k=0;
        for (String d : s){
            k+=hashDictionary().get(d);
        }return k;
    }

    public static int priorityGroupsOf3(String s){
        //split by \n then group in 3s probably a loop for each
        //length/3 - int y <length/3 rowStore[y], rowStore[y+1] and rowStore[y+2]
        //loop int u = 0; u<rowStore.length;u=+3
        //each loop
        String[] rowStore = s.split("\n");
        List<String> priorityInGroupsOf3 = new ArrayList<>();
        for (int u=0; u<rowStore.length;u+=3){
            List<String> charStore1 = new ArrayList<>(Arrays.asList(rowStore[u].split("")));
            List<String> charStore2 = new ArrayList<>(Arrays.asList(rowStore[u+1].split("")));
            List<String> charStore3 = new ArrayList<>(Arrays.asList(rowStore[u+2].split("")));
            charStore1.retainAll(charStore2); charStore1.retainAll(charStore3);
            priorityInGroupsOf3.add(charStore1.get(0));
        }return prioritySum(priorityInGroupsOf3);
    }
}
