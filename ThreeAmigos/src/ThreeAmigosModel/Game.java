/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Cody
 */

public class Game implements Serializable{
    private double totalTime;
    private int noPeople;
    private Player player = new Player();
    private Map map = new Map();
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    
    public Game(){
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
}