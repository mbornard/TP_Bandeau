package exemple;

import java.util.Arrays;

import bandeau.Bandeau;

public class Pendu implements Animation{
	private String m;

	public Pendu(String m) {
		super();
		this.m = m;
	}


	public String[] crypterMot(String m) {
		int i = m.length();
		String[] motCrypte =new String[i];

		for (int j = 0; j < i; j++) {

			motCrypte[j] = "_";
		}
		return motCrypte;
	}

		
		public void actualiserMotCrypte(String[] motCrypt, String l, String m) {
			int taille = motCrypt.length;
			for(int i =0; i<taille; i++) {
				if (m.substring(i, i+1).toLowerCase().equals(l.toLowerCase())) {
					motCrypt[i] = l;
				}
			}
		}
	public void jouer(Bandeau b) {
		String[]  temp = crypterMot(m);
		for(int i =1; i<m.length()+1; i++) {
			actualiserMotCrypte(temp, m.substring(i-1, i), m);
			b.setMessage(Arrays.toString(temp));
			b.sleep(500);
		}
	}



}
