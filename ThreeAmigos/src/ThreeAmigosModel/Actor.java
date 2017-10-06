/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Cody
 */
public class Actor implements Serializable{
    private String name;
    private String description;
    private int[][] coordinates;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Game game = new Game();
    private ArrayList<Location> locations = new ArrayList<Location>();
    
    public Actor(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[][] coordinates) {
        this.coordinates = coordinates;
    }
    
}