package HomeWork8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SentenceSpace {
	/*Enter a sentence that contains the words between more than one space. 
	 * Convert all spaces, consecutive, one. For example,
	 *  if we introduce the sentence "I    am      learning     Java   Core»,
	 *   we have to get the "I'm learning Java Core»
	 */

	public static void main(String[] args) {
		String sentenceSpace = "   Returns 23   a   string    whose    value    is this  string,"
				+ " with any   leading and    trailing    whitespace    removed. ";
		String newSentenceSpace = "";
		Pattern pattern = Pattern.compile("\\w*[\\S]");
		Matcher matcher = pattern.matcher(sentenceSpace);
		while (matcher.find()) {			
			newSentenceSpace = newSentenceSpace +(sentenceSpace.substring(matcher.start(), matcher.end()) + " ");
		}
		System.out.println(newSentenceSpace);
	}

}
