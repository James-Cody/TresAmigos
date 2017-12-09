/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

/**
 *
 * @author Govert Carreño
 */
public class MattsGeneralStoreView extends View {
    private String menu;
    public MattsGeneralStoreView() {
        this.displayMessage =  "\n******** The Oregon Trail – Matt’s General Store  ********"
                             + "\n*     Choose an item to add to your order:               *"
                             + "\n*     1. Oxen                              $0            *"
                             + "\n*     2. Food                              $0            *"
                             + "\n*     3. Clothing                          $0            *"
                             + "\n*     4. Ammunition                        $0            *"
                             + "\n*     5. Spare Parts                       $0            *"
                             + "\n*               Total Bill                 $0            *"
                             + "\n*               Total Funds                $800          *"
                             + "\n*               Funds Remaining            $800          *"
                             + "\n*     What is your choice (C to continue)?       *"
                             + "\n**********************************************************";
        this.menu = this.displayMessage;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch(value){
            case "1":
                this.buyOxen();
                break;
            case "2":
                this.buyFood();
                break;
            case "3":
                this.buyCloth();
                break;
            case "4":
                this.buyAmmunition();
                break;
            case "5":
                this.buySpareParts();
                break;
            case "C":
                this.displayNextView();
                break;
                default:
                    break;
        }
        return false;
    }

    private void displayNextView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void buyOxen() {
        this.displayMessage = this.menu
                            + "Each Oxen has a cost of $40, "
                            + "how much do you want to buy?"
                            + "\nPres Q to return to Matt's General Store.";
        String res = this.getInput();
        res = res.toUpperCase();
        if(res.equals("Q")) {
            this.displayMessage = this.menu;
            this.display();
            return;
        }
        
        
    }

    private void buyFood() {
        this.console.println("buyFood");
    }

    private void buyCloth() {
        this.console.println("buyCloth");
    }

    private void buyAmmunition() {
        this.console.println("buyAmmunition");
    }

    private void buySpareParts() {
        this.console.println("buySpareParts");
    }
    
}
