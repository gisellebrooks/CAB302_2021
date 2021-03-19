package journeyPlannerQuestion;

/* DON'T LOOK AT THE CODE BELOW UNTIL AFTER COMPLETING YOUR TESTS! */

/* Journey Planner program Version B */

import static java.lang.Math.abs;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

/* Comments have been removed from the code to make it harder
 * to debug by inspection
 */

public class JourneyPlannerB {

	private int originX, originY = 0;
	private int destinationX, destinationY = 0;
	private int minutesPerBlock;

	public JourneyPlannerB(int walkingSpeed) throws Exception {
		if (walkingSpeed > 0)
			minutesPerBlock = walkingSpeed;
		else
			throw new Exception("Walking speed must be positive");
	}
	
	public void setOrigin(int X, int Y) throws Exception {
		if (0 <= X && X < 10 && 0 <= Y && Y < 10) {
			originX = X; originY = Y;
		} else
			throw new Exception();
	}

	public void setDestination(int X, int Y) throws Exception {
		if (0 <= X && X <= 10 && 0 <= Y && Y <= 10) {
			destinationX = X; destinationY = Y;
		} else
			throw new Exception();
	}

	public int journeyTime() {
		return (abs(destinationX - originX) + (destinationY - originY))
		* minutesPerBlock;	
	}

}
