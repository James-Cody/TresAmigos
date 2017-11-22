/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosControl.GameControl;
import threeamigos.ThreeAmigos;

/**
 *
 * @author Govert Carreño
 */
public class MainMenuView extends View {
    
    
    public MainMenuView() {
        this.displayMessage = "\n********** The Oregon Trail *********"
                 +  "\n*     1. Travel the trail           *"
                 +  "\n*     2. Learn about the trail      *"
                 +  "\n*     Q. Quit                       *"
                 +  "\n*     What is your choice?          *"
                 +  "\n*************************************";       
    }
     @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch(menuOption){
            case "1":
                this.travelTheTrail();
                break;
            case "2":
                this.learnAboutTheTrail();
                break;
            default :
                System.out.println("Invalid option, try again");
                break;
        }
        return false;
    }

    private void travelTheTrail() {
        int successGame = GameControl.createNewTravel(ThreeAmigos.getPlayer());
        
        if(successGame < 0) {
            System.out.println("Falied creating the game");
            return;
        }
        
        ChooseOcupationView ChooseOcupationMenu = new ChooseOcupationView();
        ChooseOcupationMenu.display();
    }

    private void learnAboutTheTrail() {
        ChooseOcupationView gameMenu = new ChooseOcupationView();
        gameMenu.displayAboutTheTrail();
    }
    
}
