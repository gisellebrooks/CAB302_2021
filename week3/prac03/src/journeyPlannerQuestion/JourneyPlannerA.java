package journeyPlannerQuestion;

/* DON'T LOOK AT THE CODE BELOW UNTIL AFTER COMPLETING YOUR TESTS! */

/* Journey Planner program Version A */

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

/**
 * A tool to help plan pedestrian journeys in a large city's central business district which is laid out in a 10-block grid.
 *
 * The default origin and destination are 0,0.
 *
 */
public class JourneyPlannerA {

	private int originX, originY = 0;
	private int destinationX, destinationY = 0;
	private int minutesPerBlock;

	/**
	 * When constructed a journey planner needs to know how many minutes it takes you to walk one city block on average.
	 * @param walkingSpeed how many minutes it takes you to walk one block
	 * @throws Exception if the given speed is zero or negative
	 */
	public JourneyPlannerA(int walkingSpeed) throws Exception {
		if (walkingSpeed > 0)
			minutesPerBlock = walkingSpeed;
		else
			throw new Exception("Walking speed must be positive");
	}

	/**
	 * Sets the origin for your planned journey (provided a valid coordinate is supplied).
	 * @param X the origin's X-coordinate from 0 to 10
	 * @param Y the origin's Y-coordinate from 0 to 10
	 * @throws Exception if an invalid origin is supplied
	 */
	public void setOrigin(int X, int Y) throws Exception {
		if (0 <= X && X <= 10 && 0 <= Y && Y <= 10) {
			originX = X; originY = Y;
		} else
			throw new Exception();
	}

	/**
	 * Sets the destination for your planned journey (provided a valid coordinate is supplied).
	 * @param X the origin's X-coordinate from 0 to 10
	 * @param Y the origin's Y-coordinate from 0 to 10
	 * @throws Exception if an invalid destination is supplied
	 */
	public void setDestination(int X, int Y) throws Exception {
		if (0 <= X && X <= 10 && 0 <= Y && Y <= 10) {
			destinationX = X; destinationY = Y;
		} else
			throw new Exception();
	}

	/**
	 * Returns the journey time from the origin to the destination (calculated using Manhattan distances).
	 * @return your journey time in minutes
	 */
	public int journeyTime() {
		return (abs(destinationX - originX) + abs(destinationY - originY))
		* minutesPerBlock;	
	}

}
