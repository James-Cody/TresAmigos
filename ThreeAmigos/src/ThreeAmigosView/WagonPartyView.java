/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.PartyMembers;
import java.util.ArrayList;
import threeamigos.ThreeAmigos;

/**
 *
 * @author Govert
 */
public class WagonPartyView extends View{

    private int wagonNumber = 0;
    CurrentGame currentGame = ThreeAmigos.getCurrentGame();
    ArrayList<PartyMembers> partyMembersArray = currentGame.getPartyMembers();
    
    public WagonPartyView() {
        /*this.displayMessage =  "\n***************** The Oregon Trail **********************" ;
        
        for (int i = 1; i <= 5; i++){
            if(this.partyMembersArray.size() == i ){
                this.displayMessage += "\n" + i + partyMembersArray.get(i - 1).getName() + "     *" ;
            }
            else {
                this.displayMessage += "\n" + i + "                                              *" ;
            }
        }       
        
        this.displayMessage += "\n     Enter name 1:                                      ";*/
        this.displayMessage =  "\n***************** The Oregon Trail **********************"
                             + "\n*     Enter the names of those in your wagon party:     *" 
                             + "\n*     1.                                                *" 
                             + "\n*     2.                                                *" 
                             + "\n*     3.                                                *" 
                             + "\n*     4.                                                *" 
                             + "\n*     5.                                                *" 
                             + "\n*********************************************************" 
                             + "\n     Enter name 1:                                      ";
        
        
    }
    
    @Override
    public boolean doAction(String name) {
        boolean done = false;
        
        //Add new Wagon Party
        this.partyMembersArray.add(new PartyMembers());
        //Set the name of the member created
        this.partyMembersArray.get(wagonNumber).setName(name);
        
        //this variable is to control the positions of the array, here is where the variable incremensts by one
        //is the same as wagonNumber++
        this.wagonNumber = this.partyMembersArray.size();
        //Change the display message showing the names entered by the user. (lines 63 to 72)
        for (int i = 1; i <= 5; i++){
            if(this.partyMembersArray.size() >= i){
                this.displayMessage += "\n*     " + i + ".   " + partyMembersArray.get(i - 1).getName() + "     *" ;
            }
            else {
                this.displayMessage += "\n*     " + i + ".                                              *" ;
            }
        }
        this.displayMessage += "\n*********************************************************" 
                             + "\n*    Enter name " + (wagonNumber + 1) + ":                                      *";
        
        
        if(this.partyMembersArray.size() == 5) {
            this.promptToChangeName(partyMembersArray);
            
            
            //This line is to finish the loop in the display function, and don't ask for other name
            done = true;
        }
        return done;
    }

    private void promptToChangeName(ArrayList<PartyMembers> partyMembersArray) {
        this.displayMessage = "Names you typed";
        for(int i = 0; i < partyMembersArray.size(); i++){
            displayMessage += "\n" + (i+1) + ". " + partyMembersArray.get(i).getName();
        }
        this.displayMessage += "\n Type C to continue or the number to change the name:";
        this.displayIfChange();
    }

    private void displayIfChange() {
        boolean done = false;
        do {
            //get the options
            String menuOption = this.getInput();
            menuOption = menuOption.toUpperCase();
            if(menuOption.equals("C")){
                this.displayNextView();
                done = true;
            }
            else if (menuOption.charAt(0) >= '1' && menuOption.charAt(0) <= '5'){
                this.changeName(menuOption);
                done = true;
            }
            else {
                System.out.println("Invalid option");
            }
        }while(!done);
    }

    private void changeName(String option) {
        this.displayMessage = "Type new name";
        char number = option.charAt(0);
        String newName = this.getInput();
        int arrayIndex = Character.getNumericValue(number);
        this.partyMembersArray.get(arrayIndex - 1).setName(newName);
        this.promptToChangeName(partyMembersArray);
    }

    private void displayNextView() {
        System.out.println("Display the next view that is choose the time (Month)");
    }
}
