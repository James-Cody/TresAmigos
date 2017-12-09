/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosExcepetions.GameControlExceptions;
import ThreeAmigosModel.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
import threeamigos.ThreeAmigos;


/**
 *
 * @author Govert Carreno
 */
class ChooseOcupationView extends View {
    
    
    public ChooseOcupationView() {
        this.displayMessage =  "\n********** The Oregon Trail **********"
                            +  "\n*     Choose your occupation:        *"
                            +  "\n*     1. Banker from Boston          *"     
                            +  "\n*     2. Carpenter from Ohio         *"
                            +  "\n*     3. Farmer from Illinois        *"
                            +  "\n*     4. Which one should I choose?  *"
                            +  "\n*     What is your choice?           *"
                            +  "\n**************************************";

    }

    
    @Override
    public boolean doAction(String menuOption) {
        try {
            menuOption = menuOption.toUpperCase();
            switch(menuOption){
                case "1":
                    this.chooseOcupation(1);
                    break;
                case "2":
                    this.chooseOcupation(2);
                    break;
                case "3":
                    this.chooseOcupation(3);
                    break;
                case "4":
                    this.helpOnChoose();
                    break;
                default :
                    ErrorView.display(this.getClass().getName(),"Invalid option, try again");
                    break;
            }
            
        } catch (Exception ex) {
            this.console.println(ex.getMessage());
        }
        return false;
    }
    
    private void chooseOcupation(int i) throws Exception {
        WagonPartyView wagonPartyView = new WagonPartyView();
        Player player = ThreeAmigos.getCurrentGame().getPlayer();
        
        switch (i) {
            case 1: //Banker
                player.setOcupation("Banker");
                player.setAmount(1600);
                break;
            case 2: //Carpenter
                player.setOcupation("Carpenter");
                player.setAmount(800);
                break;
            case 3: // Farmer
                player.setOcupation("Farmer");
                player.setAmount(400);
                break;
            default:
                throw new GameControlExceptions("Error while adding ocupation");
        }
        ThreeAmigos.getCurrentGame().setPlayer(player);
        wagonPartyView.display();
    }
    
    private void helpOnChoose() {
        this.console.println("Which one should I use?");
    }

    void displayAboutTheTrail() {
        AboutTheTrailView aboutTheTrailView = new AboutTheTrailView();
        aboutTheTrailView.display();      
    }  
    
}
