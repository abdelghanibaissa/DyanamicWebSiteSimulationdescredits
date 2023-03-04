package ressource;

public class credit {
	private double  montant;
	private double duree;
	private double taux;
	private double totale;
	
	public credit(double  montant,double duree,double taux,double totale) {
		this.montant=montant;
		this.duree=duree;
		this.taux=taux;
		this.totale=totale;
	}
	public credit() {
	}
	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	

	public double getTotale() {
		return totale;
	}

	public void setTotale(double totale) {
		this.totale = totale;
	}

	@Override
	public String toString() {
		return "credit [montant=" + montant + ", duree=" + duree + ", taux=" + taux + ", totale=" + totale + "]";
	}

	
}
