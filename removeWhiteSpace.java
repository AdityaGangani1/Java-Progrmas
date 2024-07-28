    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online
    import java.io.*;
    import java.util.Scanner;
    
    class HelloWorld {
        
        public static void main (String[] args){
            
                String str = "    J a v a L a n g u a g e    ";
       //before  & after
       String trimmer = str.trim();
       System.out.println(trimmer);
       
       //all spce are removes
       String trimString = str.replaceAll("\\s", "");
       System.out.println(trimString);
        }
    }