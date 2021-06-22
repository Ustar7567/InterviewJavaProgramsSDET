package SDET;

public class Ne_ReverseEachWordInAString {

	public static void main(String[] args) {
		String st="Geek for Geeks";
		String [] words=st.split("\\s+");
		String revSt="";
		
		for(int i=0; i<words.length;i++) {
			String word=words[i];
			String revWord="";
			
			for(int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
			}
			revSt=revSt+revWord+" ";
		}
		System.out.println(revSt);
	}

}
