/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buccialexanagrafe;

import java.io.*;
import java.util.*;

/**
 *
 * @author bucci.alex
 */
public class BucciAlexAnagrafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter pw = null;
        boolean running = true;

        
        
        Scanner input = new Scanner(System.in);
        while (running) {
            System.out.println("inserire il nome");
            String nome = input.nextLine();
            System.out.println("inserire il cognome");
            String cognome = input.nextLine();
            System.out.println(" inserire l'anno");
            String anno = input.nextLine();
            System.out.println("inserrie la sezione");
            String sezione = input.nextLine();
            System.out.println("inserire l'indirizzo");
            String indirizzo = input.nextLine();
            System.out.println("inserire la matricola");
            String matricola = input.nextLine();
            
            Anagrafe a = new Anagrafe();
            
            
        }

    }

}
