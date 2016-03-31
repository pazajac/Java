/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.miszcze.java.Model;

/**
 *
 * @author BTurek
 */
public abstract class FactoryAbstract {
    
    public abstract User createUser();
    public abstract Student createStudent();
    public abstract Teacher createTeacher();
    public abstract Ocena createOcena();
    public abstract Przedmiot createPrzedmiot();
    public abstract Klasa createKlasa();
    public abstract Typ createTyp(); 
    
}
