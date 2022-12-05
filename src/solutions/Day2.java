package solutions;

public class Day2 {
    public static int rpsResult(String s) {
        String[] rowStore = s.split("\n");
        int k = 0;
        for (String i : rowStore) {
            String[] rpsStore = i.split(" ");
            if (rpsStore[0].matches("A") && rpsStore[1].matches("X")) {
                k += 4;
            } else if (rpsStore[0].matches("A") && rpsStore[1].matches("Y")) {
                k += 8;
            } else if (rpsStore[0].matches("A") && rpsStore[1].matches("Z")) {
                k += 3;
            } else if (rpsStore[0].matches("B") && rpsStore[1].matches("X")) {
                k += 1;
            } else if (rpsStore[0].matches("B") && rpsStore[1].matches("Y")) {
                k += 5;
            } else if (rpsStore[0].matches("B") && rpsStore[1].matches("Z")) {
                k += 9;
            } else if (rpsStore[0].matches("C") && rpsStore[1].matches("X")) {
                k += 7;
            } else if (rpsStore[0].matches("C") && rpsStore[1].matches("Y")) {
                k += 2;
            } else if (rpsStore[0].matches("C") && rpsStore[1].matches("Z")) {
                k += 6;
            }
        }return k;
    }
    public static int rpsResult2(String s){
        String[] rowStore = s.split("\n");
        int k = 0;
        for (String i : rowStore) {
            String[] rpsStore = i.split(" ");
            if (rpsStore[0].matches("A") && rpsStore[1].matches("X")) {
                k += 3;
            } else if (rpsStore[0].matches("A") && rpsStore[1].matches("Y")) {
                k += 4;
            } else if (rpsStore[0].matches("A") && rpsStore[1].matches("Z")) {
                k += 8;
            } else if (rpsStore[0].matches("B") && rpsStore[1].matches("X")) {
                k += 1;
            } else if (rpsStore[0].matches("B") && rpsStore[1].matches("Y")) {
                k += 5;
            } else if (rpsStore[0].matches("B") && rpsStore[1].matches("Z")) {
                k += 9;
            } else if (rpsStore[0].matches("C") && rpsStore[1].matches("X")) {
                k += 2;
            } else if (rpsStore[0].matches("C") && rpsStore[1].matches("Y")) {
                k += 6;
            } else if (rpsStore[0].matches("C") && rpsStore[1].matches("Z")) {
                k += 7;
            }
        }return k;
    }
}
