/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author amati.mattia
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        Studente[] s = {new Studente("mattia", "amati", "3"), new Studente("mattia", "amati", "3"), new Studente("mattia", "amati", "3")};
//        
//        FileOutputStream file = new FileOutputStream("test.ser");
//        
//        ObjectOutputStream os = new ObjectOutputStream(file);
//
//        os.writeObject(s);
//        
//        os.flush();
//        
//        file.flush();
//        

//        os.close();
//        
//        file.close();
//        
//        FileInputStream f = new FileInputStream("test.ser");
//
//        ObjectInputStream ot = new ObjectInputStream(f);
//         
//        //ot.readObject();   
//        
//        Studente[] valore = (Studente[])ot.readObject();   
//        
//        
//        for(Studente sk : valore) System.out.println(valore.toString());

        new Thread(new ciclo()).start();
    }
    
}