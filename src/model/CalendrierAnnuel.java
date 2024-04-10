package model;
import java.util.HashMap;
import java.util.Map;

public class CalendrierAnnuel {
	
	 private int annee;
	    private Map<Integer, Boolean> disponibilites; // Map<jour de l'année, disponibilité>

	    public CalendrierAnnuel(int annee) {
	        this.annee = annee;
	        this.disponibilites = new HashMap<>();
	        initialiserCalendrier();
	    }

	    // Initialise le calendrier avec toutes les disponibilités à true (disponible)
	    private void initialiserCalendrier() {
	        for (int jour = 1; jour <= 365; jour++) {
	            disponibilites.put(jour, true);
	        }
	    }

	    // Vérifie si le jour spécifié est disponible
	    public boolean estDisponible(int jour) {
	        return disponibilites.getOrDefault(jour, false); // Par défaut, considère non disponible si le jour n'existe pas
	    }

	    // Réserve le jour spécifié
	    public void reserverJour(int jour) {
	        if (disponibilites.containsKey(jour)) {
	            disponibilites.put(jour, false);
	        } else {
	            throw new IllegalArgumentException("Le jour spécifié n'est pas valide.");
	        }
	    }

	    // Libère la réservation du jour spécifié
	    public void libererJour(int jour) {
	        if (disponibilites.containsKey(jour)) {
	            disponibilites.put(jour, true);
	        } else {
	            throw new IllegalArgumentException("Le jour spécifié n'est pas valide.");
	        }
	    }
	   
}
