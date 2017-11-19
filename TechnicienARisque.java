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
public class TechnicienARisque extends Technicien implements EmployeARisque  {
 
    public TechnicienARisque(String matricule, String nom, String prenom, int age, Date dateEntreService, int nbUnite) {
        super(matricule, nom, prenom, age, dateEntreService, nbUnite);
    }
     public float calculerSalaire(){
        return (float) (SALAIRE_DE_BASE +  this.getNbUnite()*5+ PRIME_MENSUELLE);
      }  
}
