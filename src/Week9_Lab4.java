
//Son Ngo

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Week9_Lab4
{

	public static void main(String[] args)
	{
		RandomNumber rand = new RandomNumber();

		int[] aryOdd = new int[10];
		int[] aryEven = new int[10];
		int[] aryRandNum = new int[10];
		int[] aryResult = new int[10];
		int iCountOdd = 0;
		int iCountEven = 0;
		int iCountResult = 0;
		String sGuess;
		int iHigh;
		
		iHigh = Integer.parseInt(JOptionPane.showInputDialog("Enter high value: "));
		
		for (int i = 0; i < 10; i++)
		{
			aryRandNum[i] = rand.GetANumber(iHigh);
			int iMod = aryRandNum[i] % 2;

			sGuess = JOptionPane.showInputDialog(String.format("Round %d: ODD or EVEN: ", i + 1));

			while ((!sGuess.equals("ODD")) && (!sGuess.equals("EVEN")))
			{
				sGuess = JOptionPane.showInputDialog("Please enter again. ODD or EVEN: ");
			}

			if (sGuess.equals("ODD"))
			{
				aryOdd[i] = 1;
				aryEven[i] = 0;
				iCountOdd++;
			} else
			{
				aryOdd[i] = 0;
				aryEven[i] = 1;
				iCountEven++;
			}

			if (((sGuess.equals("ODD") && (iMod == 1)) || ((sGuess.equals("EVEN") && (iMod == 0)))))
			{
				aryResult[i] = 1;
				iCountResult++;
				if (aryOdd[i] == 1)
					JOptionPane.showMessageDialog(null,
							String.format(
									"Round %d:\nThe number is %d\nYou guessed ODD. Your guess is correct\nYou've guessed ODD %d times, EVEN %d times, and won %d times",
									i + 1, aryRandNum[i], iCountOdd, iCountEven, iCountResult));
				else
					JOptionPane.showMessageDialog(null,
							String.format(
									"Round %d:\nThe number is %d\nYou guessed EVEN. Your guess is correct\nYou've guessed ODD %d times, EVEN %d times, and won %d times",
									i + 1, aryRandNum[i], iCountOdd, iCountEven, iCountResult));
			} else
			{
				aryResult[i] = 0;
				if (aryOdd[i] == 1)
					JOptionPane.showMessageDialog(null,
							String.format(
									"Round %d:\nThe number is %d\nYou guessed ODD. Your guess is incorrect\nYou've guessed ODD %d times, EVEN %d times, and won %d times",
									i + 1, aryRandNum[i], iCountOdd, iCountEven, iCountResult));
				else
					JOptionPane.showMessageDialog(null,
							String.format(
									"Round %d:\nThe number is %d\nYou guessed EVEN. Your guess is incorrect\nYou've guessed ODD %d times, EVEN %d times, and won %d times",
									i + 1, aryRandNum[i], iCountOdd, iCountEven, iCountResult));
			}
		}
	}

}
