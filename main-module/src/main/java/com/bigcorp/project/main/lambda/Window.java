package com.bigcorp.project.main.lambda;

public class Window {

	private Button button;

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void act() {
		this.button.click(this);
	}

	public static void main(String[] args) {
		Window window = new Window();

		// Utilisation de classes définies dans leur fichier .java
		window.setButton(new CloseButton());
		window.act();
		window.setButton(new OpenExplorerButton());
		window.act();
		
		// Utilisation de classe anonyme définie en ligne
		window.setButton( new Button() {
			@Override
			public String click(Window window) {
				System.out.println("Je cherche les virus sur le poste");
				return "done";
			}
		});
		window.act();
		
		// Utilisation d'une lambda associée à variable
		Component buttonLambda = (Window w) -> {
			return "done";
		};
		// La lambda ci-dessous peut être résumée en cell-ci :
		Component buttonLambda2 = w -> "done";

		window.setButton(buttonLambda);
		window.act();

		// Utilisation d'une lambda associée à variable
		String s = "coucou";
		window.setButton((Window w) -> {
			// Utilisation d'une variable définie dans la méthode
			int a = 3;
			System.out.println(a);

			// Utilisation d'un argument
			System.out.println(w);

			// Utilisation d'une variable effectivement final
			System.out.println(s);
			return "done";
		});

	}

}
