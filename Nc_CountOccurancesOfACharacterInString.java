package SDET;

public class Nc_CountOccurancesOfACharacterInString {

	public static void main(String[] args) {
		String st="GeeksForGeeks";
		char searchCh='e';
		int len=st.length();
		int count=0;
		
		for(int i=0;i<len;i++) {
			if(searchCh==st.charAt(i)) {
			count++;	
			}
		}	
		System.out.println("Character 'e' has appeared "+count+" times in the given string");
	}

}
