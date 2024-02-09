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

package co.elastic.clients.elasticsearch.text_structure.test_grok_pattern;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: text_structure.test_grok_pattern.MatchedText

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#text_structure.test_grok_pattern.MatchedText">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatchedText implements JsonpSerializable {
	private final boolean matched;

	private final Map<String, List<MatchedField>> fields;

	// ---------------------------------------------------------------------------------------------

	private MatchedText(Builder builder) {

		this.matched = ApiTypeHelper.requireNonNull(builder.matched, this, "matched");
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);

	}

	public static MatchedText of(Function<Builder, ObjectBuilder<MatchedText>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code matched}
	 */
	public final boolean matched() {
		return this.matched;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, List<MatchedField>> fields() {
		return this.fields;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("matched");
		generator.write(this.matched);

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, List<MatchedField>> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (MatchedField item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchedText}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MatchedText> {
		private Boolean matched;

		@Nullable
		private Map<String, List<MatchedField>> fields;

		/**
		 * Required - API name: {@code matched}
		 */
		public final Builder matched(boolean value) {
			this.matched = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, List<MatchedField>> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, List<MatchedField> value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchedText}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchedText build() {
			_checkSingleUse();

			return new MatchedText(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchedText}
	 */
	public static final JsonpDeserializer<MatchedText> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MatchedText::setupMatchedTextDeserializer);

	protected static void setupMatchedTextDeserializer(ObjectDeserializer<MatchedText.Builder> op) {

		op.add(Builder::matched, JsonpDeserializer.booleanDeserializer(), "matched");
		op.add(Builder::fields, JsonpDeserializer
				.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(MatchedField._DESERIALIZER)), "fields");

	}

}
