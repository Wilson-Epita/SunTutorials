public class MakeADeal {
	public static void main(String args[])
	{
		if(args.length < 1)
			System.out.println("Error #1 : One argument expected");
		else
		{
			int		n = Integer.parseInt(args[0]);
			int		countSuccess = 0;
			double	stays;
			double changes;

			System.out.println("Running " + n + " simulations.");
			for(int i = 0; i < n; i++)
			{
				if (experience())
					countSuccess++;
			}
			stays = countSuccess / (double)n;
			changes = 1 - stays;
			System.out.println("Probability of win in stays:" + stays);
			System.out.println("Probability of win in changes:" + changes);
		}
	}

	public static boolean experience()
	{   
		boolean res_nochange;
		boolean[] doors = {false, false, false};

		int	winningDoor = (int)(3 * Math.random());
		int	firstPick = (int)(3 * Math.random());
		int openedDoor;
		int otherChoice;

		doors[winningDoor] = true;
		if (winningDoor == firstPick)
		{
			openedDoor = (firstPick + 1) % 3;
			otherChoice = (firstPick + 2) % 3;
		}
		else 
		{
			if (doors[(firstPick + 1) % 3])
			{
				openedDoor = (firstPick + 2) % 3;
				otherChoice = (firstPick + 1) % 3;
			}
			else
			{
				openedDoor = (firstPick + 1) % 3;
				otherChoice = (firstPick + 2) % 3;
			}
		}
		System.out.print(
				"winning_door=" + winningDoor +
				" first_pick=" + firstPick +
				" opened_door=" + openedDoor +
				" other_choice=" + otherChoice
				);
		res_nochange = (winningDoor == firstPick);
		if (res_nochange)
			System.out.println(" First pick wins!");
		else
			System.out.println(" Other choice wins!");
		return (res_nochange);
	}
}
