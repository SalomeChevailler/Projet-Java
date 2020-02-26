/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author cgay
 */
public class Employes {
     private String nom;
     private String prenom;
     private String Matricule;
     private int IndiceSal;
     private int Salaire;
     int NbVente;
 
    public Employes(String nom, String prenom, String Matricule, int IndiceSal) {
        this.nom = nom;
        this.prenom = prenom;
        this.Matricule = Matricule;
        this.IndiceSal = IndiceSal;
    }
    public void CalculerSalaire(Employes e){
        if (e.getClass().getSimpleName()=="Commerciaux"){
            Salaire= (int) (IndiceSal * 12 + 0.1 * e.NbVente);}
        else{
            Salaire= IndiceSal * 12;
    }
            
}
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return Matricule;
    }

    public int getIndiceSal() {
        return IndiceSal;
    }

    public int getSalaire() {
        return Salaire;
    }

    public int getNbVente() {
        return NbVente;
    }

    @Override
    public String toString() {
        return "Employes{" + "nom=" + nom + ", prenom=" + prenom + ", Matricule=" + Matricule + ", IndiceSal=" + IndiceSal + ", Salaire=" + Salaire + ", NbVente=" + NbVente + '}';
    }
    
}
