package de.unistuttgart.iste.sqa.pse.sheet06.presence.exercise1;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * This class is used to solve some easy tasks.
 */
public class ArtemisPauleHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new ArtemisPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public ArtemisPauleHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/ArtemisPaule.ter");
		this.displayInNewGameWindow();
		game.startGame();

	}

	/**
	 * Clean every odd field and put Paule in position for the next exercise.
	 */
	private void cleanFirstRow() {
		// insert your code for a) here
	}

	/**
	 * Clean each even field and put Paule in position for the next exercise.
	 */
	private void cleanSecondRow() {
		// insert your code for b) here
	}

	/**
	 * Clean each field and place all seeds in the last field.
	 */
	private void cleanThirdRow() {
		// insert your code for c) here
	}

	@Override
	protected void run() {
		cleanFirstRow();
		cleanSecondRow();
		cleanThirdRow();
	}
}
