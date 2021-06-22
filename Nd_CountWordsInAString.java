package SDET;

public class Nd_CountWordsInAString {

	public static void main(String[] args) {
		String st="Geeks For Geeks";
		//System.out.println(st.split(" ").length); 
		//The above piece of code works only if there's one space between words. 
		//If there is more than one space between two words like "Geeks  For    Geeks", it will not work fine
		
		//System.out.println(st.split("\\s+").length); *First solution in one line using in-built method
		
		System.out.println(wordCountMethod(st));  //Second solution by using for loop
	}
	
	public static int wordCountMethod(String st) {
		int wordCount=1;
		for(int i=0; i<st.length();i++) {
			if(st.charAt(i)==' ' && i<st.length()-1 && st.charAt(i+1)!=' ') {
				wordCount++;
			}
		}
		return wordCount;
	}

}
