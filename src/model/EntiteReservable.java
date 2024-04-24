package model;

import model.formulaire.Formulaire;
import model.Reservation.Reservation;

public abstract class EntiteReservable<F extends Formulaire> {
	protected CalendrierAnnuel calendrier;
	protected int identifiant;

	protected EntiteReservable() {
		this.calendrier = new CalendrierAnnuel();
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public boolean estLibre(F formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}

	public abstract boolean compatible(F formulaire);

	public abstract Reservation reserver(F formulaire);

}

