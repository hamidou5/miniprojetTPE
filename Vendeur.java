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
public class Vendeur extends Commercial {

    public Vendeur(String matricule, String nom, String prenom, int age, Date dateEntreService, float chiffreAffaire) {
        super(matricule, nom, prenom, age, dateEntreService, chiffreAffaire);
    }
    
    
    public float calculerSalaire(){
        return (float) (SALAIRE_DE_BASE + 0.2 * this.getChiffreAffaire() +100);
      }   
    
}
