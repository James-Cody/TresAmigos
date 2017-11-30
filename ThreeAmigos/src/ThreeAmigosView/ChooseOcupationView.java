/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;


/**
 *
 * @author Govert Carreno
 */
class ChooseOcupationView extends View {
    
    WagonPartyView wagonPartyView = new WagonPartyView();
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
                ErrorView.display(this.getClass().getName(),"Invalid option, try again");
                break;
        }
        return false;
    }

    private void chooseBanker() {
        this.console.println("Banker");
        wagonPartyView.display();
    }

    private void chooseCarpenter() {
        this.console.println("Carpenter");
        wagonPartyView.display();
    }

    private void chooseFarmer() {
        this.console.println("Farmer");
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
