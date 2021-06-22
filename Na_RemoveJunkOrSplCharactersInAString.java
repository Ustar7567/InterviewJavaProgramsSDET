package SDET;

public class Na_RemoveJunkOrSplCharactersInAString {

	public static void main(String[] args) {
		String st = "Geeks%#Geeks";
		String resultStr = " ";
		// st=st.replaceAll("%#", " "); //This one line of code is using in-built method
		int len = st.length();
		for (int i = 0; i < len; i++) {
			if (st.charAt(i) > 64 && st.charAt(i) <= 122) {// Comparing letters with their corresponding ASCII values
				resultStr = resultStr + st.charAt(i);
			}
		}

		System.out.println(resultStr);
	}

}
