package model.formulaire;

public class FormulaireHotel extends Formulaire{
	private int identificationEntite;
	private int litSimple;
	private int litDouble;

	public FormulaireHotel(int jour, int mois, int litSimple, int litDouble) {
		super(jour, mois);
		this.litSimple = litSimple;
		this.litDouble = litDouble;
	}

	public int getLitSimple() {
		return litSimple;
	}

	public int getLitDouble() {
		return litDouble;
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
