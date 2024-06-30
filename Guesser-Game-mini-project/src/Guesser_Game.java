import java.util.*;

class Guesser
{
	// Has Part
	int guessNum;
	
	//Does part
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Gusser Kindly Guess the number");
		guessNum = sc.nextInt();
		sc.close();
		return guessNum;
	}
}

class Player
{
	// Has Part
	int guessNum;
	
	//Does part
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player Kindly Guess the number");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Umpire
{
	// Has part
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	//Does part
	void collectNumFromGusser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}
	
	void compare() 
	{
		if(numFromGuesser == numFromPlayer1) 
		{
			if( numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3 )
			{
				System.out.println("Tie between all the Player");
			}
			else if(numFromGuesser == numFromPlayer2)
			{
				System.out.println("Player1 and Player2 won");
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player1 and Player3 won");
			}
			else
			{
				System.out.println("Player1 Won the Game");				
			}
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player2 and Player3 won");
			}
			else
			{
				System.out.println("Player2 Won the Game");				
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player3 Won the Game");
		}
		else
		{
			System.out.println("Game Lost, Try Again");
		}
	}
}

public class Guesser_Game 
{
	public static void main(String[] args) 
	{
		Umpire u = new Umpire();
		u.collectNumFromGusser();
		u.collectNumFromPlayer();
		u.compare();
	}
}
/*
 * max length guesser should guess the num between 1 to 10 else throw message
 * max length player should guess the num between 1 to 10 else throw message
 * */