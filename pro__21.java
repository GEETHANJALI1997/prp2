import java.io.*;
import java.util.*;
class pro__21
{
    public static void main(String args[])
    {
        int a[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
          a[i]=Integer.parseInt(args[i]);
        }
        ArrayList<Integer> al1=new ArrayList<Integer>();
        ArrayList<Integer> al2=new ArrayList<Integer>();
        int sum1=0,sum2=0,avg1=0,avg2=0;
        for(int i=0;i<a.length-1;i++)
        { 
            al1.add(a[i]);
           
            for(int i1=i+1;i1<a.length;i1++)
            {
              al2.add(a[i1]);
            }
            for(int g1=0;g1<al1.size();g1++)
            {
                sum1=sum1+al1.get(g1);
            }
            avg1=sum1/al1.size();
            for(int g2=0;g2<al2.size();g2++)
            {
                sum2=sum2+al2.get(g2);
            }
             avg2=sum2/al2.size();
            if(avg1==avg2)
             {
                 System.out.println(al1);
                 System.out.println(al2);
                  break;
             }
              if(al1.size()==a.length-1)
              {
                  System.out.print("invalid input");
              }
            
             al2.clear();
             sum1=0;
            avg1=0;
            sum2=0;
            avg2=0;
        }
    }
}




