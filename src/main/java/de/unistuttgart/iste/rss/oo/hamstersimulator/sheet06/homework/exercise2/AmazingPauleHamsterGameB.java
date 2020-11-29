package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet06.homework.exercise2;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.SimpleHamsterGame;


/**
 * Beschreiben Sie hier die Klasse HomeworkHamster.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AmazingPauleHamsterGameB extends SimpleHamsterGame {
    
    /**
     * Ignore this method. Put your code in passTheMaze()
     */
    @Override
    protected void run() {
        this.loadTerritoryFromResourceFile("/territories/AmazingPauleTerritory.ter");
        this.displayInNewGameWindow();
        game.startGame();

        passTheMaze();
    }
    
    void passTheMaze() {
    	//insert your code here
    }
}
