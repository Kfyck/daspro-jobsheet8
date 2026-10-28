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