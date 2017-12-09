/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeamigos;

import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.Player;
import ThreeAmigosView.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Cody
 */
public class ThreeAmigos {

    private static CurrentGame currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static CurrentGame getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(CurrentGame currentGame) {
        ThreeAmigos.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ThreeAmigos.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ThreeAmigos.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ThreeAmigos.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ThreeAmigos.logFile = logFile;
    }
    
    
    
    public static void main(String[] args) {
        
        try {
            ThreeAmigos.inFile = new BufferedReader(new InputStreamReader(System.in));
            ThreeAmigos.outFile = new PrintWriter(System.out, true);
            
            ThreeAmigos.logFile = new PrintWriter("log.txt");
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            //startProgramView.display();
        }
        finally{
            try {
                if(ThreeAmigos.inFile != null)
                   ThreeAmigos.inFile.close();
                if(ThreeAmigos.outFile != null)
                   ThreeAmigos.outFile.close();
                if(ThreeAmigos.logFile != null)
                   ThreeAmigos.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error clossing files: " + ex.getMessage());
                return;
            }
        }
    }
    
}
