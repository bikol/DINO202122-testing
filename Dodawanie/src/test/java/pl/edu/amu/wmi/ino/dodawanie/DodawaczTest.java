/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.ino.dodawanie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class DodawaczTest {
    
    /**
     * Test of dodaj method, of class Dodawacz.
     */
    @org.junit.jupiter.api.Test
    public void testDodaj() {
        System.out.println("dodaj");
        String a = "1";
        String b = "1";
        String expResult = "2";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
        @org.junit.jupiter.api.Test
    public void testDodaj2() {
        System.out.println("dodaj");
        String a = "2";
        String b = "0";
        String expResult = "2";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDodaj10() {
        System.out.println("dodaj");
        String a = "7";
        String b = "3";
        String expResult = "10";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDodaj15() {
        System.out.println("dodaj");
        String a = "7";
        String b = "8";
        String expResult = "15";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDodajFloat2() {
        System.out.println("dodaj");
        String a = "1.5";
        String b = "0.5";
        String expResult = "2";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDodajFloat3() {
        System.out.println("dodaj");
        String a = "2.5";
        String b = "0.5";
        String expResult = "3";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }


}
