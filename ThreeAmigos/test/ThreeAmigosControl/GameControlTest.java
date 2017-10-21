/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosControl;

import ThreeAmigosModel.CurrentGame;
import ThreeAmigosModel.Progress;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of startGame method, of class GameControl.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Progress progress = null;
        CurrentGame currentGame = null;
        double score = 0.0;
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.startGame(progress, currentGame, score);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame() {
        System.out.println("saveGame");
        Progress progress = null;
        CurrentGame currentGame = null;
        double score = 0.0;
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.saveGame(progress, currentGame, score);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of winningLosing method, of class GameControl.
     */
    @Test
    public void testWinningLosing() {
        System.out.println("winningLosing");
        double score = 0.0;
        Progress progress = null;
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.winningLosing(score, progress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class GameControl.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        CurrentGame game = null;
        double distanceTraveled = 0.0;
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.getScore(game, distanceTraveled);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of quit method, of class GameControl.
     */
    @Test
    public void testQuit() {
        System.out.println("quit");
        Progress progress = null;
        CurrentGame currentGame = null;
        double score = 0.0;
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.quit(progress, currentGame, score);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
