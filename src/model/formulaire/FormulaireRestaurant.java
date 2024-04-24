package model.formulaire;

public class FormulaireRestaurant extends Formulaire {
	private int identificationEntite;
	private int nombrePersonnes;
	private int numService;

	public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int numService) {
		super(jour, mois);
		this.nombrePersonnes = nombrePersonnes;
		this.numService = numService;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public int getNumService() {
		return numService;
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
