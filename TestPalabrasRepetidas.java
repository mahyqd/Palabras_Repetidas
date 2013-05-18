/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import palabrasrepetidas.PalabrasRepetidas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class TestPalabrasRepetidas {
    
    public TestPalabrasRepetidas() {
    }
    
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void compareWordsTest(){
        boolean iguales = false;
        iguales = PalabrasRepetidas.compareWords("Hola","Hola");
        assertEquals(true, iguales);
    
    }
}