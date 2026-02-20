/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexanagrafe;
import java.util.*;
/**
 *
 * @author bucci.alex
 */
public class Anagrafe {
    private HashMap<String,Studente> listaStudenti = new HashMap<String, Studente>();

    public Anagrafe() {
    }
    
    public void addStudente(Studente s){
        this.listaStudenti.put(s.getMatricola(), s);
    }
}
