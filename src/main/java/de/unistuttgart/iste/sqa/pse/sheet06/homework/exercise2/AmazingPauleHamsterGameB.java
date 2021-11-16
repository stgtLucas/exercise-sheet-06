package de.unistuttgart.iste.sqa.pse.sheet06.homework.exercise2;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author (Your name)
 * @version (a version number or a date)
 */
public class AmazingPauleHamsterGameB extends SimpleHamsterGame {

	/**
	 * Creates a new AmazingPauleHamsterGameB.<br>
	 * Do not modify!
	 */
	public AmazingPauleHamsterGameB() {
		this.loadTerritoryFromResourceFile("/territories/AmazingPauleBTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Ignore this method.<br>
	 * Put your code in passTheMaze()!
	 */
	@Override
	protected void run() {
		passTheMaze();
	}

	void passTheMaze() {
		// insert your code here
	}
}
