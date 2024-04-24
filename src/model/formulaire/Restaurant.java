package model.formulaire;

import model.CalendrierAnnuel;
import model.EntiteReservable;
import model.Reservation.Reservation;

public class Restaurant {

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	// ################### Classe interne Table ###################

	private class Table extends EntiteReservable<FormulaireRestaurant> {
		private CalendrierAnnuel calendrierDeuxiemeService;
		private int nbChaises;

		private Table(int nbChaises) {
			super();
			this.nbChaises = nbChaises;
			calendrierDeuxiemeService = new CalendrierAnnuel();
		}

		@Override
		public boolean estLibre(FormulaireRestaurant formulaire) {
			if (formulaire.getNumService() == 1)
				return super.estLibre(formulaire);
			else
				return calendrierDeuxiemeService.estLibre(formulaire.getJour(), formulaire.getMois());
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			if (formulaire.getNombrePersonnes() > nbChaises || formulaire.getNombrePersonnes() < nbChaises - 1)
				return false;
			if (!estLibre(formulaire))
				return false;
			return true;
		}

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			return null;
		}

	}

}