package org.eclipse.rap.incubator.styledtext;

import org.eclipse.rap.json.JsonObject;

public class TextRange {

	int rowStart;
	int columnStart;
	int rowEnd;
	int columnEnd;
	
	public TextRange(int rowStart, int columnStart, int rowEnd, int columnEnd) {
		this.rowStart = rowStart;
		this.columnStart = columnStart;
		this.rowEnd = rowEnd;
		this.columnEnd = columnEnd;
	}
	
	//var range = new Range(rowStart, columnStart, rowEnd, columnEnd);
	//var marker = editor.getSession().addMarker(range,"ace_selected_word", "text");
	public JsonObject getValue() {	
		JsonObject properties = new JsonObject();
		properties.add("rowStart", rowStart);
		properties.add("rowEnd", rowEnd);
		properties.add("columnStart", columnStart);
		properties.add("columnEnd", columnEnd);	
		return properties;
	}
}
