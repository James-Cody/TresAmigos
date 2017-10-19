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
    private CurrentGame game;
    

    public Items() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCuantityInStock() {
        return cuantityInStock;
    }

    public void setCuantityInStock(int cuantityInStock) {
        this.cuantityInStock = cuantityInStock;
    }

    public CurrentGame getGame() {
        return game;
    }

    public void setGame(CurrentGame game) {
        this.game = game;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.cuantityInStock;
        hash = 59 * hash + Objects.hashCode(this.game);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "name=" + name + ", cuantityInStock=" + cuantityInStock + ", game=" + game + '}';
    }
    
}
