
/**
 * //http://rosettacode.org/wiki/Four_is_magic
 * @author Andrew Saeyang
 *
 */
public class Four {

	public static void main(String[] args) {

		System.out.println(createMagic(words(18)) );

	}
	
	/** Returns the length of any int's String version
	 * 
	 * @param n String to be converted into its length
	 * @return
	 */
	public static String createMagic (String w) {
		
		if(w.equals("four")) {
			return w + " is "+"magic.";
		}else {
			return w + " is "+ words(w.length())+ ". " + createMagic(words(w.length())) ;
		}
	
		
	}

	/** Converts an int into its String version
	 * 
	 * @param n Any integer
	 * @return A String version of an any int
	 */
	public static String words(int n) {

		String retVal = "";
		switch(n) {

		case 1: retVal += "one";
		break;
		case 2: retVal += "two"; 
		break;
		case 3: retVal += "three"; //thir
		break;
		case 4: retVal += "four";
		break;
		case 5: retVal += "five"; // fif
		break;
		case 6: retVal += "six";
		break;
		case 7: retVal += "seven";
		break;
		case 8: retVal += "eight";
		break;
		case 9: retVal += "nine";
		break;
		case 10: retVal += "ten";
		break;
		case 11: retVal += "eleven";
		break;
		case 12: retVal += "twelve";
		break;
		case 13: retVal += "thirteen";
		break;
		case 14: retVal += "fourteen";
		break;
		case 15: retVal += "fifteen";
		break;
		case 16: retVal += "sixteen";
		break;
		case 17: retVal += "seventeen";
		break;
		case 18: retVal += "eighteen";
		break;
		case 19: retVal += "nineteen";
		break;
		case 20: retVal += "twenty";
		break;

		}

		return retVal;
	}


}
