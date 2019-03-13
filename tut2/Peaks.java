public class Peaks {

	public static void main(String args[])
	{
		System.out.println("Start.");
		double[][] map = readMap();
		System.out.println("Map readed.");
		int n = map.length;
		int m = map[0].length;
		
		peak(map, n, m);
	}

	public static double[][] readMap()
	{
		int n = StdIn.readInt();
		int m = StdIn.readInt();
		double[][] res = new double[n][m];

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
				res[i][j] = StdIn.readDouble();
		}
		return (res);
	}

	public static void peak(double[][] map, int n, int m)
	{
		double height;

		for (int i = 1; i < n - 1; i++)
		{
			for (int j = 1; j < m - 1; j++)
			{
				height = map[i][j];
				if (
						height > map[i - 1][j] &&
						height > map[i + 1][j] &&
						height > map[i][j + 1] &&
						height > map[i][j - 1]
				)
					System.out.println(i + "," + j + "->" + height);
			}
		}
	}
}
