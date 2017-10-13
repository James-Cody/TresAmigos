/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeamigos;

import ThreeAmigosModel.City;
import ThreeAmigosModel.Progress;
import ThreeAmigosModel.Question;
import ThreeAmigosModel.Scenes;
import ThreeAmigosModel.TravelingCondition;
import java.sql.Date;

/**
 *
 * @author Cody
 */
public class ThreeAmigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City city = new City();
        Progress progress = new Progress();
        Question question = new Question();
        TravelingCondition travelingCondition = new TravelingCondition();
        Scenes scene = new Scenes();
        
        
        city.setName("Example Name");
        city.setDescription("Example of description");
        
        progress.setCitiesVisited(5);        
        int[][] loc = new int[][]{{1,0},
                                  {0,0},
                                  {0,0},
                                  {0,0}};
                
        progress.setLocation(loc);
        progress.setTotalTime(123456789);
        
        question.setQuestion("Quiestion example");
        question.setAnswer("Answer Example");
        
        travelingCondition.setType("Animal Atack (Example)");
        travelingCondition.setEffect(3);
        
        scene.setDescription("Description example");
        
        System.out.println(city.toString());
        System.out.println(progress.toString());
        System.out.println(question.toString());
        System.out.println(travelingCondition.toString());
        System.out.println(scene.toString());
        
    }
    
}
