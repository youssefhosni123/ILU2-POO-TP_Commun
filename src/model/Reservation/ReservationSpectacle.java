package model.Reservation;

public class ReservationSpectacle extends Reservation{
	
	private int zone;
	private int siege;

	public ReservationSpectacle(int jour, int mois, int zone, int siege) {
		super(jour, mois);
		this.zone = zone;
		this.siege = siege;
	}

	@Override
	public String toString() {
		return ("Le " + jour + "/" + mois + " : siège n°" + siege + " dans la zone " + zone + ".\n");
	}
}
