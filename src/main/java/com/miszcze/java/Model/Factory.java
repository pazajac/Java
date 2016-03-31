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
public class Factory extends FactoryAbstract{
    
    @Override
    public User createUser(){
        return new User();
    }
    
    @Override
    public Student createStudent(){
        return new Student();
    }
    
    @Override
    public Teacher createTeacher(){
        return new Teacher();
    }
    
    @Override
    public Ocena createOcena(){
        return new Ocena();
    }
    
    @Override
    public Przedmiot createPrzedmiot(){
        return new Przedmiot();
    }
    
    @Override
    public Klasa createKlasa(){
        return new Klasa();
    }
    
    @Override
    public Typ createTyp(){
        return new Typ();
    }; 
}
