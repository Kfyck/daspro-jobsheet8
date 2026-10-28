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
}