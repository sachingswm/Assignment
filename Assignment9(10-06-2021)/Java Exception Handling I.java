import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c); 
        }
        catch (InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e)
        {
        System.out.println(e);
        }
    }
    
}
