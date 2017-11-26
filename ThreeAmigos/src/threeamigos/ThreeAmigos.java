/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeamigos;

import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.Player;
import ThreeAmigosView.StartProgramView;


/**
 *
 * @author Cody
 */
public class ThreeAmigos {

    private static CurrentGame currentGame = null;
    private static Player player = null;

    public static CurrentGame getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(CurrentGame currentGame) {
        ThreeAmigos.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ThreeAmigos.player = player;
    }
    
    public static void main(String[] args) {
        
        //Test view layer
        StartProgramView startProgramView = new StartProgramView();
        try {
            startProgramView.display();
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            startProgramView.display();
        }
        
        
    }
    
}
