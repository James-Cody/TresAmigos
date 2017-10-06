/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosModel;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Location {
    private int row;
    private int column;
    private ArrayList<String> visited = new ArrayList<String>();
    private double amountRemaining;
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private Scene scene = new Scene();
    
            
    public Location(){
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public ArrayList<String> getVisited() {
        return visited;
    }

    public void setVisited(ArrayList<String> visited) {
        this.visited = visited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }
    
}
