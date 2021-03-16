// *************************************************************  
// WeeklySales.java  
// @author AULIA RAHMI 
// Sorts the sales staff in descending order by sales.  
// ************************************************************
import java.util.Scanner;

public class WeeklySales  {  
    public static void main(String[] args)  {  
        Salesperson[] salesStaff;
        int size, sales;
        String[] firstName, lastName;
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nHow many Sales person do you want? ");
        size = scan.nextInt();
        salesStaff = new Salesperson[size];
        firstName = new String[size];
        lastName = new String[size];
        
        for (int i = 0; i < size; i++){
            System.out.println ("Enter the First Name " + (i+1) + "...");
            firstName[i] = scan.next();
            System.out.println ("Enter the Last Name " + (i+1) + "...");
            lastName[i] = scan.next();
            System.out.println ("Enter the Sales " + (i+1) + "...");
            sales = scan.nextInt();
            salesStaff[i] = new Salesperson(firstName[i], lastName[i], sales); 
        }
        
        Sorting.insertionSort(salesStaff);
        System.out.println ("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println (s);
    }
}
