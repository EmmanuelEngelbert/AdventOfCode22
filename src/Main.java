import solutions.Day1;
import solutions.Day2;

import static solutions.Day3.*;
import static solutions.StringInputs.*;

public class Main {
    public static void main(String[] args) {
       Day1.day1Task(input1);
       System.out.println(Day2.rpsResult(input2));
       Day1.top3Cals(input1);
       System.out.println(Day2.rpsResult2(input2));
       System.out.println(prioritySum(priorityList(input3)));
       System.out.println(priorityGroupsOf3(input3));
    }
}