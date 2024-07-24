import java.io.*;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

String reverse = "hello";
char[] charArr = reverse.toCharArray();
for(int i=charArr.length-1; i>=0; i--){
System.out.println(charArr[i]);
}
    }
}