/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Govert Carreño
 */
public class Player implements Serializable{
    private String name;
    private String ocupation;
    private double highScore;
    private float  amount;
    private ArrayList<CurrentGame> games = new ArrayList<CurrentGame>();

    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public double getHighScore() {
        return highScore;
    }

    public void setHighScore(double highScore) {
        this.highScore = highScore;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public ArrayList<CurrentGame> getGames() {
        return games;
    }

    public void setGames(ArrayList<CurrentGame> games) {
        this.games = games;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.ocupation);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.highScore) ^ (Double.doubleToLongBits(this.highScore) >>> 32));
        hash = 37 * hash + Float.floatToIntBits(this.amount);
        hash = 37 * hash + Objects.hashCode(this.games);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.highScore) != Double.doubleToLongBits(other.highScore)) {
            return false;
        }
        if (Float.floatToIntBits(this.amount) != Float.floatToIntBits(other.amount)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ocupation, other.ocupation)) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", ocupation=" + ocupation + ", highScore=" + highScore + ", amount=" + amount + ", games=" + games + '}';
    }
    
}
