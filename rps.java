import java.util.Scanner;
import java.util.Random;

 class rps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num, userscore=0, compscore=0, choice;
		
		
		Random rand = new Random();
		int upperbound = 3;
		int randnum = rand.nextInt(upperbound);
		
		
		System.out.println("Enter an odd number: ");
		num = input.nextInt();
		
		do {
			System.out.println("Number is not odd. Enter again: ");
			num = input.nextInt();
		}while(num%0!=2);
		
		
		System.out.println("Enter rock (1), paper (2), or scissors(3): ");
		choice = input.nextInt();
		
		if(choice==2 && randnum==1)
		{
			System.out.println("You win. You chose paper, computer chose rock.");
		}
		if(choice==3 && randnum==2)
		{
			System.out.println("You win. You chose scissors, computer chose paper.");
		}
		if(choice==1 && randnum==3)
		{			
			System.out.println("You win. You chose rock, computer chose scissors.");
		}
		if(choice==2 && randnum==3)
		{
			System.out.println("You lose. You chose paper, computer chose scissors.");
		}
		if(choice==3 && randnum==1)
		{
			System.out.println("You lose. You chose scissors, computer chose rock.");
		}
		if(choice==1 && randnum==2)
		{
			System.out.println("You lose. You chose rock, computer chose paper.");
		}
		if(choice==1 && randnum==1)
		{
			System.out.println("You both chose rock");
		}
		if(choice==2 && randnum==2)
		{
			System.out.println("You both chose paper");
		}
		if(choice==3 && randnum==3)
		{
			System.out.println("You both chose scissors");
		}
		
		for(int i=0; i<=num; i++)
		{
			System.out.println("Enter rock (1), paper (2), or scissors(3): ");
			choice = input.nextInt();
			
			if(choice==2 && randnum==1)
			{
				System.out.println("You win. You chose paper, computer chose rock.");
				userscore++;
			}
			if(choice==3 && randnum==2)
			{
				System.out.println("You win. You chose scissors, computer chose paper.");
				userscore++;
			}
			if(choice==1 && randnum==3)
			{			
				System.out.println("You win. You chose rock, computer chose scissors.");
				userscore++;
			}
			if(choice==2 && randnum==3)
			{
				System.out.println("You lose. You chose paper, computer chose scissors.");
				compscore++;
			}
			if(choice==3 && randnum==1)
			{
				System.out.println("You lose. You chose scissors, computer chose rock.");
				compscore++;
			}
			if(choice==1 && randnum==2)
			{
				System.out.println("You lose. You chose rock, computer chose paper.");
				compscore++;
			}
			if(choice==1 && randnum==1)
			{
				System.out.println("You both chose rock");
			}
			if(choice==2 && randnum==2)
			{
				System.out.println("You both chose paper");
			}
			if(choice==3 && randnum==3)
			{
				System.out.println("You both chose scissors");
			}
			
			
			while(i==num)
			{
				System.out.println("The final score is "+userscore+" to "+compscore);
				if(userscore>compscore)
				{
					System.out.println("You won the series");
				}
				if(userscore<compscore)
				{
					System.out.println("You lost the series");
				}
			}
		}
		
		
		
	}

}

