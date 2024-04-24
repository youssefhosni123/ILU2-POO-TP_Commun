package model.formulaire;

public class FormulaireSpectacle extends Formulaire{
	private int identificationEntite;
	private int zone;

	public FormulaireSpectacle(int jour, int mois, int zone) {
		super(jour, mois);
		this.zone = zone;
	}

	public int getZone() {
		return zone;
	}

	@Override
	public int getIdentificationEntite() {
		return identificationEntite;
	}

	@Override
	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}

}
