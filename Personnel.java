/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author HP
 */
public class Personnel {
    private static ArrayList<Employe> listPersonnels = null; /*list est une classe de collection; 
    array list est une classe de de collection; arrayliste est une sous classe de liste;  listPersonnels est l,attribut de la classe personnel et appartement a la collection
    arraylist; itterator est un objet qui permet de parcourir les elements dune collection
    */

    public ArrayList<Employe> getListPersonnels() {
        return listPersonnels;
    } 
    
    static void ajouterEmploye(Employe employe) {
        if(listPersonnels == null) {
            listPersonnels = new ArrayList<Employe>();
        }
        listPersonnels.add(employe);
    }
    
    static void calculerSalaires(){
        for (Iterator<Employe> iterator = listPersonnels.iterator(); iterator.hasNext();) {
            Employe employe = (Employe) iterator.next();
            System.out.println("Salaire de " + employe.getNom() + " = " + employe.calculerSalaire());
        }
    }
    
   static double salaireMoyen(){
        float total = 0, moyenne = 0;
        int nb = 0; // nb est le nombre d,employe
        for (Iterator<Employe> iterator = listPersonnels.iterator(); iterator.hasNext();) {
            Employe employe = (Employe) iterator.next();
             total += employe.calculerSalaire();
             nb++;// nb= nb+1
        }
        if(nb > 0) {
            moyenne = total / nb;
        }
        return moyenne;
    }
}
