package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		int bospop=population;
		double bosgrow=growthRate;
		double bonus=bospop*.5;
		double tx=bospop*bosgrow;
		tx+=bonus;
		return tx;
	}

}
