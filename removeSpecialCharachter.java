// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        String str = "aditya2!@#645^Ttr";
        
        //using replaceAll method
        String plianString= str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plianString);
    }
}