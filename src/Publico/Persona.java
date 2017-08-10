/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publico;

/**
 *
 * @author Español
 */
import javax.swing.JOptionPane;
public class Persona {
int altura=10;
public int largo=30;
final int ojos =2;
public static void main (String[]args){
    
    Persona Juan= new Persona();
    Persona Pedro=new Persona ();
    Juan.altura=20;
    System.out.println("La altura de Juan es "+Juan.altura+"\nSu largo es "+Juan.largo+" y tiene "+Juan.ojos+" ojos");
    System.out.println("La altura de Pedro es "+Pedro.altura+"\nSu largo es "+Pedro.largo+" y tiene "+Pedro.ojos+" ojos");
    
    JOptionPane.showMessageDialog(null,"La altura de Juan es "+Juan.altura+"\nSu largo es "+Juan.largo+" y tiene "+Juan.ojos+" ojos");
    JOptionPane.showMessageDialog(null,"La altura de Pedro es "+Pedro.altura+"\nSu largo es "+Pedro.largo+" y tiene "+Pedro.ojos+" ojos");
    JOptionPane.showMessageDialog(null,"Hola");
}
    
}
