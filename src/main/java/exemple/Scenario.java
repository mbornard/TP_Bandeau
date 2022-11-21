package exemple;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import bandeau.Bandeau;

public class Scenario {

	private Bandeau b;
	private HashMap<Animation, Integer> lesAnimations = new HashMap<>();

	public Scenario(Bandeau b) {
		super();
		this.b = b;
		// this.m = m;, 
	}

	public void ajouterAnimation(Animation a, int nbRepet) {
		lesAnimations.put(a, nbRepet);
	}

	public void debut() {
		for (Map.Entry<Animation, Integer> m : lesAnimations.entrySet()) {
			for (int i = 0; i < m.getValue(); i++) {
				m.getKey().jouer(b);
			
			}
		}
		b.close();

	}
}
