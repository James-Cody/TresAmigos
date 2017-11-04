/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import java.util.Scanner;

/**
 *
 * @author Govert Carreno
 */
class GameMenuView {

    public void displayOcupationMenu() {
        boolean done = false;
        do{
            String menuOption = this.getOcupationMenuOption();
            if(menuOption.toUpperCase().equals("Q")) return;
            done = this.doAction(menuOption);
            
        }while(!done);
    }
    private String ocupationMenu;
    public GameMenuView() {
        ocupationMenu =  "\n********** The Oregon Trail **********"
                      +  "\n*     Choose your occupation:        *"
                      +  "\n*     1. Banker from Boston          *"     
                      +  "\n*     2. Carpenter from Ohio         *"
                      +  "\n*     3. Farmer from Illinois        *"
                      +  "\n*     4. Which one should I choose?  *"
                      +  "\n*     What is your choice?           *"
                      +  "\n**************************************";

    }

    private String getOcupationMenuOption() {
        boolean done = false;
        String option = "";
        Scanner line = new Scanner(System.in);
        do {
            System.out.println(ocupationMenu);
            option = line.nextLine();
            
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
                this.chooseBanker();
                break;
            case "2":
                this.chooseCarpenter();
                break;
            case "3":
                this.chooseFarmer();
                break;
            case "4":
                this.helpOnChoose();
                break;
            default :
                System.out.println("Invalid option, try again");
                break;
        }
        return false;
    }

    private void chooseBanker() {
        System.out.println("Banker");
    }

    private void chooseCarpenter() {
        System.out.println("Carpenter");
    }

    private void chooseFarmer() {
        System.out.println("Farmer");
    }

    private void helpOnChoose() {
        System.out.println("Which one should I use?");
    }

    void displayAboutTheTrail() {
        AboutTheTrailView aboutTheTrailView = new AboutTheTrailView();
        aboutTheTrailView.displayTrailInformation();      
    }
    
}
