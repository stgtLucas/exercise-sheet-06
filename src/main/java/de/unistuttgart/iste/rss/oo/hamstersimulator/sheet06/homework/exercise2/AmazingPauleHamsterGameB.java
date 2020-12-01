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
     * Creats a new AmazingPauleHamsterGameB
     * do not modify
     */
    public AmazingPauleHamsterGameB() {
        this.loadTerritoryFromResourceFile("/territories/AmazingPauleBTerritory.ter");
        this.displayInNewGameWindow();
        game.startGame();
    }
    
    /**
     * Ignore this method. Put your code in passTheMaze()
     */
    @Override
    protected void run() {
        passTheMaze();
    }
    
    void passTheMaze() {
    	//insert your code here
    }
}
