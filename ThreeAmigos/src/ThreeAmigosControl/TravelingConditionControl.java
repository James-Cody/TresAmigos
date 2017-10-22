/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

/**
 *
 * @author group
 */
public class TravelingConditionControl {
    
    public void randomEvent(bool bAnimalAttack, bool bTheives, 
                            string weather, bool bWagonRepair) {
        /*
        If bAnimalAttack equals 1, do stuff
        If bTheives equals 1, do stuff
        if weather is not A, B, or C return error
        //If weather is not A, do stuff - this gives bad things if bad weather
        If bWagonRepair equals 1, do stuff
        */
        if (bAnimalAttack != 1){ return -1; }
        if (bTheives != 1){ return -1; }
        if (weather != "Good" || weather != "Ok" || weather != "Bad"){ return -1; }
        if (bWagonRepair != 1){ return -1; }
        return ;
    }
    
    public void crossRiver(int ferry, int money, string weather, 
                            bool bWagonRepair, int numberOfOxen) {
        /*
        If there is not enough money for a ferry, return error
        If wagon needs repairs, return error
        If numberOfOxen is not 2 or more, return error
        if weather is not A, B, or C return error
        */
        if (money < ferry) {return -1;}
        if (wagon != 0 || wagon != 1) {return -1;}
        if (numberOfOxen < 2) {return -1;}
        if (weather != "Good" || weather != "Ok" || weather != "Bad"){ return -1; }
        return ;
    }
}
