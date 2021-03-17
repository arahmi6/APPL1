// ****************************************************************  
// FILE: IntegerList.java  
//  
// Purpose: Define an IntegerList class with methods to create, fill,  
// sort, and search in a list of integers.  
//  
// ****************************************************************  
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class IntegerList  {  
    int[] list; //values in the list  
    //------------------------------------------------------------   
    // Constructor -- takes an integer and creates a list of that   
    // size. All elements default to value 0.  
    //------------------------------------------------------------   
    public IntegerList(int size)  {  
        list = new int[size];  
    }  
    //------------------------------------------------------------   
    // randomize -- fills the array with randomly generated integers   
    // between 1 and 100, inclusive  
    //------------------------------------------------------------   
    public void randomize()  {
        if(list.length <= 100){
           for (int i=0; i<list.length; i++)  
                list[i] = (int)(Math.random() * 100) + 1; 
        }else{
            for (int i=0; i<list.length; i++)  
                list[i] = (int)(Math.random() * list.length) + 1;
        }
           
    }
    public void print()  {  
        for (int i=0; i<list.length; i++)  
            System.out.println(i + ":\t" + list[i]);  
    }
    //------------------------------------------------------------   
    // fillSorted -- fills the array with sorted values   
    //------------------------------------------------------------   
    public void fillSorted()  {  
        for (int i=0; i<list.length; i++)  
            list[i] = i + 2;  
    }  
    //------------------------------------------------------------   
    // print -- prints array elements with indices, one per line   
    //------------------------------------------------------------   
    public String toString()  {  
        String s = "";  
        for (int i=0; i<list.length; i++)  
            s += i + ":\t" + list[i] + "\n";  
        return s;  
    }  
    //------------------------------------------------------------   
    // linearSearch -- takes a target value and returns the index   
    // of the first occurrence of target in the list. Returns -1   
    // if target does not appear in the list  
    //------------------------------------------------------------   
    public int linearSearch(int target)  {  
        int location = -1;  
        for (int i=0; i<list.length && location == -1; i++)   
            if (list[i] == target) 
                location = i;  
        return location;  
    }  
    //------------------------------------------------------------   
    // sortIncreasing -- uses selection sort  
    //------------------------------------------------------------   
    public void sortIncreasing()  {  
        for (int i=0; i<list.length-1; i++)  {  
            int minIndex = minIndex(list, i);  
            swap(list, i, minIndex);  
        }
    }
    private int minIndex(int[] list, int i) {
        int minIndex = i;
        for (int j = i+1; j < list.length; j++){
            if (list[j] < list[minIndex]){
                minIndex = j;
            }
        }
        return minIndex;
    }
    public void swap(int[] list, int x, int y){
        int temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }
    public int binarySearch(int target){
        int head = 0;
        int tail = list.length - 1;
        while (head <= tail) {
            int x = head + (tail - head)/2;   
            if (list[x] < target) {
                tail = x - 1;
            } 
            else if (list[x] > target) {
                head  = x + 1;
            } 
            else {
                return x;
            }
        }
        return -1;
    }
    public void sortDecreasing(){
        for (int i = 1; i < list.length; i++) {
            int j = i - 1;
            while (j >= 0 && list[j] < list[i]) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = list[i];
        }
    }
}
