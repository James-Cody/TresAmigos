/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.Location;
import threeamigos.ThreeAmigos;

/**
 *
 * @author Govert
 */
public class GameMenuView extends View{

    public GameMenuView() {
        displayMessage =  "\n********************************************"
                        + "\n*     1. Continue on trail                 *"
                        + "\n*     2. Check supplies                    *"
                        + "\n*     3. Check the map                     *"
                        + "\n*     4. Change pace                       *"
                        + "\n*     5. Change food rations               *"
                        + "\n*     6. Stop to rest                      *"
                        + "\n*     7. Attempt to trade                  *"
                        + "\n*     8. Hunt                              *"
                        + "\n*     What is your choice?                 *"
                        + "\n********************************************" ;
    }
    
    @Override
    public boolean doAction(String value) {
        switch(value){
            case "1":
                break;
            case "2":
                break;
            case "3":
                this.displayMap();
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
        }
        return false;
    }

    private void displayMap() {
        CurrentGame currentGame = ThreeAmigos.getCurrentGame();
        Location[][] locations = currentGame.getMap().getLocations();
        this.console.println("Map");
        this.console.println("   1  2  3  4  5  6  7");
        for(int x = 0; x < currentGame.getMap().getRowCount();x++){
            this.console.println("  ----------------------");
            this.console.print((x + 1) + " ");
            for(int y = 0; y < currentGame.getMap().getColumnCount();y++) {
                this.console.print("|");
                Location location = locations[x][y];
                if(location.getVisited()) {
                    this.console.print("XX");
                }
                else {
                    this.console.print("??");
                }
            }
            this.console.println("|");
        }
        this.console.println("  ----------------------");
    }
}
