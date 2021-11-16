package de.unistuttgart.iste.sqa.pse.sheet06.presence.exercise1;

import de.hamstersimulator.objectsfirst.external.model.SimpleHamsterGame;

/**
 * This class is used to solve some easy tasks and to show how Artemis works.
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
	 * Put the hamster code into this method.
	 */
	@Override
	protected void run() {
		// insert your code here
	}
}
