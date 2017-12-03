/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

import ThreeAmigosExcepetions.GameControlExceptions;
import ThreeAmigosExcepetions.MapControlExceptions;
import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.Items;
import ThreeAmigosModel.Map;
import ThreeAmigosModel.PartyMembers;
import ThreeAmigosModel.Player;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.imageio.stream.FileImageInputStream;
import threeamigos.ThreeAmigos;

/**
 *
 * @author Govert
 */
public class GameControl {

    public static Player createPlayer(String name) throws GameControlExceptions {
        if(name == null) throw new GameControlExceptions("The name cannot be null");
        
        Player player = new Player();//create new player
        player.setName(name);// set the name of the player
        ThreeAmigos.setPlayer(player);// save player
        return player;
    }

    public static void createNewTravel(Player player) throws GameControlExceptions {
        
        try {
            if(player == null) throw new GameControlExceptions("Error while creating the player");
            //Creating the CurrentGame
            CurrentGame currentGame = new CurrentGame();
            currentGame.setPlayer(player);
            
            //Creating the Items
            ArrayList<Items> items = ItemsControl.createItems();
            if(items.isEmpty()) throw new GameControlExceptions("The list of Items is actually empty");
            currentGame.setItems(items);
            
            //Creating map
            Map map = MapControl.createMap(7,7,items);
            currentGame.setMap(map);
            
            ThreeAmigos.setCurrentGame(currentGame);
        } catch (MapControlExceptions ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void saveGame(CurrentGame currentGame, String filePath) 
        throws GameControlExceptions{
        
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(currentGame);

        } catch (Exception e){
            throw new GameControlExceptions(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath)
        throws GameControlExceptions{
        CurrentGame game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (CurrentGame) input.readObject();
        } catch(Exception e) {
            throw new GameControlExceptions(e.getMessage());
        }
        
        ThreeAmigos.setCurrentGame(game);
        
    }

    public static void printWagonParty(ArrayList<PartyMembers> partyMembers, String filePath) 
    throws GameControlExceptions{
        try(PrintWriter out = new PrintWriter(filePath)){
            /*ObjectOutputStream output = new ObjectOutputStream(fops);*/
            
            out.println("\n\nWAGON MEMBER'S LIST");
            out.printf("%n%-20s%-20s", "Nombre","Status");
            out.printf("%n%-20s%-20s", "------","------");
            for(int i = 0; i < partyMembers.size();i++){
                out.printf("%n%-20s%-20s",(i + 1) + ". " + partyMembers.get(i).getName()
                                    ,partyMembers.get(i).getStatus());
            }
                
            out.printf("%n%-20s", " *** FIN *** ");

        } catch (Exception e){
            throw new GameControlExceptions(e.getMessage());
        }
    }
    
}