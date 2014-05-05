
public class dicemethods 
{
	int roll;
	int mybounces;
	int die;
	int Throws=-1;
	public dicemethods(int bounces)
	{
		int die=1;
		mybounces=bounces;
	}
	
	public int dieone()
{
	int avg=0;
	for(int i = mybounces; i>0;i--)
	avg +=(1+(int)(Math.random()*6));
	avg/=mybounces;
	die=avg;
	return die;
	
	
}

public int score()
{
	Throws= Throws+1;
	return Throws;
}	
	
public int scoretwo()
{
	roll = die;
	return roll;		
}

	
}


