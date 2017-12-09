/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosModel.CurrentGame;
import threeamigos.ThreeAmigos;

/**
 *
 * @author Govert Carreño
 */
public class ChooseMonthView extends View{

    
    public ChooseMonthView() {
        this.displayMessage =  "\n***************** The Oregon Trail **********************"
                             + "\n*     Choose a month to begin your journey:             *"    
                             + "\n*     1. March                                          *"
                             + "\n*     2. April                                          *"
                             + "\n*     3. May                                            *"    
                             + "\n*     4. June                                           *"
                             + "\n*     5. July                                           *"
                             + "\n*     6. When should I leave?                           *"
                             + "\n*     What is your choice?                              *"
                             + "\n*********************************************************";
    }
    
    @Override
    public boolean doAction(String value) {
        CurrentGame game = ThreeAmigos.getCurrentGame();
        switch(value){
            case "1":
                game.setMonth(3);
                break;
            case "2":
                game.setMonth(4);
                break;
            case "3":
                game.setMonth(5);
                break;
            case "4":
                game.setMonth(6);
                break;
            case "5":
                game.setMonth(7);
                break;
            case "6":
                this.help();
                break;
        }
        ThreeAmigos.setCurrentGame(game);
        MattsGeneralStoreView generalStoreView = new MattsGeneralStoreView();
        generalStoreView.display();
        return false;
    }

    private void help() {
        this.console.println("Help");
    }
    
}
