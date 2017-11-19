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
public class ManutantionaireARisque extends Manutantionaire implements EmployeARisque{
  
    public ManutantionaireARisque(String matricule, String nom, String prenom, int age, Date dateEntreService, int nbHeure) {
        super(matricule, nom, prenom, age, dateEntreService, nbHeure);
        
    }
     public float calculerSalaire(){
        return (float) (SALAIRE_DE_BASE +  this.getNbHeure()*65 + PRIME_MENSUELLE);
      }   
    
    
}
