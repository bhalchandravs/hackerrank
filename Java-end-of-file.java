import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      //Solution using while loop
      int i = 0;
      while(scan.hasNext()){
           i++;
       System.out.println(i + " " + scan.nextLine());
      }
      
        //Solution using for loop
        for(int i=1;scan.hasNext();i++){
        System.out.println(i + " " + scan.nextLine());
        
    }
}
