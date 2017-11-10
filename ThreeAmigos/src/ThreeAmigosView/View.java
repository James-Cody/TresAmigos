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
public abstract class View implements ViewInterface {
    
    protected String displayMessage;

    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    @Override
    public void display() {
        boolean done = false;
        do {
            
            //get the options
            String menuOption = this.getInput();
            
            if(menuOption.toUpperCase().equals("Q")) return;
            
            done = this.doAction(menuOption);
        }while(!done);
        
    }
    @Override
    public String getInput() {
        String option = "";
        boolean done = false;
        Scanner line = new Scanner(System.in);
        do {
            System.out.println("\n" + this.displayMessage);
            option = line.nextLine();
            option = option.trim();
            
            if(option.length() < 1) {
                System.out.println("Invalid option: the option can not be blank");
                continue;
            }
            break;
            
        }while(!done);
        return option;
    }
}
