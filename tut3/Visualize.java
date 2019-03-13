public class Visualize {
	public static void main(String args[])
	{
		if (args.length < 2)
			System.out.println("Error #1 : Two arguments expected");
		else
		{

			int			size = Integer.parseInt(args[0]);
			int			n = Integer.parseInt(args[1]);
			StdDraw.setScale(-0.5, size - 0.5);

			for (int i = 0; i < n; i++)
			{
				StdDraw.clear();
				boolean[][]	maze = RandomMaze.getMaze(size);
				display_maze(maze, size);

				int[]		start = Maze.random_pos(maze, size);
				int[]		end = Maze.random_pos(maze, size);
				display_extrem(start, end);

            	boolean[][]	solution = Maze.path(maze, start[0], start[1], end[0], end[1]);
				display_path(solution);
				while (!StdDraw.hasNextKeyTyped());
				StdDraw.nextKeyTyped();
			}

		}
	}

	public static void display_maze(boolean[][] maze, int size)
	{
		StdDraw.setPenColor(StdDraw.BLACK);
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (!maze[i][j])
					StdDraw.filledSquare(i, j, 0.5);
			}
		}
	}

    public static void display_extrem(int[] start, int[] end)
	{
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledSquare(start[0], start[1], 0.45);

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledSquare(end[0], end[1], 0.45);
	}

	public static void display_path(boolean[][] path)
	{
		int size = path.length;
		
		StdDraw.setPenColor(StdDraw.RED);
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (path[i][j])
					StdDraw.filledSquare(i, j, 0.4);
			}
		}
	}
}
