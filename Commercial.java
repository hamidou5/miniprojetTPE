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
public class Commercial  extends Employe {
   
        private float chiffreAffaire;

    public Commercial(String matricule, String nom, String prenom, int age, Date dateEntreService, float chiffreAffaire) {
        super(matricule, nom, prenom, age, dateEntreService);        
            this.chiffreAffaire= chiffreAffaire;
    }

        public float calculerSalaire(){
        return (float) (SALAIRE_DE_BASE + 0.2 * chiffreAffaire);
      }   

    public float getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(float chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }
        
        
}
