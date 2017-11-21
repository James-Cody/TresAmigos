/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

import ThreeAmigosModel.Items;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class ItemsControl {

    public ItemsControl() {
    }
    
    public static ArrayList<Items> createItems() {
        ArrayList<Items> itemList = new ArrayList<>();
        Items singleItem = new Items();
        singleItem.setName("Oxen");
        singleItem.setType("Normal");
        singleItem.setRequiredAmount(40.00);
        singleItem.setCuantityInStock(0);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Foot");
        singleItem.setType("Normal");
        singleItem.setRequiredAmount(0.20);
        singleItem.setCuantityInStock(0);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Clothing");
        singleItem.setType("Normal");
        singleItem.setRequiredAmount(10);
        singleItem.setCuantityInStock(0);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Ammunition");
        singleItem.setType("Normal");
        singleItem.setRequiredAmount(2);
        singleItem.setCuantityInStock(0);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Wagon Wheel");
        singleItem.setType("Spare parts");
        singleItem.setRequiredAmount(10);
        singleItem.setCuantityInStock(0);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Wagon Axle");
        singleItem.setType("Spare parts");
        singleItem.setRequiredAmount(10);
        singleItem.setCuantityInStock(0);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Wagon Tongue");
        singleItem.setType("Spare parts");
        singleItem.setRequiredAmount(10);
        singleItem.setCuantityInStock(0);
        itemList.add(singleItem);
        
        return itemList;
    }
}
