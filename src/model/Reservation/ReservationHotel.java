package model.Reservation;

public class ReservationHotel extends Reservation {
	int nbLits;
	int numChambre;

	public ReservationHotel(int jour, int mois, int nbLits, int numChambre) {
		super(jour, mois);
		this.nbLits = nbLits;
		this.numChambre = numChambre;
	}

	@Override
	public String toString() {
		return ("Le " + jour + "/" + mois + " : chambres n°" + nbLits + " pour " + nbLits + " lits.\n");
	}


}
