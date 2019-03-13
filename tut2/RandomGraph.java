public class RandomGraph {
	public static void main(String args[])
	{
		if (args.length < 2)
			System.out.println("Error #1: two aarguments expected.");
		else
		{
			int			n;
			double		p;
			double[][]	points;
			double		single_degree;
			double		degree;

			n = Integer.parseInt(args[0]);
			p = Double.parseDouble(args[1]);
			points = new double[n][2];
			single_degree = Math.PI * 2 / n;
			degree = 0;
			// Initialisation :
			for (int i = 0; i < n; i++)
			{
					points[i][0] = Math.cos(degree);
					points[i][1] = Math.sin(degree);
					degree += single_degree;
			}
			// Drawing :
			StdDraw.setXscale(-2, 2);
			StdDraw.setYscale(-2, 2);
			for (int i = 0; i < n; i++)
			{
				StdDraw.point(points[i][0], points[i][1]);
				for (int j = i + 1; j < n; j++)
				{
					if (Math.random() <= p)
					{
						StdDraw.line(
								points[i][0], points[i][1], 
								points[j][0], points[j][1]
								);
					}
				}
			}
			
		}
	}
}
