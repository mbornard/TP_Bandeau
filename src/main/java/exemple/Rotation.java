package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class Rotation implements Animation {
	private String m;

	public Rotation(String m) {
		super();
		this.m = m;
	}
	
	public void jouer(Bandeau b) {
        b.setMessage(m);
        for (int i = 5; i < 60; i += 5) {
            b.setFont(new Font("Dialog", Font.BOLD, 5 + 2*i));
            b.setRotation(i*Math.PI / 2.0f);
            b.sleep(100);
            b.setRotation((i+1)*Math.PI / 2.0f);
            b.setRotation(0.0f);
            b.sleep(100);
        }
        b.sleep(1000);
        b.setFont(new Font("SansSerif", Font.PLAIN, 15)); // on remet la police à l'origine pour ne pas impacter les autres effetes.

	}
	
	
}
