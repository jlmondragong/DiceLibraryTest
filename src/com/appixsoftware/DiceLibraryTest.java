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
        DiceThrower dt = new DiceThrower();
        int sidesNumber = 6;
        int[] s = new int[sidesNumber];
        Dice[] dices = dt.getThrow(6, 10);
        for (Dice dice : dices) {
            s[dice.getCurrentValue()-1]++;
            System.out.println(dice);
        }

        System.out.println("");
        System.out.println("Sumary:");
        for (int i = 0; i < s.length; i++) {
            System.out.println((i+1)+": "+s[i]);
        }

    }

}
