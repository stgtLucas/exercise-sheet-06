package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet06.homework.exercise1;

import de.hamstersimulator.objectsfirst.external.model.SimpleHamsterGame;


/**
 * Beschreiben Sie hier die Klasse HomeworkHamster.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PainterPauleHamsterGameB extends SimpleHamsterGame {

    /**
     * Creates a new PainterPauleHamsterGameB
     * do not modify
     */
    public PainterPauleHamsterGameB() {
        this.loadTerritoryFromResourceFile("/territories/PainterPauleBTerritory.ter");
        this.displayInNewGameWindow();
        game.startGame();
    }
    
    /**
     * Put the hamster code into this method.
     * Solve the task in this method NOT in the constructor
     */
    @Override
    protected void run() {
        //insert your code here
    }
}
