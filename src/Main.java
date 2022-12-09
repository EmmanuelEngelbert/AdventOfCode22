import solutions.Day1;
import solutions.Day2;

import static solutions.Day3.*;
import static solutions.Day4.*;
import static solutions.Day5.*;
import static solutions.StringInputs.*;

public class Main {
    public static void main(String[] args) {
       Day1.day1Task(input1); //day 1 - part 1
       Day1.top3Cals(input1); //day 1 - part 2
       System.out.println(Day2.rpsResult(input2)); //day 2 - part 1
       System.out.println(Day2.rpsResult2(input2)); //day 2 - part 2
       System.out.println(prioritySum(priorityList(input3))); //day 3 -part 1
       System.out.println(priorityGroupsOf3(input3)); //day 3 - part 2
       System.out.println(completeOverlap(input4)); //day 4 - part 1
       System.out.println(anyOverlap(input4)); //day 4 - part 1
       System.out.println(stackArrangement(input5));
       System.out.println(stackingInstructions(input5));
       System.out.println(retainOrder(input5));
    }
}