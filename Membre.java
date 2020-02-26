/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

import java.util.TreeSet;

/**
 *
 * @author cgay
 */
public class Membre {
    private TreeSet<Employes> lesEmployes;

    public Membre() {
        lesEmployes = new TreeSet<Employes>();
    }
    
    public void ajouter(Employes g){
        lesEmployes.add(g);
    }

    @Override
    public String toString() {
        return "Membre de l'entreprise =" + lesEmployes + '}';
    }
    
}
