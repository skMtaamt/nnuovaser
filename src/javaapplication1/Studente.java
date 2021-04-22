/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;

/**
 *
 * @author amati.mattia
 */
public class Studente implements Serializable{
    String nome, cognome, numero;
    int n;
    
    public Studente(String nome, String cognome, String numero, int n) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
        this.n = n
                ;
                        
                        
                        
                        
                        
    }

    @Override
    public String toString() {
        return "Studente{" + "nome=" + nome + ", cognome=" + cognome + ", numero=" + numero + '}';
    }
   
    
}
