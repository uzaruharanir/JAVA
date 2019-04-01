import java.util.*;
class employee //This our class of employee
{
	Scanner jt=new Scanner(System.in);
	public employee()
	{
		float amount;
		int choice;
		System.out.println("Please enter your Gross salary");
		amount=jt.nextFloat();
		System.out.println("Enter method of payment\n1:Monthly\n2:Weekly\n3:Hourly");
		choice=jt.nextInt();
		if(choice==1)
		{
		System.out.println("SALARY="+((amount-(amount*0.33))+(amount*0.05))+" Rwf");	
		}
		else if(choice==2)
		{
		System.out.println("SALARY="+(amount+(amount*0.05))+" Rwf");	
		}
		else if(choice==3)
		{
			int hours;
		System.out.println("Enter the number of hours!");	
			hours=jt.nextInt();
			System.out.println("SALARY="+(amount*hours)+" Rwf");	
		}
        else
		{
			System.out.println("WRONG CHOICE!");
		}
	}
}
public class work {

    public static void main(String args[]) {
    employee water=new employee();
    }
    
    
}