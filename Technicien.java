/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Technicien extends Employe {
        private int nbUnite;
    public Technicien(String matricule, String nom, String prenom, int age, Date dateEntreService, int nbUnite) {
        super(matricule, nom, prenom, age, dateEntreService);
        this.nbUnite= nbUnite;
    }

    public int getNbUnite() {
        return nbUnite;
    }

    public void setNbUnite(int nbUnite) {
        this.nbUnite = nbUnite;
    }
    public float calculerSalaire(){
        return (float) (SALAIRE_DE_BASE +  this.nbUnite*5);
      }   
}
