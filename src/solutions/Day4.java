package solutions;
import java.util.stream.Stream;

public class Day4 {
    public static int completeOverlap(String pairAssignments){
        String pA = pairAssignments.replaceAll("[,-]"," ");
        String[] rowStore = pA.split("\n");
        int k = 0;
        for (String pair : rowStore){
            int[] pairStore = Stream.of(pair.trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            if ((pairStore[0]>=pairStore[2] && pairStore[1]<=pairStore[3])||(pairStore[0]<=pairStore[2] && pairStore[1]>=pairStore[3])){
                k++;
            }
        }return k;
    }
}
