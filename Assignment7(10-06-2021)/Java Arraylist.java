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
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n1;i++)
        {
            int e=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<e;j++)
            {
                l.add(sc.nextInt());
            }
            list.add(l);
        }
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            int in=sc.nextInt();
            int iin=sc.nextInt();
            if(list.size()>=in && list.get(in-1).size()>=iin)
            {
                System.out.println(list.get(in-1).get(iin-1));
            }   
            else
            {
                System.out.println("ERROR!");
            }
        }
    }
}
