/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosControl.GameControl;
import ThreeAmigosExcepetions.GameControlExceptions;
import ThreeAmigosModel.Player;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Govert Carreño
 */
public class StartProgramView extends View {
    
    public StartProgramView() {
        this.displayMessage = "\nPlease enter your name:";
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
    @Override
    public boolean doAction(String name) {
        try {
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
        } catch (GameControlExceptions ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        mainMenuView.display();
    }
    
}
