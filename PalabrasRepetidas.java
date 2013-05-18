/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasrepetidas;

import java.util.*;

/**
 *
 * @author Administrador
 */
public class PalabrasRepetidas {

    private static String[] list = null;
    public static String T1 = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
    public static String T2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
    int iterator = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringTokenizer ST1 = divString(T1);
        StringTokenizer ST2 = null;
        String word1 = null;
        String word2 = null;


        while (ST1.hasMoreTokens()) {
            word1 = nextWord(ST1);
            ST2 = divString(T2);
            while (ST2.hasMoreTokens()) {
                word2 = nextWord(ST2);
                if (compareWords(word1, word2)) {
                    if (!isOnList(word1)) {
                        upgradeList(word1);
                    }
                }
            }
        }

        System.out.print("Lista= ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
        System.out.println(" ");


    }

    private static void copyList(String[] auxlist) {
        for (int i = 0; i < auxlist.length; i++) {
            list[i] = auxlist[i];
        }
    }

    private static void upgradeList(String word) {
        String[] auxlist = null;

        auxlist = list;
        if (auxlist != null) {
            list = new String[auxlist.length + 1];
            copyList(auxlist);
            list[auxlist.length] = word;
        } else {
            list = new String[1];
            list[0] = word;
        }
    }

    private static boolean isOnList(String word) {
        if (list == null) {
            return false;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i].contentEquals(word)) {
                return true;
            }
        }
        return false;

    }

    private static boolean compareWords(String word1, String word2) {
        if (word1.contentEquals(word2)) {
            return true;
        } else {
            return false;
        }
    }

    private static StringTokenizer divString(String T) {
        StringTokenizer st = new StringTokenizer(T, ",.:;()=><¿?/&%$·!¡-*[]{} ", false);
        return st;
    }

    private static String nextWord(StringTokenizer ST) {
        if (ST.hasMoreTokens()) {
            return ST.nextToken();
        }
        return null;
    }
}
