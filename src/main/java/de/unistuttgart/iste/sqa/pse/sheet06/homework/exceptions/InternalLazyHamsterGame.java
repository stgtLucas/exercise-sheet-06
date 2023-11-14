package de.unistuttgart.iste.sqa.pse.sheet06.homework.exceptions;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

public abstract class InternalLazyHamsterGame extends SimpleHamsterGame {
	/**
	 * This constructor is used for loading a territory for the game and for displaying it.
	 */
	InternalLazyHamsterGame() {
		// use this territory, to run on normal territory
		//this.loadTerritoryFromResourceFile("/territories/Territory.ter");
		// use this territory to run on claustrophobic territory 
		this.loadTerritoryFromResourceFile("/territories/NoWayToGoTerritory.ter");
		this.displayInNewGameWindow();
	}

	@Override
	protected void run() {
		game.startGame();
		hamsterRun();
		game.stopGame();
	}

	/**
	 * This method contains everything that the hamster is supposed to do.
	 */
	abstract void hamsterRun();
}
