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
public class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private Date dateEntreService;
    static final float SALAIRE_DE_BASE = 110000;

     
    public Employe (String matricule, String nom, String prenom, int age, Date dateEntreService){
        this.matricule= matricule;
        this.nom= nom;
        this.prenom= prenom;
        this.age= age;
        this.dateEntreService= dateEntreService;
    }
    
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateEntreService() {
        return dateEntreService;
    }

    public void setDateEntreService(Date dateEntreService) {
        this.dateEntreService = dateEntreService;
    }
    
    
   
    public float calculerSalaire(){
        return SALAIRE_DE_BASE;
    }
    
    public String getNom(){
      return ("l'Employe "+prenom+" "+nom);
      }
    
    }
 
