import java.util.Scanner;
public class dicegame 
{
public static void main(String[]args)
{
	Scanner input = new Scanner(System.in);
	int num2;
	int counter=0;
	
	{
		dicemethods number = new dicemethods(1);
		number.score();
		number.scoretwo();
	
	
	for(int loop=0;loop<100;loop++)
	{
	
	
	System.out.printf("\n Throws:%d  Last roll: %d \nThe number was: %d \n \n Press 1 to try again.\n ", number.score(),number.scoretwo(),number.dieone());
	num2= input.nextInt();
	if (num2==1)
	{	
	

		

	}
	}
	}
	
	
	
	}
	
}


// Close, but need to try harder please.
