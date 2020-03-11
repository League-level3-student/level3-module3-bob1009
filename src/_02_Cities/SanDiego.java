package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double SDgrowth=growthRate;
		int SDpop=population;
		double taxe=SDgrowth*SDpop;
		taxe+=1000000;
		return taxe;
	}
}
