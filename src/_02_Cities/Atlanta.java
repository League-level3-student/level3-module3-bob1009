package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		int ATpop=population;
		double ATgrow=growthRate;
		double mult=ATgrow*2;
		double taxes=ATgrow*ATpop;
		taxes=taxes*mult;
		return taxes;
	}

}
