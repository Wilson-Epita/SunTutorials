public class SideLength {
	public static void main(String args[])
	{
		int	argc = args.length;

		if (argc != 2)
			System.out.println("Error #1 : Two arguments expecetd.");
		else
		{
			double x, y, res;

			x = Double.parseDouble(args[0]);
			y = Double.parseDouble(args[1]);
			res = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			System.out.println(res);
		}
	}
}
