public class CoinToss {
	public static void main(String args[])
	{
		if(args.length < 1)
			System.out.println("Error #1 : One argument expected");
		else
		{
			int		n = Integer.parseInt(args[0]);
			int		countSuccess = 0;
			double	average;

			System.out.println("Running " + n + " simulations.");
			for(int i = 0; i < n; i++)
			{
				if (experience())
					countSuccess++;
			}
			average = countSuccess / (double)n;
			System.out.println(average);
		}
	}

	public static boolean experience()
	{
		int countAlice = 2;
		int countBob = 2;
		boolean coin = (Math.random() > 0.5);
		boolean previous = (Math.random() > 0.5);
		boolean res;
        
		System.out.print("Alice:");
        printCoin(previous);
		printCoin(coin);
		while(!(previous && coin))
		{
			countAlice++;
			previous = coin;
			coin = (Math.random() > 0.5);
			printCoin(coin);
		}
		previous = (Math.random() > 0.5);
		coin = (Math.random() > 0.5);
		System.out.print(" Bob:");
		printCoin(previous);
		printCoin(coin);
		while(!(previous && !coin))
		{
			countBob++;
			previous = coin;
			coin = (Math.random() > 0.5);
			printCoin(coin);
		}
		res = (countAlice < countBob);
		if (res)
			System.out.print(" Alice has fewer.");
		System.out.println();
		return (res);
	}

	public static void printCoin(boolean coin)
	{
		if (coin)
			System.out.print("H");
		else
			System.out.print("T");
	}
}
