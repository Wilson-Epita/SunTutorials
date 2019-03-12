public class ArgumentClinic {
	public static void main(String args[])
	{
		int	argc = args.length;

		if (argc == 0)
			System.out.println("*crickets*");
		else if (argc == 1)
			System.out.println(args[0] + " is arguing with themself.");
		else if (argc == 2)
			System.out.println(args[1] + " is having an argument with " + args[1] + ".");
		else
			System.out.println("Much hilarity ensues.");
	}
}
