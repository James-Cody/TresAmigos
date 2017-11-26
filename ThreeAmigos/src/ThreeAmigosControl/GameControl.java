/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

import ThreeAmigosExcepetions.GameControlExceptions;
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

    public static Player createPlayer(String name) throws GameControlExceptions {
        if(name == null) throw new GameControlExceptions("The name cannot be null");
        
        Player player = new Player();//create new player
        player.setName(name);// set the name of the player
        ThreeAmigos.setPlayer(player);// save player
        return player;
    }

    public static void createNewTravel(Player player) throws GameControlExceptions {
        
        if(player == null) throw new GameControlExceptions("Error while creating the player");
        //Creating the CurrentGame
        CurrentGame currentGame = new CurrentGame();
        currentGame.setPlayer(player);
        
        //Creating the Items
        ArrayList<Items> items = ItemsControl.createItems();
        if(items.isEmpty()) throw new GameControlExceptions("The list of Items is actually empty");
        currentGame.setItems(items);
        
        //Creating map
        Map map = MapControl.createMap(7,7,items);
        if(map == null) throw new GameControlExceptions("Error while creating the Map");
        currentGame.setMap(map);
        
        ThreeAmigos.setCurrentGame(currentGame);
        
    }
}