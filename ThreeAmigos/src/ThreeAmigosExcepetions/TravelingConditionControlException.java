/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosExcepetions;

/**
 *
 * @author tri_t
 */
public class TravelingConditionControlException extends Exception {

    public TravelingConditionControlException() {
    }

    public TravelingConditionControlException(String string) {
        super(string);
    }

    public TravelingConditionControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public TravelingConditionControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public TravelingConditionControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
