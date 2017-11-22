/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

import ThreeAmigosModel.Items;
import ThreeAmigosModel.Location;
import ThreeAmigosModel.Map;
import java.util.ArrayList;

/**
 *
 * @author Cody
 */
public class MapControl {
    
    public static Map createMap(int nRow, int nColumn, ArrayList<Items> itemList ) {
        if (nColumn < 0 || nRow < 0) return null;
        if(itemList.isEmpty()) return null;
        
        Map map = new Map();
        map.setColumnCount(nColumn);
        map.setRowCount(nRow);
        
        Location[][] locations = MapControl.createLocations(nRow,nColumn);
        map.setLocations(locations);
        
        return map;
    }

    private static Location[][] createLocations(int nRow, int nColumn) {
        Location[][] locations = new Location[nRow][nColumn];
        
        for(int x = 0; x < nRow ; x++){
            for(int y = 0; y < nColumn ; y++) {
                Location location = new Location();
                location.setVisited(false);
                locations[x][y] = location;
            }
        }
        
        return locations;
    }
}

