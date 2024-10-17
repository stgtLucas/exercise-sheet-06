package de.unistuttgart.iste.sqa.pse.sheet06.presence.stairs;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;
import de.unistuttgart.iste.sqa.pse.sheet06.presence.stairs.exceptions.ClimbingAbortedException;
import de.unistuttgart.iste.sqa.pse.sheet06.presence.stairs.exceptions.UnsurmountableStepException;

/**
 * Describe the purpose of this class here.
 *
 * @author (Your name)
 * @version (a version number or a date)
 */
public class StairsHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new StairsHamsterGame.<br>
	 */
	public StairsHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/TooHighStairsTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Ignore this method.<br>
	 * Put your code in climbStairs()!
	 */
	@Override
	protected void run() {
		climbStairs();
    }

	private void movePauleToNextStep() throws UnsurmountableStepException {
		// TODO implement 4 (a) here
	}

	private boolean hasReachedTop() {
		// TODO implement 4 (b) here
		return true; // TODO replace this line with your implementation
	}

	private void climbStairs() {
		// TODO implement 4 (c) here
	}

	/**
	 * Turns Paule 90 degree to his right.
	 */
	private void turnPauleRight() {
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
	}
}
