
package Strategies;

import Game.Player;


public class TitForTat extends IStrategy {
    @Override
    public String toString() {
        return "Tit-for-Tat"; 
    }

    @Override
    public boolean chooseStrategy(Player me, Player opponent, boolean information) {
        if (information) return opponent.getLastMove(); 
        else return IStrategy.makeRandomMove();
    }

    @Override
    public boolean isTitForTat() {
        return true;
    }
    
}