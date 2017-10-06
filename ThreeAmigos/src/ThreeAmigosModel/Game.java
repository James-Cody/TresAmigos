/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosModel;

import java.io.Serializable;

/**
 *
 * @author Cody
 */

public class Game implements Serializable{
    private double totalTime;
    private int noPeople;
    private Player player;
    
    public Game(){
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
}