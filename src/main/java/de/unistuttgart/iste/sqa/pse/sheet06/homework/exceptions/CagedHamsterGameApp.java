package de.unistuttgart.iste.sqa.pse.sheet06.homework.exceptions;

public class CagedHamsterGameApp {
	public static void main(String[] args) {
		final LazyHamsterGame game = new LazyHamsterGame("/territories/NoWayToGoTerritory.ter");
		game.doRun();
	}
}
