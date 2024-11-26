package de.unistuttgart.iste.sqa.pse.sheet06.homework.maze;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author Lucas Krämer
 * @author Sascha Hörner
 * @version 0.1
 */
public class AmazingPauleHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new AmazingPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public AmazingPauleHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/AmazingPauleTerritory.ter");
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
		while (!paule.grainAvailable()) {
			if (isLeftClear()) {
				turnLeft();
				paule.move();
			} else if (paule.frontIsClear()) {
				paule.move();
			} else {
				turnRight();
			}
		}

		paule.pickGrain();
		paule.write("Ich habe das Labyrinth gewonnen");
	}

	private boolean isLeftClear() {
		turnLeft();
		boolean leftClear = paule.frontIsClear();
		turnRight();
		return leftClear;
	}

	private void turnLeft() {
		paule.turnLeft();
	}

	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
