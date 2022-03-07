import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //cara pertama
        /*boolean isPalindrome = true;
        for(int i=0;i<1+s.length()/2;i++){
            if(!s.substring(i,i+1).equals(s.substring(s.length()-1-i,s.length()-i))){
               isPalindrome = false;
               break; 
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }*/
        
        //cara kedua
        /*boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder(s);
        String balikan = sb.reverse().toString();
        if(s.equals(balikan)){
            isPalindrome = true;
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }*/
        
        //cara ketiga
       /*boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder(s);
        String balikan = sb.reverse().toString();
        System.out.println(s.equals(balikan)?"Yes":"No");*/
        
        //cara keempat
        System.out.println(s.equals(new StringBuilder(s).reverse().toString())?"Yes":"No");
    }
}