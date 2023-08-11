/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.BoundaryScanner">API
 *      specification</a>
 */
@JsonpDeserializable
public enum BoundaryScanner implements JsonEnum {
	/**
	 * Use the characters specified by <code>boundary_chars</code> as highlighting
	 * boundaries. The <code>boundary_max_scan</code> setting controls how far to
	 * scan for boundary characters. Only valid for the <code>fvh</code>
	 * highlighter.
	 */
	Chars("chars"),

	/**
	 * Break highlighted fragments at the next sentence boundary, as determined by
	 * Java’s <code>BreakIterator</code>. You can specify the locale to use with
	 * <code>boundary_scanner_locale</code>. When used with the <code>unified</code>
	 * highlighter, the <code>sentence</code> scanner splits sentences bigger than
	 * <code>fragment_size</code> at the first word boundary next to fragment_size.
	 * You can set <code>fragment_size</code> to <code>0</code> to never split any
	 * sentence.
	 */
	Sentence("sentence"),

	/**
	 * Break highlighted fragments at the next word boundary, as determined by
	 * Java’s <code>BreakIterator</code>. You can specify the locale to use with
	 * <code>boundary_scanner_locale</code>.
	 */
	Word("word"),

	;

	private final String jsonValue;

	BoundaryScanner(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<BoundaryScanner> _DESERIALIZER = new JsonEnum.Deserializer<>(
			BoundaryScanner.values());
}
