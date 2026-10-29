# jobsheet 8 

**Name:** Ilyasa Aghlazabarjad Saleksa  
**NIM:** 264107020234  
**Prodi:** Computer Science  
**Class:** TI-1I  

## Objective
1. Understand the concept of nested loops in algorithms
2. Understand the flow of nested loops
3. Recognize the syntax of nested loops
4. Be able to apply nested loops to solve a simple case study.

## Experiment 1
```java
import java.util.Scanner;

public class Star15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
```
### Question
1. If the initialization i = 1 is changed to i = 0 without changing the condition, how many
* characters are printed when n = 5? Explain.
2. If the condition i <= n is changed to i < n, how many times does the loop run when
n = 5? Why is the result different?
3. Predict the output of the following code fragment when n = 9, then verify it by replacing
the FOR loop in your program and running it.
for (int i = 2; i <= n; i += 2) {
 System.out.print(i + " ");
}
Modify this code so that it prints the odd positive numbers that do not exceed n.
4. Explain why changing the increment i++ to i-- (with the condition still i <= n) makes
the loop run endlessly, so that it does not stop in a reasonable time for positive n. Do not
run that version; if it has already started running, stop the program by pressing Ctrl + C
in the terminal.
### Answer
1. 6 character will bw print
2. the loop runs 4 times when i at 1
3. 2 4 6 8, the loop start at 2 then increase by 2 so it prints even numbers up to 9.
```java
   for (int i = 1; i <= n; i += 2) {
    System.out.print(i + " ");
}
```
output: 1 3 5 7 9

5. The value of i decreases instead of increasing. Starting at 1, it becomes 0, -1, -2, and continues decreasing.
## Experiment 2
```java
import java.util.Scanner;

public class Rectangle15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
```
### Question
1. Explain the function of the variables i and j in the program.
2. How many times are the outer loop, the inner loop, and the statement print("*")
executed for rows = 4 and columns = 7?
3. What happens if the bounds of the outer and inner loops are swapped (the outer loop
uses columns and the inner loop uses rows)? Use rows = 3 and columns = 6 to explain.
4. Explain the effect of removing System.out.println(); after the inner loop.
5. Modify the program so that the printed character is #, then commit and push the changes
to GitHub.
### Answer
1. i is the outer loop counter that controls the number of rows.
  j is the inner loop counter that controls the number of stars in each row, corresponding to the number of columns.
2. outer loop: 4 times, inner loop: 28, print("*"): 28 times
3. The program prints 6 rows with 3 stars per row instead of 3 rows with 6 stars per row. The rectangle's dimensions are reversed.
4. All stars are printed on the same line because the cursor does not move to a new line after each row.
```java
5. System.out.print("#");
```
## Experiment 3
```java
import java.util.Scanner;
public class Triangle15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            //System.out.print("[i" + i +"]");
            int j = 0;
            while (j < n - i + 1) {
                System.out.print("*");
                j++;
        }
        System.out.println();
        i++;
        }
        sc.close();
    }
```

}
### Question
1. Identify the mismatches in the initial output, and at least two fixes needed to produce a
nested triangle pattern.
2. Explain the roles of the variables i and j. Why must the value of j be reset to 0 in every
iteration of the outer loop? What happens if j is not reset?
3. Explain the changes to the initialization, the condition, and the update of the outer loop
that are needed to form the inverted triangle.
### Answer
1. The outer loop starts at i = 0, causing an empty first row.,The outer loop uses i <= n, causing \(n+1\) iterations.,There is no System.out.println(); after the inner loop, so all stars appear on one line.
2. i controls the current row number.j counts the stars printed in the current row.j must be reset to 0 so each row starts counting stars from the beginning.
3. For the inverted triangle, initialize i to n, use the condition i >= 1, and decrease i by one after every row. This makes the number of stars decrease from n to 1.
## Experiment 4
```java
import java.util.Scanner;

public class GroupScore15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of groups : ");
        int numGroups = sc.nextInt();
        System.out.print("Enter the number of graders: ");
        int numGraders = sc.nextInt();
        if (numGroups <= 0 || numGraders <= 0) {
            System.out.println("Groups and graders must be > 0.");
        } else {
            int grupNo = 1;
            double highestAverage = -1;
            int bestGroup = 0;
            while(grupNo <= numGroups){
                System.out.println("Group" + grupNo);
                double totalScore = 0;
                for (int j = 1; j <= numGraders; j++) {
                    int score;
                    do {
                        System.out.print(" Score from Grader " + j + ": ");
                         score = sc.nextInt();
                        if (score < 0 || score > 100) {
                             System.out.println(" Score must be 0-100. Retry!");
                        }
                    } while (score < 0 || score > 100);
                    totalScore += score;
                }
                double averageScore = totalScore / numGraders;
                System.out.println("Group " + grupNo + ": average score = " + averageScore);
                if (averageScore > highestAverage) {
                    highestAverage = averageScore;
                    bestGroup = grupNo;
                }
                grupNo++;
            }
            System.out.println("==============================");
            System.out.println("Best group : " + bestGroup);
            System.out.println("Highest average : " + highestAverage);
        }
    }
}
```
### Question
1. Why must totalScore be reset inside the outer loop, but highestAverage must not
be reset for each group?
2. For 3 groups and 2 graders (without any invalid input), how many times is the body of the
FOR loop executed in total?
3. What happens if totalScore is declared as int and the average is calculated using
integer division? Give an example of values.
4. Why is highestAverage given the initial value -1 rather than 0? Give an example of
input that produces a wrong result if the initial value were 0.
5. This program has three levels of loops. Name each type of loop and its role.
### Answer
1. totalScore must be reset to 0 for every group because it stores only the scores of the current group. highestAverage must retain its value so the program can compare the average of each new group against the highest average found so far.
2. 6 times, because each of the 3 groups receives scores from 2 graders.
3. Integer division discards the decimal part of the result. For example, if the scores are 80 and 81 The correct average is 80.5, but integer division produces 80.
4. The initial value of -1 ensures that the first group's average is recorded even if every group receives a score of 0. If highestAverage starts at 0 and all groups receive 0, the condition averageScore > highestAverage is never true.
5. Outer WHILE loop: Processes each group. Middle FOR loop: Processes each grader's score for the current group. Inner DO-WHILE loop: Repeats score input until a valid score between 0 and 100 is entered.
## Assignment
### Assignment 1
```java
import java.util.Scanner;
public class Task1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int totalNum = 0;

        for(int i = 1; i <= n; i++ ){
            for(int j = 1; j <= i; j++ ){
                if(j > 1){
                    System.out.print(" ");
                }
                System.out.print(j);
                totalNum++;
            }
            System.out.println();
        }
        System.out.println("Total number: " + totalNum);
        sc.close();
    }
}
```
### Assignment 2
```java
import java.util.Scanner;
public class Task2_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int totalNum = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
            int result = i * j;
            System.out.printf("%4d", result);
            totalNum += result;
            }
            System.out.println();
        }
        System.out.print("Total of all number: " + totalNum);
    }
}
```
### Assignment 3
```java
import java.util.Scanner;
public class Task3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of store: ");
        int storenum = sc.nextInt();

        if(storenum < 1){
            System.out.println("The number of store at least  1");
        }else{
            int totalItem = 0;
            int maxItem = -1;
            int bestStore = 1;
            for(int store = 1; store <= storenum; store++){
                System.out.print("Enter the number of customer " + store +": ");
                int cusStore = sc.nextInt();
                while(cusStore < 0){
                    System.out.println("Number of customer cannot be negative");
                    cusStore = sc.nextInt();
                }

                int item = 0;

                for(int cust = 1; cust <= cusStore; cust++){
                    System.out.print("Enter the number of item for customer " + cust +": ");
                    int sItem = sc.nextInt();
                    while(sItem < 0){
                        System.out.println("Number of item cannot be negative");
                        sItem = sc.nextInt();
                    }
                    item += sItem;
                }

                System.out.println("store " + store + "-customer: " + cusStore + ", total item " + item);
                
                totalItem += item;

                if(item > maxItem){
                    maxItem = item;
                    bestStore = store;
                }

            }
            System.out.println("===============================");
            System.out.println("Total item accros all store: " + totalItem);
            System.out.println("Store with the most item: " + bestStore);

           
        }
        sc.close();

    }
}
```
