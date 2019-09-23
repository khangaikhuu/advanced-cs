public class Recursion
{
	public static int sum(int n)			
	{
		if(n>=1)
		{
			return sum(n-1)+n;
		}
		else{
			return n;
		}
	}
	public static int product(int n)
	{
		if(n>1)
		{	
			return product(n-1)*n;
		}
		else
		{	
			return n;	
		}
	}
	public static void main(String[] args)
	{	
		Recursion re = new Recursion(); 
		System.out.println(re.sum(7)); // 28 
		System.out.println(re.product(3)); //6
	}
}


/* Calculation
sum(6)+7
sum(5)+6+7
sum(4)+5+6+7
sum(3)+4+5+6+7
sum(2)+3+4+5+6+7
sum(1)+2+3+4+5+6+7
sum(0)+1+2+3+4+5+6+7
0+1+2+3+4+5+6+7 
return value = 28

product(3-1)*3
product(2-1)*2*3
1*2*3
return value = 6
*/


