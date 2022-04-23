import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String str = input.next();
        input.close();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] digest = md.digest();
            for (byte byt : digest){
                System.out.printf("%02x",byt);
            }
        } catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
