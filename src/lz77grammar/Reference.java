package lz77grammar;

import java.io.Serializable;

public class Reference implements Serializable {
	// offset points to the beginning of a match relative
	// to the current location. Has a value of 0 if there
	// is no match.
	int offset;
	// stringLen specifies the length of the match or 0 if
	// there is no match
	int stringLen;
	// nextChar is the first non-matching character
	// following the match, or the only character if there
	// is no match.
	String nextChar;
	// ---------------------------------------------------//

	// Constructor
	Reference(int offset, int stringLen, String nextChar) {
		this.offset = offset;
		this.stringLen = stringLen;
		this.nextChar = nextChar;
	}// end constructor
		// ---------------------------------------------------//

}
