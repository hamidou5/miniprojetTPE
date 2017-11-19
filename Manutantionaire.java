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
public class Manutantionaire extends Employe {
  private int nbHeure;
    public Manutantionaire(String matricule, String nom, String prenom, int age, Date dateEntreService,int nbHeure) {
        super(matricule, nom, prenom, age, dateEntreService);
        this.nbHeure=  nbHeure;
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }
    public float calculerSalaire(){
        return (float) (SALAIRE_DE_BASE +  this.nbHeure*65);
      }   
}
