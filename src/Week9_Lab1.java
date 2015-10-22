//Son Ngo

import java.util.Arrays;

public class Week9_Lab1
{

	public static void main(String[] args)
	{
		int [] aryNum = new int[6];
		int sum = 0;
		
		aryNum[0] = 123;
		aryNum[1] = 456;
		aryNum[2] = 479;
		aryNum[3] = 135;
		aryNum[4] = 246;
		aryNum[5] = 135;
		
		Arrays.sort(aryNum);
		
		for (int i=0; i < aryNum.length; i++)
		{
			System.out.println("num: " + aryNum[i]);
			sum = sum + aryNum[i];
		}

		System.out.println("The average value is " + (sum/6));
	}

}
