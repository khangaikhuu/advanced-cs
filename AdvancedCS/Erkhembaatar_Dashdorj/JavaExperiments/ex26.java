import java.util.Scanner;
public class ex26
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		while(true)
		{
			int read = reader.nextInt();
			sum = sum + read; 
			System.out.println("Sum now: " + sum);
			if(read ==0)
			{
				break;
			}
		}
		System.out.println("Sum in the end: " +sum);

	}
}

