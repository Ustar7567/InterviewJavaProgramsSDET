package SDET;

public class Nb_RemoveWhiteSpacesInAString {

	public static void main(String[] args) {
	String st="Geeks For     Geeks";
	//st=st.replaceAll(" ", "");   Using built in method
	//System.out.println(st);

	char[] stCh=st.toCharArray();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<stCh.length;i++) {
		if((stCh[i]!=' ') && (stCh[i]!= '\t')) { //\t is tab space in java
			sb.append(stCh[i]);
		}
	}
	String stNoSpc=sb.toString();
	System.out.println(stNoSpc);
	}

}
