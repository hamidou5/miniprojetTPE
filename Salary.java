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
public class Salary{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Employe emp1 = new Employe("mat002", "Baba", "Souley", 20, new Date(2008));
        Employe emp2 = new Vendeur("mat001", "Kalimba", "Carlos", 25, new Date(2000), 100000);
        Employe emp3 = new Technicien("mat003", "ibrahim"," yaouba", 18, new Date(2009), 100000);
        Employe emp4 = new TechnicienARisque("mat004", "ousmanou"," bello", 18, new Date(2009), 100000);
        Employe emp5 = new Manutantionaire("mat003", "arthur"," zang", 18, new Date(2009), 100000);
        Employe emp6 = new ManutantionaireARisque("mat003", "saliou"," yaya", 18, new Date(2009), 100000);
        Employe emp7 = new Commercial("mat003", "idrissou","bouba ", 18, new Date(2009), 100000);
         
        Personnel.ajouterEmploye(emp1);        
        Personnel.ajouterEmploye(emp2);
        Personnel.ajouterEmploye(emp3);
        Personnel.ajouterEmploye(emp4);
        Personnel.ajouterEmploye(emp5);
        Personnel.ajouterEmploye(emp6);
        Personnel.ajouterEmploye(emp7);
      
        
        Personnel.calculerSalaires();
        System.out.println("Salaire moyen = " + Personnel.salaireMoyen());
        
    }
}
