/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.Items;
import ThreeAmigosModel.Map;
import ThreeAmigosModel.Player;
import java.util.ArrayList;
import threeamigos.ThreeAmigos;

/**
 *
 * @author Govert
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if(name == null) return null;// if invalid name return null
        
        Player player = new Player();//create new player
        player.setName(name);// set the name of the player
        ThreeAmigos.setPlayer(player);// save player
        return player;
    }

    public static int createNewTravel(Player player) {
        
        if(player == null) return -1;
        //Creating the CurrentGame
        CurrentGame currentGame = new CurrentGame();
        currentGame.setPlayer(player);
        
        //Creating the Items
        ArrayList<Items> items = ItemsControl.createItems();
        if(items.isEmpty()) return -1;
        currentGame.setItems(items);
        
        //Creating map
        Map map = MapControl.createMap(7,7,items);
        if(map == null) return -1;
        currentGame.setMap(map);
        
        ThreeAmigos.setCurrentGame(currentGame);
        
        return 1;
    }
}