//DESCOMBE J�r�my
package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Categorie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class init{
			//Creation nouvelles propri�t�s
			
			ArrayList<Categorie> listeCat = new ArrayList<Categorie>();
			int ageMini;
			int ageMaxi;
			String libelle;
			
			//Initialisation des variables
			
			init (int ageMini, int ageMaxi, String libelle) {
				this.ageMini = ageMini;
				this.ageMaxi = ageMaxi;
				this.libelle = libelle;
			
			}
			//Fonction Correspond qui v�rifie que l'age en param�tre correspond aux valeurs min et max
			
			boolean Correspond (int age) {
				boolean result = false;
				if(ageMini <= age && age <= ageMaxi ) {
					 result = true;
				}
				else{
					result = false;
				}
			return result;	
			}
			
			//Fonction getCategorie qui renvoie l'age de la personne en comparant l'ann�e de naissance en param�tre avec la date actuelle
/*
			int getCategorie(int annee) {
				LocalDateTime ldt = LocalDateTime.now();
				int anneeCourante = ldt.getYear();
				int ageCalcule = anneeCourante - annee; 
				try {
					for (int i = 0; i < listeCat.size(); i++) {
						System.out.println(listeCat.get(i));
						if(Correspond(listeCat[i]) == true) {	//J'ai une erreur avec l'arraylist, je ne comprend pas trop les test qui est sens�
							return ageCalcule;				//�tre r�alis� et qui est demand� dasn les consignes	
				    	  }
					}
				}catch(IOException e) {
						e.printStackTrace();
				}
				      
			}
*/
			//Fonction chergerFichier Texte qui lit le fichier plac� en param�tre ligne epar ligne
			
			public void chargerFichierTexte(String name) {
				
		        File fichier = new File("C:/Users/j.descombe/Desktop/JAVA/categorie.txt");
		        System.out.println(fichier);
		        try (BufferedReader br = new BufferedReader(new FileReader(fichier))) {
		            String ligne;
		            while ((ligne = br.readLine()) != null) {
		                System.out.println(ligne);
		                Categorie cat = new Categorie();
		                listeCat.add(cat);
		                
		            }
		            
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    System.out.println("La taille est de : " + listeCat.size());
		    System.out.println(listeCat);
			}
			
		}
		
	}

}
