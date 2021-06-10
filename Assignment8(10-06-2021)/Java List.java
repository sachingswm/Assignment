import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n1=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n1;i++)
            list.add(sc.nextInt());
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            
            String str=sc.next();
            if(str.compareTo("Insert")==0)
            {
                list.add(sc.nextInt(),sc.nextInt());
            }
            else
            {
                list.remove(sc.nextInt());
            }
        }
        for(int val:list)
            System.out.print(val+" ");
    }
}
