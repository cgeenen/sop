/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.sop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hanh-
 */
public class textTest {

    public textTest() {
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
     * Test of getText method, of class text.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        text instance = new text("test");
        String expResult = "test";
        String result = instance.getText();
        assertEquals(expResult, result);
    }

    /**
     * Test of setText method, of class text.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "test1";
        text instance = new text("");
        instance.setText(text);
        String result = instance.getText();
        assertEquals(text, result);

    }

}
