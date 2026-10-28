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