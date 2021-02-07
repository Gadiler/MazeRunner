package mazeRunner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Maze Runner!\n");
		
		Maze maze = new Maze();
		maze.printMap();
		maze.start();
	}
}
