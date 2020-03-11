package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		int LApop=population;
		double LAgrow=growthRate;
		double mult=LAgrow*.5;
		double taxs=LApop*LAgrow;
		taxs=taxs*mult;
		return taxs;
	}
	
}
