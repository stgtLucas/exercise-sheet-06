package de.unistuttgart.iste.sqa.pse.sheet06.homework.exceptions;

/**
 * A SimpleHamsterGame with exceptions
 * 
 * @author (your name)
 */
public class LazyHamsterGame extends InternalLazyHamsterGame {

	/**
	 * Put the hamster code for running the game into this method.
	 */
	@Override
	protected void hamsterRun() {
		moveMultipleSteps(5);
	}

	// TODO add documentation and contracts here
	public void tryToMove() {
		// TODO Implement here.
	}

	// TODO add documentation and contracts here
	public void moveMultipleSteps(int numberOfSteps) {
		// TODO Implement here.
	}
	
	// TODO add documentation and contracts here
	public boolean isCaged() {
		// TODO Implement here.
		return true; // delete this line, if necessary.
	}
	
}
