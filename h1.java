import java.util.*;
public class UniqueChar
{
	public static void main(String[] args) {
	    System.out.println("Enter the sentence:");
	    Scanner sca=new Scanner(System.in);
		String x=sca.nextLine();
		LinkedHashSet result=new LinkedHashSet();
		int len=x.length(),i,size=0;
		char[] y=new char[len];
		LinkedHashSet z=new LinkedHashSet();
		for(i=0;i<len;i++)
		{
		    int as=x.charAt(i);
		    if(x.charAt(i)!=' ')
		    {
		        if((as>=48)&&(as<=57))
		        {
		            System.out.println("Invalid Sentence");
		            System.exit(0);
		        }
		        y[size]=x.charAt(i);
		        size++;
		    }
		}
		for (char c : y) {
		     //System.out.println(c);
		     if((result.add(c)==false)&&(z.add(c)==true))
		     result.remove(c);
		     else if((result.add(c)==false)&&(z.add(c)==false))
		     result.remove(c);
        } 
       Iterator it = result.iterator();
       //System.out.println("Elements in LinkedHashSet :");
       if(result.isEmpty()==false)
       {
           System.out.println("Unique characters:");
           while(it.hasNext())
           System.out.println(it.next());
       }
       else
       System.out.println("No unique characters");
	}
}