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
    public static int anyOverlap(String pairAssignments){
        String pA = pairAssignments.replaceAll("[,-]"," ");
        String[] rowStore = pA.split("\n");
        int k = 0;
        for (String pair : rowStore){
            int[] pairStore = Stream.of(pair.trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int k1 = pairStore[0]; int k2 = pairStore[1]; int k3 = pairStore[2]; int k4 = pairStore[3];
            if ((k3 <= k1 && k1<=k4)||(k3 <= k2 && k2<=k4)){
                k++;
            } else if ((k1 <= k3 && k3<=k2)||(k1 <= k4 && k4<=k2)){
                k++;
            }
        }return k;
    }
}
