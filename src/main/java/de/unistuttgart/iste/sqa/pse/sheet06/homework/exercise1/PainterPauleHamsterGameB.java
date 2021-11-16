package de.unistuttgart.iste.sqa.pse.sheet06.homework.exercise1;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author (Your name)
 * @version (a version number or a date)
 */
public class PainterPauleHamsterGameB extends SimpleHamsterGame {

	/**
	 * Creates a new PainterPauleHamsterGameB.<br>
	 * Do not modify!
	 */
	public PainterPauleHamsterGameB() {
		this.loadTerritoryFromResourceFile("/territories/PainterPauleBTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Put the hamster code into this method.<br>
	 * Solve the task in this method and NOT in the constructor!
	 */
	@Override
	protected void run() {
		// insert your code here
	}
}
