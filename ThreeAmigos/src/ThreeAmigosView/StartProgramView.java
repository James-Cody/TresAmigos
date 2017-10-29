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
                  "\n********************************"
                + "\n* THIS will be initial banner, *"
                + "\n* I hope cody and alex put     *"
                + "\n* the correct text here        *"
                + "\n********************************"
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
                  "\n================================"
                + "\nWelcome to Oregon Trail " + player.getName()
                + "\nWe hope you enjoy playing this"
                + "\n================================"
        );
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
    
}
