package edu.rw.lecture13.hw2;

import java.io.PrintWriter;

public class FileNotFoundException {
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
// providing the checked exception handler
        catch (Exception e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}
