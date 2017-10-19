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
 * @author Govert Carreño
 */
public class CurrentGame implements Serializable{
    private int peopleAlive;
    private long totalTimeTraveled;
    private long amount;
    private Player player = new Player();
    private ArrayList<PartyMembers> partyMembers = new ArrayList<PartyMembers>();
    private ArrayList<City> cities = new ArrayList<City>();
    private ArrayList<Items> items = new ArrayList<Items>();

    public CurrentGame() {
    }    

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
    
    public int getPeopleAlive() {
        return peopleAlive;
    }

    public void setPeopleAlive(int peopleAlive) {
        this.peopleAlive = peopleAlive;
    }

    public long getTotalTimeTraveled() {
        return totalTimeTraveled;
    }

    public void setTotalTimeTraveled(long totalTimeTraveled) {
        this.totalTimeTraveled = totalTimeTraveled;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<PartyMembers> getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(ArrayList<PartyMembers> partyMembers) {
        this.partyMembers = partyMembers;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.peopleAlive;
        hash = 13 * hash + (int) (this.totalTimeTraveled ^ (this.totalTimeTraveled >>> 32));
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
        final CurrentGame other = (CurrentGame) obj;
        if (this.peopleAlive != other.peopleAlive) {
            return false;
        }
        if (this.totalTimeTraveled != other.totalTimeTraveled) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CurrentGame{" + "peopleAlive=" + peopleAlive + ", totalTimeTraveled=" + totalTimeTraveled + '}';
    }
    
    
}
