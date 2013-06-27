/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SONY
 */
public class PersonaTest {
    
    Persona persona = new Persona("01","7845698", "Juan", "Carlos", "Ojeda", "Ricaldi");
    
   @Test 
    public void testSetId()
    {
        assertNotNull(null,persona.getId());
        System.out.print(persona.getId());
    }
    @Test
    public void testSetPrimer_nombre()
    {
        assertNotNull(null,persona.getnombre());
    }
   /* @Test
    public void testSetSegundo_nombre()
    {
        assertNotNull(null,persona.getSegundo_nombre());
    }*/
    @Test
    public void testSetPrimer_apellido()
    {
        assertNotNull(null,persona.getapellido());
    }
}
