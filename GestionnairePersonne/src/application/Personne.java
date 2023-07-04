//DESCOMBE Jérémy

package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class personne{
			
			//Creation nouvelles propriétés
			//Mon observable liste ne fonctionne pas, je ne sais pas pourquoi
			
			//ObservableList<personne> listePersonne = new FXCollections.observableArrayList();
			String nom;
			String annee;
			String categorie;

			//Initialisation des variables
			
			personne (String nom, String annee, String categorie) {
				this.nom = nom.toUpperCase();
				this.annee = annee;
				this.categorie = categorie;
			
			}

			public void toString(String nom, String annee,  String categorie){
				 char charNom;
				 char charAnnee;
				 char charCategorie;
				 
		        for(int i=0; i < nom.length() ; i++)
		        {
		          charNom = nom.charAt(i);
		          System.out.println(charNom);
		        }
		        for(int i=0; i < annee.length() ; i++)
		        {
		          charAnnee = annee.charAt(i);
		          System.out.println(charAnnee);
		        }
		        for(int i=0; i < categorie.length() ; i++)
		        {
		          charCategorie = categorie.charAt(i);
		          System.out.println(charCategorie);
		        }

			}    
		}
	}

}
