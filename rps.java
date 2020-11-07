import java.util.*;
import java.lang.*;

class RockPaperScissor
{
	static int comp_lives= 5;
	static int user_lives= 5;

	public static void comp_wins()
	{
		System.out.println("\nComputer wins.");
		user_lives--;
		System.out.println("Your live left: "+user_lives+"\n");
	}

	public static void user_wins()
	{
		System.out.println("\nYou wins.");
		comp_lives--;
		System.out.println("Computer live left: "+comp_lives+"\n");
	}

	public static void help()
	{
		System.out.println("At any point type \n"
		+"Score - To display Scores.\n"
		+"Lives - To display Lives.\n"
		+"Rules - To see a list of Rules.\n");
	}
	public static void lives()
	{
		System.out.println("your lives- "+user_lives);
		System.out.println("Computer lives-  "+comp_lives+"\n");
	}
	public static void rules()
	{
		System.out.println("**********************************************");
		System.out.println("Rules");
		System.out.println("**********************************************");
		System.out.println("-Rock looses against Paper");
		System.out.println("-Rock beats Scissors");
		System.out.println("-Paper beats Rock");
		System.out.println("-Paper looses against Scissors");
		System.out.println("-Scissors beats Paper");
		System.out.println("-Scissors looses against Rock");
		System.out.println("**********************************************\n");
	}

	public static void play()
	{
		comp_lives=5;
		user_lives=5;
		Scanner sc= new Scanner(System.in);
		Random num= new Random();
		String choice[]= {"rock", "paper", "scissor"};
		System.out.print("\nEnter your name: ");
		String name= sc.nextLine();
		//String user_choice="";
		System.out.println("\nChoice from following-\nRock/R\nPaper/P\nScissor/s\n");
		while(true)
		{

			System.out.print("\nEnter your choice: ");
			String user_choice= sc.nextLine();
			user_choice= user_choice.toLowerCase().trim();

			int random_value= num.nextInt(3);
			String comp_choice= choice[random_value];
			String comp_choice1= Character.toString(comp_choice.charAt(0));
			
			if(user_choice.equals(comp_choice) || user_choice.equals(comp_choice1))
			{
				System.out.println("Draw !");
			}
			else if((user_choice.equals("rock") || user_choice.equals("r"))  && comp_choice.equals("paper"))
			{
				comp_wins();
			}
			else if((user_choice.equals("rock") || user_choice.equals("r"))  && comp_choice.equals("scissor"))
			{
				user_wins();
			}
			else if((user_choice.equals("paper") || user_choice.equals("p"))  && comp_choice.equals("scissor"))
			{
				comp_wins();
			}
			else if((user_choice.equals("paper") || user_choice.equals("p"))  && comp_choice.equals("rock"))
			{
				user_wins();
			}
			else if((user_choice.equals("scissor") || user_choice.equals("s"))  && comp_choice.equals("rock"))
			{
				comp_wins();
			}
			else if((user_choice.equals("scissor") || user_choice.equals("s"))  && comp_choice.equals("paper"))
			{
				user_wins();
			}
			else if(user_choice.equals("help"))
			{
				help();
			}
			else if(user_choice.equals("lives"))
			{
				lives();
			}
			else if(user_choice.equals("rules"))
			{
				rules();
			}
			else if(user_choice.equals("exit"))
			{
					System.out.print("Are you sure want to exit? ");
					String check= sc.next();
					check= check.toLowerCase();
					if(check.equals("yes"))
						break;
			}
			else
			{
				System.out.println("\nWrong Choice!. \nPlease re-enter your choice.\n");
			}

			if(comp_lives==0)
			{
				System.out.println("Hola!!!!!\n"+name+" wins.");
				break;
			}
			else if(user_lives==0)
			{
				System.out.println("\nBetter luck next time.\nComputer wins.");
				break;
			}
		}
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		String start= "Live Rules You and Computer start with 5 lives.hjinn";
		char c='y';
		do {
			play();
			System.out.print("\nDo you want to play again? (Yes/No): ");
			String c1= sc.next();
			System.out.println();
			c= c1.toLowerCase().charAt(0);
		} while (c=='y');
		System.out.println("See you again. Bye!!!");

	}
}
