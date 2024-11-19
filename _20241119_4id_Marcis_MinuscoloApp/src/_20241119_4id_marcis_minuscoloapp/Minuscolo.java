package _20241119_4id_marcis_minuscoloapp;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ospite
 */
public class Minuscolo {
    private int TANTI = 30;
    private String parola;
    private char[] minuscolo = new char[TANTI];
    
    public void inputparola() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nInserisci una parola : ");
        parola = in.next(); //legge una stringa 
    }
        public void stringtoarray(){
       //trasforma la stringa letta in un array di caratteri
       for (int x = 0; x < parola.length(); x++) {
           minuscolo[x] = parola.charAt(x);
           
       }
    }
    public void parolainminuscolo() {
         //trasforma la parola in minuscolo
       for (int x = 0; x<parola.length(); x++) {
           minuscolo[x] = Character.toLowerCase(minuscolo[x]); //in minuscolo
       }
       
       System.out.print("la parola in minuscolo (array) : ");
       //visualizza la parola carattere per carattere
       
       for(int x = 0;x < minuscolo.length; x++) {
           System.out.print(minuscolo[x]);
       }
    }
    public void arraytostring(){
       String parolaMinu = new String(minuscolo);
       System.out.print("\nLa parola in minuscolo (oggetto) :");
       System.out.println(parolaMinu);
    }
}
