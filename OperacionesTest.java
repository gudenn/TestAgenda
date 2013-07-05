/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
public class OperacionesTest {
    
    
        
      
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Persona persona = new Persona("2822","Moises","Ramos Segovia", "14-08-2013","72291585","moi@gmail.com");
        String sql = "insert into Persona values('"+persona.getId()+"','"+persona.getnombre()+"','"+persona.getapellido()+"','"+persona.get_cumpleaño()+"','"+persona.gettelefono()+"','"+persona.getEmail()+"')";
        Operaciones instance = new Operaciones();
        boolean result = instance.insertar(sql);
        System.out.print(result);
        assertTrue(result);
    }
    
    @Test
    public void testConsultar() throws SQLException {
        
        System.out.println("consultar");
        String sql = "select count(*) from Persona";
        Operaciones instance = new Operaciones();
        String expResult ="11";
        ResultSet result = instance.consultar(sql);
        String  resultado = result.getString(1);
        assertEquals(expResult, resultado);
        
    }

    
}
