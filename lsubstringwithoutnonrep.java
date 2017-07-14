import java.io.*;
import java.util.*;
class lsubstringwithoutnonrep
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        ArrayList<Integer> al=new ArrayList<Integer>();
        HashSet<Character> h=new HashSet<Character>();
		HashSet<String> h1=new HashSet<String>();
		String s1="";
        for(int i=0;i<inp.length();i++)
        {
            for(int j=i;j<inp.length();j++)
            {
               s1=inp.substring(i,j+1);
              char[] c=s1.toCharArray();
				for(int k=0;k<c.length;k++)
				{
					h.add(c[k]);
				}
				if(s1.length()==h.size())
				{
					h1.add(s1);
					al.add(s1.length());
				}
				h.clear();	
            }
        }
        Collections.sort(al);
		for(String z:h1)
		{
			if(z.length()==(int)al.get(al.size()-1))
			{
				System.out.println(z.length());
			}
		}
      
        
    }
}
