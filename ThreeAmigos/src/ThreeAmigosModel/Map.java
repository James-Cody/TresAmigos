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
 * @author tri_t
 */
public class Map implements Serializable {
    private int rowCount;
    private int columnCount;
    private ArrayList<Game> games = new ArrayList<Game>();
    
    public Map(){     
    }
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    
    
}