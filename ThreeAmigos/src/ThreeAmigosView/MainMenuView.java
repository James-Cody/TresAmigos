/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosControl.GameControl;
import ThreeAmigosExcepetions.GameControlExceptions;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            menuOption = menuOption.toUpperCase();
            switch(menuOption){
                case "1":
                    this.travelTheTrail();
                    break;
                case "2":
                    this.learnAboutTheTrail();
                    break;
                default :
                    ErrorView.display(this.getClass().getName(),"Invalid option, try again");
                    break;
            }
        } catch (GameControlExceptions ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void travelTheTrail() throws GameControlExceptions {
        
        GameControl.createNewTravel(ThreeAmigos.getPlayer());
        
        ChooseOcupationView ChooseOcupationMenu = new ChooseOcupationView();
        ChooseOcupationMenu.display();
    }

    private void learnAboutTheTrail() {
        ChooseOcupationView gameMenu = new ChooseOcupationView();
        gameMenu.displayAboutTheTrail();
    }
    
}
