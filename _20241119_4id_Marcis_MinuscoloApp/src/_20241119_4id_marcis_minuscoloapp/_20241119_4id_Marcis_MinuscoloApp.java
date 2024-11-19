/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _20241119_4id_marcis_minuscoloapp;
import java.util.Scanner;
/**
 *
 * Mirko Marcis 4infd 
 * programma che trasforma la classe minuscolo da imperativa ad oggetti
 * appunti:
 * ho pensato ti trasformare tutte le funzioni che ho riconosciuto nella classe minuscolo in metodi e ne ho ricavati quattro: quello dell'input dell'utente
 * quello che trasforma una stringa in un array, quello che ti trasforma la parola in maiuscolo in minuscolo e come ultimo quello che andrà a trasformare
 * l'array contentente la parola dell'utente in una stringa 
 */
public class _20241119_4id_Marcis_MinuscoloApp {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       //creazione dell'oggetto che ci servirà a richiamare i metodi
       Minuscolo funzioneminuscolo = new Minuscolo();
       //richiamo del metodo inputparola dove l'utente inserirà la parola
       funzioneminuscolo.inputparola();
       //richiamo del metodo stringtoarray che trasformerà la parola dell'utente in un array
       funzioneminuscolo.stringtoarray();
       //richiamo del metodo parolainminuscolo che trasformerà la parola in minuscolo inserita dall'utente in minuscolo
       funzioneminuscolo.parolainminuscolo();
       //richiamo del metodo arraytostring che trasformerà l'array contentente la parola dell'utente in una stringa
       funzioneminuscolo.arraytostring();
      
       
    }
    
}
