package de.uni_koeln.spinfo.arc.matcher;

import java.util.Map;
import java.util.TreeSet;

/**
 * 
 * @author geduldia
 *
 */
public class SurmiranMatcher extends POSMatcher {


	public SurmiranMatcher(Map<String, TreeSet<String>> fullForms,
						   String collectionName) {
		super(fullForms, collectionName);
	}

	@Override
	boolean isAdverb(String token) {
		if (token.endsWith("maintg")) {
			return true;
		}
		return false;
	}

	@Override
	boolean isIndicativeImperfect(String token) {
		if (token.endsWith("iva") || token.endsWith("ivas")
				|| token.endsWith("ivan") || token.endsWith("eva")
				|| token.endsWith("evas") || token.endsWith("evan")
				|| token.endsWith("ava") || token.endsWith("avas")
				|| token.endsWith("avan")) {
			return true;
		}
		return false;
	}

}
