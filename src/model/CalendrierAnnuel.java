package model;

import java.util.function.BooleanSupplier;

public class CalendrierAnnuel {
	private Mois[] calendrier ;
	public CalendrierAnnuel () {
		this.calendrier= new Mois[12];
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Fevrier", 28);
		calendrier[2] = new Mois("Mars", 31);
		calendrier[3] = new Mois("Avril", 30);
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juin", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Aout", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Decembre", 31);
	}
	public boolean estLibre (int jour,int mois)
	{
		if(mois>12 || mois<1 )
		{
			throw new IndexOutOfBoundsException("mois invalid");
			
		}
		return calendrier[mois-1].estLibre(jour);
	}
	public boolean reserver(int jour, int mois) {
		try {
			calendrier[mois - 1].reserver(jour);
			return true;
		} catch (IllegalStateException e) {
			e.getMessage();
			return false;
		}
	}
	private class Mois {
		private String nom;
		private boolean[] jours;

		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for (int i = 0; i < nbJours; i++)
				jours[i] = false;
		}

		private boolean estLibre(int jour) throws IndexOutOfBoundsException {
			if (jour < 1 || jour > jours.length)
				throw new IndexOutOfBoundsException();
			return !jours[jour - 1];
		}

		private void reserver(int jour) throws IllegalStateException {
			if (!estLibre(jour))
				throw new IllegalStateException();
			jours[jour - 1] = true;
		}
		
	}
	

	
}