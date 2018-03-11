
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(600);
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenWidth(10);
		rob.hide();
		for (int i = 1; i < 6; i++) {

			// 2. Make the robot draw a star shape. Hint: 144.

			for (int i1 = 1; i1 < 6; i1++) {
				rob.turn(144);
				rob.move(144);

			}
			rob.turn(-90);
			rob.penUp();
			rob.move(200);
			rob.turn(90);
rob.penDown();
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
