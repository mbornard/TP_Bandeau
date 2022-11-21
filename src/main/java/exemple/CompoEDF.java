package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class CompoEDF implements Animation{
	
	private String[] compo;

	public CompoEDF(String[] compo) {
		super();
		this.compo = compo;
	}
	

	@Override
	public void jouer(Bandeau b) {
		// TODO Auto-generated method stub
		b.setForeground(Color.black);

        b.setBackground(Color.black);
		b.sleep(2000);
        b.setBackground(Color.white);

		b.setMessage("La compostion de l'équipe de france de rugby dans");
		b.sleep(2500);
        b.setBackground(Color.black);

		b.setFont(new Font("SansSerif", Font.BOLD, 50));
		for (int i=0; i<5; i++) {
			int temp = 5-i;

	        b.setBackground(Color.yellow);

			b.setMessage(""+temp);
			b.sleep(1000);
	        b.setBackground(Color.black);
			b.sleep(750);
		}
		for (int i=0; i<compo.length; i++) {

	        b.setBackground(Color.yellow);

			b.setMessage(compo[i]);
			b.sleep(1000);
	        b.setBackground(Color.black);
			b.sleep(750);
		}
		b.setBackground(Color.white);
        b.setFont(new Font("SansSerif", Font.PLAIN, 15)); // on remet la police à l'origine pour ne pas impacter les autres effetes.

	}

}
