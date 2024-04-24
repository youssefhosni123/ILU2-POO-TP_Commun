package model.formulaire;

public abstract class Formulaire {
	
		protected int jour;
		protected int mois;

		protected Formulaire(int jour, int mois) {
			this.jour = jour;
			this.mois = mois;
		}

		public int getJour() {
			return jour;
		}

		public int getMois() {
			return mois;
		}

		public abstract int getIdentificationEntite();

		public abstract void setIdentificationEntite(int identificationEntite);

	}


