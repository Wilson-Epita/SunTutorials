public class Maze
{
	public static int[] random_pos(boolean[][] maze, int size)
	{
		int[] pos = new int[2];

		do
		{
			pos[0] = (int)(Math.random() * size);
			pos[1] = (int)(Math.random() * size);
		} while (!maze[pos[0]][pos[1]]);

		return (pos);
	}
	
	public static boolean[][] path(boolean[][] maze, int x1, int y1, int x2, int y2)
	{
		int	size = maze.length;
		boolean[][] res = new boolean[size][size];

		backtracking(maze, x1, y1, x2, y2, res);
		res[x1][y1] = false;
		return (res);
	}

	public static boolean backtracking(boolean[][] maze, int x, int y, int endx, int endy, boolean[][] solution)
	{
		boolean	res;
		int		size = maze.length;

		if ((x == endx) && (y == endy))
		{
			res = true;
		}
		else if (x < 0 || x >= size || y < 0 || y > size || !maze[x][y])
			res = false;
		else
		{
			maze[x][y] = false;
			solution[x][y] = true;
			res = (
					backtracking(maze, x + 1, y, endx, endy, solution) ||
					backtracking(maze, x - 1, y, endx, endy, solution) ||
					backtracking(maze, x, y + 1, endx, endy, solution) ||
					backtracking(maze, x, y - 1, endx, endy, solution)
				);
			if (!res)
			{
				solution[x][y] = false;
				maze[x][y] = true;
			}
		}
		return (res);
	}
}
