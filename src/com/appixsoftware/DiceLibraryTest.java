package com.appixsoftware;

import com.appixsoftware.DiceLibrary.Dice;
import com.appixsoftware.DiceLibrary.DiceThrower;
import com.appixsoftware.DiceLibrary.DiceType;

/**
 *
 * @author joseluis-mondragon
 */
public class DiceLibraryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiceThrower dt = new DiceThrower();
        DiceType diceType = DiceType.D6;
        int[] s = new int[diceType.getSides()];
        Dice[] dice = dt.getThrow(diceType, 10);
        for (Dice die : dice) {
            s[die.getCurrentValue() - 1]++;
            System.out.println(die);
        }

        System.out.println("");
        System.out.println("Sumary:");
        for (int i = 0; i < s.length; i++) {
            System.out.println("Value " + (i + 1) + ": " + s[i] + " times");
        }

    }

}
