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
    public void testDodawaj23() {
        System.out.println("dodaj");
        String a = "2";
        String b = "3";
        String expResult = "5";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDodawaj32() {
        System.out.println("dodaj");
        String a = "3";
        String b = "2";
        String expResult = "5";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDodaj3() {
        System.out.println("dodaj");
        String a = "2";
        String b = "2";
        String expResult = "4";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDodaj4() {
        System.out.println("dodaj");
        String a = "2";
        String b = "4";
        String expResult = "6";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDodaj21() {
        System.out.println("dodaj");
        String a = "2.1";
        String b = "4.9";
        String expResult = "7";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDodaj37() {
        System.out.println("dodaj");
        String a = "1.9";
        String b = "5.1";
        String expResult = "7";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }



}
