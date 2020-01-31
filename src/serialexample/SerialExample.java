/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author mosaabramadan
 */
public class SerialExample {

    /**
     * @param args the command line arguments
     */
    public static void saveToFile(String filename, Fruit toSave)
    {
          
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream("resources/"+filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(toSave); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
    }
    public static Fruit readFromFile(String filename)
    {
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream("resources/"+filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            Fruit y = (Fruit)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            return y;
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
            return null;
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
            return null;
        } 
    }
    public static void main(String[] args) {
        Fruit x = new Fruit();
        x.setFruitName("banana");
        x.setPrice(9.5);
        
        saveToFile("fruit.txt", x);
        x = null;
        
        x = readFromFile("fruit.txt");
        
        System.out.println(x.getFruitName() + ", " + x.getPrice());
        
        
    }
    
}
