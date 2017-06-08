import java.io.*;
import java.util.*;
public class subarr
{
   public static void main(String[] args)
   { int temp=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int b[]=new int[n];
    for(int i1=0;i1<n;i1++)
    {
        b[i1]=sc.nextInt();
    }
    for(int j=0;j<n;j++)
    {
        for(int k=0;k<n;k++)
        {
            if(a[j]==b[k])
            {
                temp=temp+1;
            }
        }
    }
    if(temp==n)
    {
        System.out.println("a is subset of b");
    }
    else
    {
        System.out.print("a is not subset of b");
    }
    




   }

}


