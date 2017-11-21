/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosModel;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Items implements Serializable{
    private String name;
    private String type;
    private int cuantityInStock;
    private double requiredAmount;
    private CurrentGame game;
    

    public Items() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCuantityInStock() {
        return cuantityInStock;
    }

    public void setCuantityInStock(int cuantityInStock) {
        this.cuantityInStock = cuantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public CurrentGame getGame() {
        return game;
    }

    public void setGame(CurrentGame game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + this.cuantityInStock;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.game);
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
        final Items other = (Items) obj;
        if (this.cuantityInStock != other.cuantityInStock) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "name=" + name + ", type=" + type + ", cuantityInStock=" + cuantityInStock + ", requiredAmount=" + requiredAmount + ", game=" + game + '}';
    }
    
    
   
}
