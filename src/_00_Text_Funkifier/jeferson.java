package _00_Text_Funkifier;

public class jeferson extends SpecialString{

	public jeferson(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
		String word="";
		for (int i = s.length()-1; i >= 0; i--) {
			word+=s.charAt(i);	
		}
		return word;
	}

}
