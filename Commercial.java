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
public class Commercial extends Employe{
    
    
    public Commercial(String nom, String prenom, String Matricule, int IndiceSal, int NombreDeVente) {
        super(nom, prenom, Matricule, IndiceSal);
        this.NbVente = NombreDeVente;
    }
    
   
}
