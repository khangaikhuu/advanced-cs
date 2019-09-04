import java.util.Scanner;
public class firstTest
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String read;
		for(int i=0; i<15; i+=2){
		read = reader.nextLine();
		changePizza(read);

		
		}

		

	}


	public static String changePizza(String pizza)
	{
		String newPizza = pizza.substring(0,3)+ pizza.substring(0,3) + pizza.substring(0,3) + pizza;
		return newPizza;

	}
}


