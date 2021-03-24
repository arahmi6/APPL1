// ******************************************************************
//
// @author AULIA RAHMI
// 
// Write a program that prompts the user for a filename, 
// then opens a Scanner to the file and copies it, a line at a time, 
// to the standard output.
// 
// ******************************************************************
import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        String fileName;
        Scanner scan = new Scanner(System.in);
        File file;
        do {
            // Input File Path
            System.out.print("Enter file path : ");
            fileName = scan.nextLine();
            try {
                file = new File(fileName);
                scan = new Scanner(file);
                // Print the contents of the file
                while (scan.hasNext())
                    System.out.println(scan.nextLine());
            } catch (FileNotFoundException e) {
                // **********************************************************
                // If the user enters the name of a file that does not exist, 
                // ask for another name until you get one that refers to a 
                // valid file.
                // **********************************************************
                System.out.println("File not found! \n" + e);
                fileName = "";
            }
        } while (fileName.isEmpty());
    }
}
/*
    C:\Users\ASUS\Desktop\TokoBuku\hello.txt
    C:\Users\ASUS\Desktop\TokoBuku\about.dat
*/