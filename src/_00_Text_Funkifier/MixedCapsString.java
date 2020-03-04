package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String WORD="";
		char holder='o';
		char lower='z';
		for (int i = 0; i < s.length(); i++) {
			if (i%2==1) {
				holder=Character.toUpperCase(s.charAt(i));
				WORD+=holder;
			}
			else if (i%2==0) {
				lower=Character.toLowerCase(s.charAt(i));
				WORD+=lower;
			}
			
		}
		return WORD;
	}

}
