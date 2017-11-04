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
public class AboutTheTrailView {
    private final String information;
    public void displayTrailInformation() {
        boolean done = false;
        do {
            String getInput = this.showInformation();
            if(getInput.toUpperCase().equals("Q")) return;
            
        }while(!done);
    }

    public AboutTheTrailView() {
         this.information ="\n**********The Oregon Trail***********  "
                + "\n*This trail will have many obstacles and trials *"
                + "\n*that you will have to overcome. Take into      *"
                + "\n*consideration the amount of food and resources *"
                + "\n*you will need. The shop keepers will advise you*"
                + "\n*on how much you will need to survive. Good Luck*";
    }

    private String showInformation() {
        boolean done = false;
        String option = "";
        Scanner line = new Scanner(System.in);
        do {
            System.out.println(information);
            option = line.nextLine();
            if (option.length() <1 ) {
                System.out.println("Invalid Option: The option cannot be blank");
                continue;
            }
            done = true;
        }while(!done);
        return option;
    }
    
}
