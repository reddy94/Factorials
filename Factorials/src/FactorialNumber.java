
public class FactorialNumber {
	public static int FactNo(int n)
	{
	  int i,fact=1;
	  for(i=n;i>0;i--)
	   
	     fact=fact*i;
	     return fact;
	}
	 public static void main(String[] args)
	   {
	    int n=6;
	    int fact=FactNo(n);
	    System.out.println(fact);
	   }
	
}
