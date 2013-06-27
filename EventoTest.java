/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import javax.swing.JTable;
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
public class EventoTest {
    
    private Evento evento = new Evento(1,"Cumple Moi","14/08/2013","8:00","9:00");   
 
 //@Before
 public void setUp()
 {
     evento.setNombre("Cumple Williams");
     evento.setFecha("25-05-2013");
     evento.setHora_Ini("9:45");
     evento.setHora_Fin("16:45");
 }
    @Test 
    public void testSetNombre()
    {
        assertNotNull(null,evento.getNombre());    
    }
    @Test
    public void testSetFecha()
    {
        assertNotNull(null,evento.getFecha());
    }
    @Test
    public void testSetHora_Ini()
    {
        assertNotNull(null,evento.getHora_Ini());
    }
    @Test
    public void testSetHora_Fin()
    {
        assertNotNull(null,evento.getHora_Fin());
    }
}
