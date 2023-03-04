package metier;

public class calculationcreditimpl implements calculationcredit {

	@Override
	public double calculonscreditconsommation(double capitale, double taux, double duree) {
			double t=taux/12;
			double t1=capitale*t;
			double  t2=1-(1+(t)-(12*duree));
		return t1/t2;
	}

	@Override
	public double calculonsmensualités(double capitale, double taux, double duree) {
		double t=taux/12;
		double t1=capitale*t;
		double  t2=1-(1+(t)-(duree));
	return t1/t2;
	}

	
}
