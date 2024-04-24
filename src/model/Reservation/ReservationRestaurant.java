package model.Reservation;

public class ReservationRestaurant extends Reservation {
	private int numTable;
	private int numService;
	private String[] nomService = { "premier", "deuxieme" };

	public ReservationRestaurant(int jour, int mois, int numService, int numTables) {
		super(jour, mois);
		this.numTable = numTables;
		this.numService = numService;
	}

	@Override
	public String toString() {
		return ("Le " + jour + "/" + mois + " : table n°" + numTable + " pour le " + nomService[numService - 1]
				+ " service.\n");
	}


}
