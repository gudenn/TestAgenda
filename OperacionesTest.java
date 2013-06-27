/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.sql.ResultSet;
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
    
    public OperacionesTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertarDatos method, of class Operaciones.
     */
    @Test
    public void testInsertarDatos() {
        System.out.println("insertarDatos");
        String nombEven = "";
        String fecha = "";
        String hrsIni = "";
        String hrsFin = "";
        JTable contactos = null;
        Operaciones instance = new Operaciones();
        instance.insertarDatos(nombEven, fecha, hrsIni, hrsFin, contactos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class Operaciones.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String sql = "";
        Operaciones instance = new Operaciones();
        boolean expResult = false;
        boolean result = instance.insertar(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class Operaciones.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        String sql = "";
        Operaciones instance = new Operaciones();
        ResultSet expResult = null;
        ResultSet result = instance.consultar(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_otra_bd method, of class Operaciones.
     */
    @Test
    public void testConsultar_otra_bd() {
        System.out.println("consultar_otra_bd");
        String sql = "";
        String ruta = "";
        Operaciones instance = new Operaciones();
        ResultSet expResult = null;
        ResultSet result = instance.consultar_otra_bd(sql, ruta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of grabarActualizado method, of class Operaciones.
     */
    @Test
    public void testGrabarActualizado() {
        System.out.println("grabarActualizado");
        Operaciones instance = new Operaciones();
        instance.grabarActualizado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaActualizado method, of class Operaciones.
     */
    @Test
    public void testEstaActualizado() {
        System.out.println("estaActualizado");
        Operaciones instance = new Operaciones();
        boolean expResult = false;
        boolean result = instance.estaActualizado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarUsuario method, of class Operaciones.
     */
    @Test
    public void testGuardarUsuario() {
        System.out.println("guardarUsuario");
        Persona persona = null;
        Operaciones instance = new Operaciones();
        instance.guardarUsuario(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalPersonas method, of class Operaciones.
     */
    @Test
    public void testTotalPersonas() {
        System.out.println("totalPersonas");
        DefaultTableModel tableModel = null;
        Operaciones instance = new Operaciones();
        instance.totalPersonas(tableModel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nombrePersonas method, of class Operaciones.
     */
    @Test
    public void testNombrePersonas() {
        System.out.println("nombrePersonas");
        JTable table = null;
        Operaciones instance = new Operaciones();
        instance.nombrePersonas(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_eventos method, of class Operaciones.
     */
    @Test
    public void testGet_eventos() {
        System.out.println("get_eventos");
        String fecha = "";
        Operaciones instance = new Operaciones();
        ResultSet expResult = null;
        ResultSet result = instance.get_eventos(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar_bd method, of class Operaciones.
     */
    @Test
    public void testActualizar_bd() {
        System.out.println("actualizar_bd");
        String ruta = "";
        Operaciones instance = new Operaciones();
        instance.actualizar_bd(ruta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
