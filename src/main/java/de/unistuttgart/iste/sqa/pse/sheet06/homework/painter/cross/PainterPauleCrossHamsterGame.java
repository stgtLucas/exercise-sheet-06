package de.unistuttgart.iste.sqa.pse.sheet06.homework.painter.cross;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author (Your name)
 * @version (a version number or a date)
 */
public class PainterPauleCrossHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new PainterPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public PainterPauleCrossHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/PainterPauleTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	@Override
	protected void run() {
		cross();
	}

	private void turnRight(){
		for (int i = 0; i <3; i++){
			paule.turnLeft();
		}
	}

	/**
	 * Makes Paule follow a zigzag path, placing grains at each position.
	 *
	 * Preconditions:
	 * Paule is positioned to start the zigzag movement.
	 * Path ahead is clear for movement.
	 *
	 * Postconditions:
	 * Grains are placed along the zigzag path.
	 * Paule ends in a position based on the grid and movement logic.
	 */

	private void cross() {
		paule.putGrain();
		while (paule.frontIsClear()){
			paule.move();
			turnRight();
			paule.move();
			paule.turnLeft();
			paule.putGrain();}
		paule.turnLeft();
		while (paule.frontIsClear()){
			paule.move();}
		paule.turnLeft();
		paule.putGrain();
		while (paule.frontIsClear()){
			paule.move();
			paule.turnLeft();
			paule.move();
			turnRight();
			paule.putGrain();}}
}
