/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosControl.ItemsControl;
import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.ItemList;
import ThreeAmigosModel.Items;
import java.util.ArrayList;
import threeamigos.ThreeAmigos;

/**
 *
 * @author Govert Carreño
 */
public class MattsGeneralStoreView extends View {
    private String menu;
    private ArrayList<Items> itemsList = null;
    
    float totOxen = 0;
    float totFoot = 0;
    float totCloth = 0;
    float totAmmunition = 0;
    
    public MattsGeneralStoreView() {
        this.displayMessage =  "\n******** The Oregon Trail – Matt’s General Store  ********"
                             + "\n*     Choose an item to add to your order:               *"
                             + "\n*     1. Oxen                              " + totOxen  + "           *"
                             + "\n*     2. Food                              " + totFoot  + "           *"
                             + "\n*     3. Clothing                          " + totCloth + "           *"
                             + "\n*     4. Ammunition                        " + totAmmunition + "           *"
                             + "\n*     5. Spare Parts                       $0            *"
                             + "\n*               Funds Remaining            $" + ThreeAmigos.getCurrentGame().getPlayer().getAmount() + "         *"
                             + "\n*     What is your choice (C to continue)?               *"
                             + "\n**********************************************************";
    }
    
    @Override
    public boolean doAction(String value) {
        //Add all the the items with 0 in stock
        itemsList = ItemsControl.createItems();
        
        
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
        //Save the list of items in the game
        CurrentGame game = ThreeAmigos.getCurrentGame();
        game.setItems(itemsList);
        
        ThreeAmigos.setCurrentGame(game);
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
    private void updateMenu(){
        this.menu =    "\n******** The Oregon Trail – Matt’s General Store  ********"
                     + "\n*     Choose an item to add to your order:               *"
                     + "\n*     1. Oxen                              " + totOxen  + "           *"
                     + "\n*     2. Food                              " + totFoot  + "           *"
                     + "\n*     3. Clothing                          " + totCloth + "           *"
                     + "\n*     4. Ammunition                        " + totAmmunition + "           *"
                     + "\n*     5. Spare Parts                       $0            *"
                     + "\n*               Funds Remaining            $" + ThreeAmigos.getCurrentGame().getPlayer().getAmount() + "         *"
                     + "\n*     What is your choice (C to continue)?               *"
                     + "\n**********************************************************";
    }

    private void buyOxen() {
        this.updateMenu();
        this.displayMessage = this.menu
                            + "\n\nEach Oxen has a cost of $40, "
                            + "how much do you want to buy?"
                            + "\nPres Q to return to Matt's General Store.";
        String res = this.getInput();
        res = res.toUpperCase();
        if(res.equals("Q")) {
            this.displayMessage = this.menu;
            this.display();
            return;
        }
        int quantity = Integer.parseInt(res);
        this.addItemDropMoney(ItemList.Oxen.ordinal(),quantity);
        this.displayMessage = this.menu;
        this.display();
    }

    private void buyFood() {
        this.updateMenu();
        this.displayMessage = this.menu
                            + "\n\nEach Foot ration has a cost of $0.20, "
                            + "how much do you want to buy?"
                            + "\nPres Q to return to Matt's General Store.";
        String res = this.getInput();
        res = res.toUpperCase();
        if(res.equals("Q")) {
            this.displayMessage = this.menu;
            this.display();
            return;
        }
        int quantity = Integer.parseInt(res);
        this.addItemDropMoney(ItemList.Food.ordinal(),quantity);
        this.displayMessage = this.menu;
        this.display();
    }

    private void buyCloth() {
        this.updateMenu();
        this.displayMessage = this.menu
                            + "\n\nEach set of cloth has a cost of $10, "
                            + "how much do you want to buy?"
                            + "\nPres Q to return to Matt's General Store.";
        String res = this.getInput();
        res = res.toUpperCase();
        if(res.equals("Q")) {
            this.displayMessage = this.menu;
            this.display();
            return;
        }
        int quantity = Integer.parseInt(res);
        this.addItemDropMoney(ItemList.Clothing.ordinal(),quantity);
        this.displayMessage = this.menu;
        this.display();
    }

    private void buyAmmunition() {
        this.updateMenu();
        this.displayMessage = this.menu
                            + "\n\nEach ammunition set has a cost of $2, "
                            + "how much do you want to buy?"
                            + "\nPres Q to return to Matt's General Store.";
        String res = this.getInput();
        res = res.toUpperCase();
        if(res.equals("Q")) {
            this.displayMessage = this.menu;
            this.display();
            return;
        }
        int quantity = Integer.parseInt(res);
        this.addItemDropMoney(ItemList.Ammunition.ordinal(),quantity);
        this.displayMessage = this.menu;
        this.display();
    }

    private void buySpareParts() {
        this.console.println("buySpareParts");
    }

    private void addItemDropMoney(int ordinal, int quantity) {
        CurrentGame game = ThreeAmigos.getCurrentGame();
        float totalCost;
        if(ordinal == ItemList.Oxen.ordinal()){
            
            itemsList.get(0).setCuantityInStock(quantity);
            totalCost = itemsList.get(0).getRequiredAmount() * quantity;
            game.getPlayer().setAmount(game.getPlayer().getAmount() - totalCost);
            totOxen = totalCost;
            
        } else if(ordinal == ItemList.Food.ordinal()){
            itemsList.get(1).setCuantityInStock(quantity);
            totalCost = itemsList.get(1).getRequiredAmount() * quantity;
            game.getPlayer().setAmount(game.getPlayer().getAmount() - totalCost);
            totFoot = totalCost;
            
        } else if(ordinal == ItemList.Clothing.ordinal()){
            itemsList.get(2).setCuantityInStock(quantity);
            totalCost = itemsList.get(2).getRequiredAmount() * quantity;
            game.getPlayer().setAmount(game.getPlayer().getAmount() - totalCost);
            totCloth = totalCost;
            
        } else if(ordinal == ItemList.Ammunition.ordinal()){
            itemsList.get(3).setCuantityInStock(quantity);
            totalCost = itemsList.get(3).getRequiredAmount() * quantity;
            game.getPlayer().setAmount(game.getPlayer().getAmount() - totalCost);
            totAmmunition = totalCost;
        }
        ThreeAmigos.setCurrentGame(game);
        this.updateMenu();
    }
    
}
