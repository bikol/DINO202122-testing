/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.ino.dodawanie;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
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
    public void testDodajConcat() {
        System.out.println("dodaj");
        String a = "ala";
        String b = "makota";
        String expResult = "alamakota";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDodajConcat2() {
        System.out.println("dodaj");
        String a = "kotama";
        String b = "ala";
        String expResult = "kotamaala";
        String result = Dodawacz.dodaj(a, b);
        assertEquals(expResult, result);
    }
}
