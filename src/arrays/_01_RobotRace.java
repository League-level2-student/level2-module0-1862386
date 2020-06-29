package arrays;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {


		// 2. create an array of 5 robots.
		
		Robot[] robots = new Robot[5];
		
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			Robot bot = new Robot ();
		robots[i] = bot;
		robots[i].setX(i * 200);
		robots[i].setY(550);
		
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Integer[] name = new Integer[50];
		for (int i = 0; i < robots.length; i++) {
			int rand = (int) (Math.random() * 50);
			robots[i].move(rand);
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
  
		// 7. declare that robot is the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
