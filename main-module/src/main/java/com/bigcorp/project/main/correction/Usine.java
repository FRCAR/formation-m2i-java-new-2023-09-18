package com.bigcorp.project.main.correction;

import com.bigcorp.project.main.lambda.Machine;
import com.bigcorp.project.main.lambda.Matiere;

/**
 * Classe usine contenant des machines 
 * qui traitent toutes de manière unique
 * les matériaux qu'on leur donne.
 */
public class Usine {
	
	public static void main(String[] args) {
		
		//Création de la machine
		Machine machine1 = new Machine();
		machine1.setId(1);
		machine1.setNom("Decoupeuse");
		machine1.setReference("decoup-001");
		
		//Remplissage de la machine
		machine1.setMatiere(new Matiere("Verre", 2, 100));
		
		//La machine fait son traitement
		machine1.travaille(m -> System.out.println("Je découpe un matériau qui vaut " + m.getPrix()));
		machine1.travaille(m -> System.out.println("Je tranche le " + m.getNom()));
		machine1.travaille(m -> System.out.println("Je travaille le " + m.getNom()));
		
		machine1.travaille(m -> System.out.println(m));
		// Utilisation d'une référence de méthode sur un objet (ici System.out.println)
		// La ligne ci-dessus équivaut à la ligne ci-dessous
		machine1.travaille(System.out::println);

		machine1.travaille(m -> m.afficheNom());
		// Utilisation d'une référence de méthode sur l'argument
		// La ligne ci-dessus équivaut à la ligne ci-dessous
		machine1.travaille(Matiere::afficheNom);

	}

}
