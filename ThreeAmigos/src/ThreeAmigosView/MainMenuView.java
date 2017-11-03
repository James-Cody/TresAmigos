/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosControl.GameControl;
import java.util.Scanner;
import threeamigos.ThreeAmigos;

/**
 *
 * @author Govert Carreño
 */
class MainMenuView {
    
    private String menu;
    public MainMenuView() {
        this.menu = "\n********** The Oregon Trail *********"
                 +  "\n*     1. Travel the trail           *"
                 +  "\n*     2. Learn about the trail      *"
                 +  "\n*     3. Quit                       *"
                 +  "\n*     What is your choice?          *"
                 +  "\n*************************************";       
    }

    public void displayMainMenuView() {
        boolean done = false;
        do {
            
            //get the options
            String menuOption = this.getMenuOption();
            
            if(menuOption.toUpperCase().equals("Q")) return;
            
            done = this.doAction(menuOption);
        }while(!done);
        
    }

    private String getMenuOption() {
        String option = "";
        boolean done = false;
        Scanner line = new Scanner(System.in);
        do {
            System.out.println("\n" + this.menu);
            option = line.nextLine();
            option = option.trim();
            
            if(option.length() < 1) {
                System.out.println("Invalid option: the option can not be blank");
                continue;
            }
            break;
            
        }while(!done);
        return option;
    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch(menuOption){
            case "1":
                this.travelTheTrail();
                break;
            case "2":
                this.learnAboutTheTrail();
                break;
            case "3":
                this.quitGame();
                break;
            default :
                System.out.println("Invalid option, try again");
                break;
        }
        return false;
    }

    private void travelTheTrail() {
        GameControl.createNewTravel(ThreeAmigos.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayOcupationMenu();
    }

    private void learnAboutTheTrail() {
        System.out.println("tlearnabouttheGame ran");
    }

    private void quitGame() {
        System.out.println("quitGame ran");
    }
    
}
