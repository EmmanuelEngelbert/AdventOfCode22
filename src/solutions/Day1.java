package solutions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Day1 {
    public static void day1Task(String data){
        String[] storage = data.split("\n\n");
        Integer[] totalCals = new Integer[storage.length];
        for (int j = 0; j < storage.length; j++) {
            String[] storageLoop = storage[j].split("\n");
            int k = 0;
            for (String s : storageLoop) {
                k += Integer.parseInt(s);
            }
            totalCals[j] = k;
        }
        List<Integer> elfCals = Arrays.asList(totalCals);
        System.out.println("Elf " + elfCals.indexOf(Collections.max(elfCals)) +
                " carries " + Collections.max(elfCals) + " Calories");
    }
}


