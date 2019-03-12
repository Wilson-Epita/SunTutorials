public class DividesEvenly {
	public static void main(String args[])
	{
		int argc = args.length;

		if (argc != 2)
			System.out.println("Error #1 : Two pqrqmeters expected.");
		else
		{
			int		x, y;
			boolean	res;

			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			res = ((x % y == 0) || (y % x == 0));
			System.out.println(res);
		}
	}
}
