/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.admin;

import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fulmaxx
 */
public class PanneauAdministrationTest {
    
    public PanneauAdministrationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateJTableInfo method, of class PanneauAdministration.
     */
    @Test
    public void testUpdateJTableInfo() {
        System.out.println("updateJTableInfo");
        PanneauAdministration instance = new PanneauAdministration();
        instance.updateJTableInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjLabelEtatVider method, of class PanneauAdministration.
     */
    @Test
    public void testGetjLabelEtatVider() {
        System.out.println("getjLabelEtatVider");
        PanneauAdministration instance = new PanneauAdministration();
        JLabel expResult = null;
        JLabel result = instance.getjLabelEtatVider();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setjLabelEtatVider method, of class PanneauAdministration.
     */
    @Test
    public void testSetjLabelEtatVider() {
        System.out.println("setjLabelEtatVider");
        JLabel jLabelEtatVider = null;
        PanneauAdministration instance = new PanneauAdministration();
        instance.setjLabelEtatVider(jLabelEtatVider);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requeteSelectAllAdmin method, of class PanneauAdministration.
     */
    @Test
    public void testRequeteSelectAllAdmin() {
        System.out.println("requeteSelectAllAdmin");
        String sql = "";
        PanneauAdministration instance = new PanneauAdministration();
        String[][] expResult = null;
        String[][] result = instance.requeteSelectAllAdmin(sql);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requeteSelectAllUpdateAdmin method, of class PanneauAdministration.
     */
    @Test
    public void testRequeteSelectAllUpdateAdmin() {
        System.out.println("requeteSelectAllUpdateAdmin");
        String sql = "";
        PanneauAdministration instance = new PanneauAdministration();
        String[] expResult = null;
        String[] result = instance.requeteSelectAllUpdateAdmin(sql);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
