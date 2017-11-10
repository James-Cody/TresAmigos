/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import java.util.Scanner;

/**
 *
 * @author tri_t
 */
public class AboutTheTrailView extends View {
    

    public AboutTheTrailView() {
         this.displayMessage ="\n**************The Oregon Trail*******************"
                         + "\n*This trail will have many obstacles and trials *"
                         + "\n*that you will have to overcome. Take into      *"
                         + "\n*consideration the amount of food and resources *"
                         + "\n*you will need. The shop keepers will advise you*"
                         + "\n*on how much you will need to survive. Good Luck*"
                         + "\n================================================="
                         + "\nPress Q to return to the last Menu               "
                         + "\n================================================="
                         + "\n*************************************************";
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
