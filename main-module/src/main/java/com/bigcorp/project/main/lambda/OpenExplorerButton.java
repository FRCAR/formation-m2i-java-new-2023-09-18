package com.bigcorp.project.main.lambda;

public class OpenExplorerButton implements Button {

	@Override
	public String click(Window window) {
		System.out.println("Je travaille sur : " + window);
		System.out.println("J'ouvre l'explorateur pour choisir un fichier");
		return "done";
	}

}
