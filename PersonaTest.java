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
    
   
    private Persona persona = new Persona("1","Moises","Ramos Segovia", "14-08-2013","72291585","moi@gmail.com");
    
    
   @Test 
    public void testSetId()
    {
        assertNotNull(null,persona.getId());
        System.out.print(persona.getId());
    }
    @Test
    public void testSetNombre()
    {
        assertNotNull(null,persona.getnombre());
        System.out.print(persona.getnombre());
    }
    @Test
    public void testSetApellido()
    {
        assertNotNull(null,persona.getapellido());
        System.out.print(persona.getapellido());
    }
    @Test
    public void testSetCumpleano()
    {
        assertNotNull(null,persona.get_cumpleaño());
        System.out.print(persona.get_cumpleaño());
    }
    @Test
    public void testSetTelefono()
    {
        assertNotNull(null,persona.gettelefono());
        System.out.print(persona.gettelefono());
    }
    @Test
    public void testSetEmail()
    {
        assertNotNull(null, persona.getEmail());
        System.out.print(persona.getEmail());
    }
    
}
