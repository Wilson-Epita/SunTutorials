public class UniformRandomNumbers {
	public static void main(String args[])
	{
		double	value;
		double	min;
		double	max;
		double	average;

		value = Math.random();
		min = value;
		max = value;
		average = value;
		for(int i = 0; i < 5; i++)
		{
			value = Math.random();
			System.out.println(value);
			min = Math.min(min, value);
			max = Math.max(max, value);
			average += value;
		}
		average /= 5;
		System.out.println(
				"Average : " + average + "\n" +
				"Min : " + min + "\n" +
				"Max : " + max
				);
	}
}
