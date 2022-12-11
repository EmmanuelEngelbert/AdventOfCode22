package solutions;

import java.io.BufferedReader;
import java.io.FileReader;
public class Day6 {
    public static int charProcessed(String input){
        String[] characterArray = input.split("");
        int amountOfChars = characterArray.length;
        int count = 0;
        for (int i=0; i<amountOfChars-3;i++){
           String k1 = characterArray[i];
           String k2 = characterArray[i+1];
           String k3 = characterArray[i+2];
           String k4 = characterArray[i+3];

           String f1 = k2+k3+k4;
           String f2 = k3+k4;
           if (!f1.contains(k1) && !f2.contains(k2) && !k4.contains(k3)){
               count+=i+4;
               break;
           }
        }return count;
    }
    public static int numberOfCharProcessed(String input, int n){
        String[] characterArray = input.split("");
        int amountOfChars = characterArray.length;
        int count = 0;
        for (int i=0; i<amountOfChars-(n-1);i++){
            boolean isDistinct = true;
            for (int j=0; j<n;j++){
                if (String.valueOf(input.subSequence(i+j+1,i+n)).contains(characterArray[j+i])){
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct){
                count+=i+n;
                break;
            }
        }return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("inputs/input6.txt"));
        String input = br.readLine();
        System.out.println(charProcessed(input));
        System.out.println(numberOfCharProcessed(input, 4));//confirmed the answer matches with the previous one
        System.out.println(numberOfCharProcessed(input, 14));
    }
}
