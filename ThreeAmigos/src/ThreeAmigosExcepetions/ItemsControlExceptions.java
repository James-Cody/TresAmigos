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
public class ItemsControlExceptions extends Exception {

    public ItemsControlExceptions() {
    }

    public ItemsControlExceptions(String string) {
        super(string);
    }

    public ItemsControlExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ItemsControlExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public ItemsControlExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
