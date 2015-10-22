import java.util.Random;;

public class RandomNumber
{

	public int Generate()
	{
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}

}
