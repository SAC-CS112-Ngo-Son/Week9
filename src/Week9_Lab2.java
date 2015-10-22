
//Son Ngo

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class Week9_Lab2
{

	public static void main(String[] args)
	{
		Random rand = new Random();

		int [] aryOdd = new int[10];
		int [] aryEven = new int[10];
		int [] aryRandNum = new int[10];
		int [] aryResult = new int[10];
		int iCountOdd = 0; 
		int iCountEven = 0;
		int iCountResult = 0;
		String sGuess;

		for (int i = 0; i < 10; i++)
		{
			aryRandNum[i] = rand.nextInt(100);
			int iMod = aryRandNum[i] % 2;

			sGuess = JOptionPane.showInputDialog(String.format("Round %d: ODD or EVEN: ", i+1));

			while ((!sGuess.equals("ODD")) && (!sGuess.equals("EVEN")))
			{
				sGuess = JOptionPane.showInputDialog("Please enter again. ODD or EVEN: ");
			}
			
			if (sGuess.equals("ODD"))
			{
				aryOdd[i] = 1;
				aryEven[i] = 0;
			}
			else
			{
				aryOdd[i] = 0;
				aryEven[i] = 1;
			}

			if (((sGuess.equals("ODD") && (iMod == 1)) || ((sGuess.equals("EVEN") && (iMod == 0)))))				
				aryResult[i] = 1;
			else
				aryResult[i] = 0;
		}

		for (int j = 0; j < 10; j++)
		{
			if (aryOdd[j] == 1)
				iCountOdd++;
			if (aryEven[j] == 1)
				iCountEven++;
			if (aryResult[j] == 1)	
			{
				iCountResult++;
				if (aryOdd[j] == 1)
					JOptionPane.showMessageDialog(null, String.format("Round %d:\nThe number is %d\nYou guessed ODD. Your guess is correct\nYou've guessed ODD %d times, EVEN %d times, and won %d times",j+1,aryRandNum[j],iCountOdd,iCountEven,iCountResult));
				else
					JOptionPane.showMessageDialog(null, String.format("Round %d:\nThe number is %d\nYou guessed EVEN. Your guess is correct\nYou've guessed ODD %d times, EVEN %d times, and won %d times",j+1,aryRandNum[j],iCountOdd,iCountEven,iCountResult));
			}
			else
			{
				if (aryOdd[j] == 1)
					JOptionPane.showMessageDialog(null, String.format("Round %d:\nThe number is %d\nYou guessed ODD. Your guess is incorrect\nYou've guessed ODD %d times, EVEN %d times, and won %d times",j+1,aryRandNum[j],iCountOdd,iCountEven,iCountResult));
				else
					JOptionPane.showMessageDialog(null, String.format("Round %d:\nThe number is %d\nYou guessed EVEN. Your guess is incorrect\nYou've guessed ODD %d times, EVEN %d times, and won %d times",j+1,aryRandNum[j],iCountOdd,iCountEven,iCountResult));
			}
		}
	}

}
