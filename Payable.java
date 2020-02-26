package entreprise;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colin
 */
public interface Payable {
        public void CalculerSalaire(Employe a){
        if (a.getClass().getSimpleName()=="Commercial"){
            Salaire= (int) (IndiceSal * 12 + 0.1 * a.NbVente);}
    else{
            Salaire= IndiceSal * 12;
    }
    }
         
}
