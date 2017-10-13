/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.ItemsStore;
import java.util.ArrayList;

/**
 *
 * @author Govert Carreño
 */
public class Store {
    public ItemsStore findItem (String name, int itemChoosen) {
        ItemsStore item = new ItemsStore();
        switch(itemChoosen){
            case 1:
                item.setName("Oxen");
                item.setRequiredAmount(20);
                item.set
                break;
        }
            
        return item;
    }
    public void buyStore(ItemsStore item, CurrentGame game){
        ArrayList<ItemsStore> items = game.getItems();
        items.add(item);
        game.setItems(items);
    }
}
