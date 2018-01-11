
package com.appixsoftware;

import com.appixsoftware.DiceLibrary.Dice;
import com.appixsoftware.DiceLibrary.DiceThrower;

/**
 *
 * @author joseluis-mondragon
 */
public class DiceLibraryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiceThrower dt=new DiceThrower();
        Dice[] dices = dt.getThrow(6, 2);
        for (Dice dice : dices) {
            System.out.println(dice);
        }
    }
    
}
