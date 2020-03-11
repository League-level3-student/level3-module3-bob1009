package _01_AnimalFarm;

import java.util.ArrayList;

public class farm {
public static void main(String[] args) {
	pig wilbert=new pig();
	farmer john=new farmer();
	cow moo=new cow();
	duck quack=new duck();
	farmer sally=new farmer();
	pig oink=new pig();
	ArrayList<Animal> chad=new ArrayList<Animal>();
	chad.add(wilbert);
	chad.add(oink);
	chad.add(sally);
	chad.add(quack);
	chad.add(moo);
	chad.add(john);
	Animal hold;
	for (int i = 0; i < chad.size(); i++) {
		hold=chad.get(i);
		hold.makeNoise();
	}
}
}
