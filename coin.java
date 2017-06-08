import java.io.*;
import java.util.*;
class coin
{
    public static void main(String args[])
    {   int count=0;
        Scanner sc=new Scanner(System.in);
        int coin=sc.nextInt();
        int rs=sc.nextInt();
        int coinname[]=new int[coin];
        for(int i=0;i<coin;i++)
        {
            coinname[i]=sc.nextInt();
        }
        Arrays.sort(coinname);
        for(int j=coin-1;j>=0;j--)
        {
            count=count+(rs/coinname[j]);
            rs=rs%coinname[j];
            if(rs==0)
            {
                break;
            }
        }
        
        System.out.println(count);
    }
}
