package model;

import model.formulaire.Formulaire;
import model.Reservation.Reservation;

public class CentraleReservation<E extends EntiteReservable<F>, F extends Formulaire> {
	E[] tableauEntites;
	int nbEntites;

	public CentraleReservation(E[] tableauEntites) {
		this.tableauEntites = tableauEntites;
		this.nbEntites = nbEntites;
	}

	public int ajouterEntite(E entite) throws IndexOutOfBoundsException {
		if (nbEntites >= tableauEntites.length) {
			throw new IndexOutOfBoundsException("Impossibles d'ajouter une entite");
		}
		entite.setIdentifiant(nbEntites + 1);
		tableauEntites[nbEntites++] = entite;
		return nbEntites;
	}

	public int[] donnerPossibilites(F formulaire) {
		int[] entiteDisponibles = new int[nbEntites];
		for (int i = 0; i < nbEntites; i++) {
			entiteDisponibles[i] = tableauEntites[i].estLibre(formulaire) ? tableauEntites[i].getIdentifiant() : 0;
		}
		return entiteDisponibles;
	}

	public Reservation reserver(int numEntite, F formulaire) throws IllegalStateException {
		if (!tableauEntites[numEntite - 1].estLibre(formulaire))
			throw new IllegalStateException("Reservation d'une entitee deja reservee");
		formulaire.setIdentificationEntite(tableauEntites[numEntite].getIdentifiant());
		return tableauEntites[numEntite].reserver(formulaire);
	}

}
