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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.mapping.TextIndexPrefixes
@JsonpDeserializable
public final class TextIndexPrefixes implements JsonpSerializable {
	private final Integer maxChars;

	private final Integer minChars;

	// ---------------------------------------------------------------------------------------------

	public TextIndexPrefixes(Builder builder) {

		this.maxChars = Objects.requireNonNull(builder.maxChars, "max_chars");
		this.minChars = Objects.requireNonNull(builder.minChars, "min_chars");

	}

	/**
	 * API name: {@code max_chars}
	 */
	public Integer maxChars() {
		return this.maxChars;
	}

	/**
	 * API name: {@code min_chars}
	 */
	public Integer minChars() {
		return this.minChars;
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

		generator.writeKey("max_chars");
		generator.write(this.maxChars);

		generator.writeKey("min_chars");
		generator.write(this.minChars);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TextIndexPrefixes}.
	 */
	public static class Builder implements ObjectBuilder<TextIndexPrefixes> {
		private Integer maxChars;

		private Integer minChars;

		/**
		 * API name: {@code max_chars}
		 */
		public Builder maxChars(Integer value) {
			this.maxChars = value;
			return this;
		}

		/**
		 * API name: {@code min_chars}
		 */
		public Builder minChars(Integer value) {
			this.minChars = value;
			return this;
		}

		/**
		 * Builds a {@link TextIndexPrefixes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TextIndexPrefixes build() {

			return new TextIndexPrefixes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TextIndexPrefixes}
	 */
	public static final JsonpDeserializer<TextIndexPrefixes> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TextIndexPrefixes::setupTextIndexPrefixesDeserializer, Builder::build);

	protected static void setupTextIndexPrefixesDeserializer(DelegatingDeserializer<TextIndexPrefixes.Builder> op) {

		op.add(Builder::maxChars, JsonpDeserializer.integerDeserializer(), "max_chars");
		op.add(Builder::minChars, JsonpDeserializer.integerDeserializer(), "min_chars");

	}

}
