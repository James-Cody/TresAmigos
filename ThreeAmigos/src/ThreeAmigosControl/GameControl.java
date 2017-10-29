/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.Player;
import ThreeAmigosModel.Progress;
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
  
    /*public void startGame(location, players, partyStatus, score) {*/
    public String startGame(Progress progress, CurrentGame currentGame, double score) {
        String res = "";
        
        if (score <= 0) res = "There is not score";
        if (progress.getLocation() == 0) res = "Invalid location";
        if (currentGame.getPartyMembers().isEmpty()) res = "there are no party members";
        
        return res;
    }  
    public String saveGame(Progress progress, CurrentGame currentGame, double score) {
        /*
        If score is less than 0, return error
        If location is not A, B, or C, return error
        If players is less than 0 or greater than 5, return error
        If party status is not A, B, or C, return error
        */
        String res = "";
        if (score <= 0) res = "There is not score";
        if (progress.getLocation() == 0) res = "Invalid location";
        if (currentGame.getPartyMembers().isEmpty()) res = "there is not party members";
        
        return res;
    }  
    public String winningLosing(double score,Progress progress) {
        /*
        If score is less than 0, return error
        If location is oregon then return "Game finished, you won"
        */
        String res = "";
        if(score == 0) res = "Game Over";
        if(progress.getLocation() == 25) res = "Win"; //City 25 is the last city
        
        return res;
        
    }  
    public String getScore(CurrentGame game, double distanceTraveled) {
        /*
         * Checking for if party members is less than 0 error or greater than 5 
        error
            Distance traveled if less than 0 error
         */
        String res = "";
        if (game.getPartyMembers().size() <= 0) res = "There is not party members";
        if (distanceTraveled < 0 ) res = "Distance traveled error.";
        
        return res;
        
    }
    public String quit(Progress progress, CurrentGame currentGame, double score) {
        /*
        If score is less than 0, return error
        If location is not A, B, or C, return error
        If players is less than 0 or greater than 5, return error
        If party status is not A, B, or C, return error
        */
        String res = "";
        
        if (score <= 0) res = "There is not score";
        if (progress.getLocation() == 0) res = "Invalid location";
        if (currentGame.getPartyMembers().isEmpty()) res = "there is not party members";
        
        return res;
    }  
}
