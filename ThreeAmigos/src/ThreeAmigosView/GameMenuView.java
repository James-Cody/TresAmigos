/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosControl.GameControl;
import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.Location;
import java.util.concurrent.ExecutionException;
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
                        + "\n*     9. Save game                         *"
                        + "\n*    10. Print wagon party                 *"
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
            case "9":
                this.saveGame();
                break;
            case "10":
                this.printWagonParty();
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

    private void saveGame() {
        this.console.println("\n\n Enter the file path for file where the game "
                + "is to be saved");
        String filePath = this.getInput();
        
        try{
            GameControl.saveGame(ThreeAmigos.getCurrentGame(), filePath);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
        
    }

    private void printWagonParty() {
        this.console.println("\n\n Enter the file path for file where the game "
                + "is to be saved");
        String filePath = this.getInput();
        
        try{
            GameControl.printWagonParty(ThreeAmigos.getCurrentGame().getPartyMembers(), filePath);
            this.console.println("List saved successfuly");
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }
}
