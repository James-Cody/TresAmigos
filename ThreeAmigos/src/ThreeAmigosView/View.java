/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import threeamigos.ThreeAmigos;

/**
 *
 * @author tri_t
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = ThreeAmigos.getInFile();
    protected final PrintWriter console = ThreeAmigos.getOutFile();

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
        try {
            do {
                this.console.println("\n" + this.displayMessage);
                option = this.keyboard.readLine();
                option = option.trim();
                
                if(option.length() < 1) {
                    ErrorView.display(this.getClass().getName(),"Invalid option: the option can not be blank");
                    continue;
                }
                break;
            }while(!done);
        } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        return option;
    }
}
