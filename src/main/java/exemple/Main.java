package exemple;
import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bandeau b = new Bandeau();
		 
		Scenario s =  new Scenario(b);
		Pendu t=	new Pendu("j'essaye l'animation du pendu");
		s.ajouterAnimation(t, 1);
		s.ajouterAnimation(new Rotation("je teste la rotation"), 2);
		String[] compo  = {"Julien Marchand", "Antoine Dupont", "Romain Ntamack"};
		CompoEDF c = new CompoEDF(compo);
		s.ajouterAnimation(c, 1);
		s.debut();
		//s.ajouterAnimation(new TexteDeCouleurClignotant("letestDesMots"), 1);
		
	
		
	}

}
