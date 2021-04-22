/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amati.mattia
 */
public class ciclo implements Runnable{
    private String[] nomi = {"mattia", "gigi", "coollega"};
    private String[] cognome = {"amati", "giorgio", "hey"};
    private String[] anni = {"14", "15", "16"};
    
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ciclo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(new Studente(nomi[(int)(Math.random()*3)],
                        cognome[(int)(Math.random()*3)],
                        anni[(int)(Math.random()*3)],
                        ((int)Math.random()*(31)+1)).toString());
        }
    }
    
}
