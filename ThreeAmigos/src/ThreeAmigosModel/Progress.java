/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Govert Carreño
 */
public class Progress implements Serializable{
    private int location;
    private long totalTime;
    private Date currentDate;
    private int citiesVisited;
    private ArrayList<Scenes> scenes = new ArrayList<Scenes>();
    
    public Progress() {
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public ArrayList<Scenes> getScenes() {
        return scenes;
    }

    public void setScenes(ArrayList<Scenes> scenes) {
        this.scenes = scenes;
    }

 
    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public int getCitiesVisited() {
        return citiesVisited;
    }

    public void setCitiesVisited(int citiesVisited) {
        this.citiesVisited = citiesVisited;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.location;
        hash = 97 * hash + (int) (this.totalTime ^ (this.totalTime >>> 32));
        hash = 97 * hash + Objects.hashCode(this.currentDate);
        hash = 97 * hash + this.citiesVisited;
        hash = 97 * hash + Objects.hashCode(this.scenes);
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
        final Progress other = (Progress) obj;
        if (this.location != other.location) {
            return false;
        }
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (this.citiesVisited != other.citiesVisited) {
            return false;
        }
        if (!Objects.equals(this.currentDate, other.currentDate)) {
            return false;
        }
        if (!Objects.equals(this.scenes, other.scenes)) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return "Progress{" + "location=" + location + ", totalTime=" + totalTime + ", currentDate=" + currentDate + ", citiesVisited=" + citiesVisited + '}';
    }
    
    
}
