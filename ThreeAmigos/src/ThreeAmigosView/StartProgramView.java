/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosControl.GameControl;
import ThreeAmigosModel.Player;
import java.util.Scanner;

/**
 *
 * @author Govert Carreño
 */
public class StartProgramView {
    String promptMessage;
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name:";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                  "\n*************************************************"
                + "\n* In the far reaches of the Midwest, the people *"
                + "\n* in the United States decided to take their    *"
                + "\n* journeys into the far west. These people seek *"
                + "\n* to start a new life but are unaware of the    *"       
                + "\n* dangers that they will face on their journeys.*"
                + "\n*                                               *"    
                + "\n* You will have the opportunity to experience   *" 
                + "\n* a small bit of their journey and what they    *"         
                + "\n* went through in this game. You will make      *"
                + "\n* choices along your journey that will impact   *" 
                + "\n* the outcome of your game. Press forward taking*"
                + "\n* confidence that you will come out on top with *" 
                + "\n* the right choices.                            *"          
                + "\n*************************************************"
        );
    }

    public void displayStartProgramView() {
        boolean done;
        
        do {
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q")) 
                return;
            
            done = this.doAction(playerName);
        } while(!done);
    }

    private String getPlayerName() {
        String name = "";
        Scanner line = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            
            System.out.println("\n" + this.promptMessage);
            name = line.nextLine();
            name = name.trim();
            
            if(name.length() < 1){
                System.out.println("Invalid value, the valua cannot be blank");
                continue;
            }
            break;
        }
        return name;
    }

    private boolean doAction(String name) {
        // if the name is less than one character we'll have an error
        if(name.length() < 2){
            System.out.println("\nThe players name must me greater than one character lenght");
            return false;
        }
        Player player = GameControl.createPlayer(name);
        
        if(player == null){
            System.out.println("\n Error creating the player");
            return false;
        }
        
        
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println(
   		  "\n================================================"
                + "\nWelcome to The Oregon Trail " + player.getName()
                + "\nYour journey will be difficult "
                + "\nbut remember that with hope and"
                + "\nhard work, all things are possible."
                + "\n================================================"

        );
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
    
}
