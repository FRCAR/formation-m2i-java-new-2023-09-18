package com.bigcorp.project.main.lambda;

public class CloseButton implements Button {

	@Override
	public String click(Window window) {
		System.out.println("Je travaille sur : " + window);
		System.out.println("La fenêtre est fermée");
		return "close";
	}


}
