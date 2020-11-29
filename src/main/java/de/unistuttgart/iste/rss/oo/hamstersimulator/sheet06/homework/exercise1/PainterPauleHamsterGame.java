package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet06.homework.exercise1;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.SimpleHamsterGame;


/**
 * Beschreiben Sie hier die Klasse HomeworkHamster.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PainterPauleHamsterGame extends SimpleHamsterGame {
    
    /**
     * Put the hamster code into this method.
     */
    @Override
    protected void run() {
        this.loadTerritoryFromResourceFile("/territories/PainterPauleTerritory.ter");
        this.displayInNewGameWindow();
        game.startGame();
        
        //insert your code here
    }
}
