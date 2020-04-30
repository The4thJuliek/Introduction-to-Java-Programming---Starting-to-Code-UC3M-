Modeling maze problem and maze solution

Mazes can be modeled using arrays. We will use an array of characters to represent the problem and a
different one to represent the solution. In the picture below you can see an example of these arrays:

The first array represents the maze problem using numbers: '0' - obstacle, '1' - open space,  '2' - path taken and  '3' - goal
The second array represents the output of the maze problem in the initial state using symbols to improve readability:
'#' - obstacle, '.' - open space, '+' path taken and '*' goal. Be aware that there is only one position marked as
"path taken" ('+'), this position corresponds to the entrance of the maze, since we have not started to explore it yet.
The third array represents the output of the maze problem in the final state. Notice how, in this case, there
is a set of positions marked as "path taken" ('+') from the initial state to the end of the maze ('*').
Notice how the path taken corresponds to an allowed path (marked with 1 in the first figure).

In this activity you will learn how to translate the maze problem definition (1st array) to the maze initial state (2nd array):

1. Select Main file, look carefully at the code and try to figure out what it does.
2. Click compile button and then run button to see the result.
3. Remember to compile again after each change.
4. You can modify the code; if you mess up, you can reload the page and start again as many times as you want.
5. Different mazes can be designed by changing the values in the bi-dimensional array called maze.
   Try to reproduce some of the mazes that you have solved in previous exercises. 
6. Modify the symbols to be displayed in the output when you print the maze changing the values in the array
   MAZE_SYMBOLS to adapt them to your preferences.


/**
 * Main class of the Java program.
 * This code allows you to model and print a Maze.
 *
 */

public class Main {
	// 0 - obstacle
	// 1 - open space
	// 2 - path taken
	// 3 - goal
	private static int[][] maze =
		{{0, 0, 1, 1, 1, 1, 1, 1},
		{2, 0, 1, 0, 0, 0, 1, 1},
		{1, 0, 1, 0, 0, 0, 0, 0},
		{1, 1, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 1, 2, 1, 1},
		{0, 0, 1, 0, 1, 0, 0, 1},
		{1, 2, 1, 1, 1, 0, 0, 0},
		{1, 1, 1, 0, 1, 3, 1, 0}};
	// use symbols to make reading the output easier...
	// 0 - obstacle - '#'
	// 1 - open space - '.'
	// 2 - path taken - '+'
	// 3 - goal - '*'
	private static final char[] MAZE_SYMBOLS = {'#', '.', '+', '*' };


	//Try to findPathFrom initial position if the maze is solved print the solution
	public static void main(String[] args) {
		print();
	}

	//print the output using MAZE_SYMBOLS
	private static void print(){
		for(int row = 0; row < maze.length; ++row) {
			for(int col = 0; col < maze[row].length; ++col) {
				System.out.print(MAZE_SYMBOLS[maze[row][col]]);
			}
			System.out.println();
		}
	}
}
