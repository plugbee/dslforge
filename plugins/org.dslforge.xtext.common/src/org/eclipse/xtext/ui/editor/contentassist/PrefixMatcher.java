package org.eclipse.xtext.ui.editor.contentassist;

public abstract class PrefixMatcher {

	public abstract boolean isCandidateMatchingPrefix(String name, String prefix);

	public static class IgnoreCase extends PrefixMatcher {
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			return name.regionMatches(true, 0, prefix, 0, prefix.length());
		}
	}
}