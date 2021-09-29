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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SuggestFuzziness
@JsonpDeserializable
public final class SuggestFuzziness implements JsonpSerializable {
	private final String fuzziness;

	private final int minLength;

	private final int prefixLength;

	private final boolean transpositions;

	private final boolean unicodeAware;

	// ---------------------------------------------------------------------------------------------

	public SuggestFuzziness(Builder builder) {

		this.fuzziness = Objects.requireNonNull(builder.fuzziness, "fuzziness");
		this.minLength = Objects.requireNonNull(builder.minLength, "min_length");
		this.prefixLength = Objects.requireNonNull(builder.prefixLength, "prefix_length");
		this.transpositions = Objects.requireNonNull(builder.transpositions, "transpositions");
		this.unicodeAware = Objects.requireNonNull(builder.unicodeAware, "unicode_aware");

	}

	public SuggestFuzziness(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code fuzziness}
	 */
	public String fuzziness() {
		return this.fuzziness;
	}

	/**
	 * API name: {@code min_length}
	 */
	public int minLength() {
		return this.minLength;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	public int prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code transpositions}
	 */
	public boolean transpositions() {
		return this.transpositions;
	}

	/**
	 * API name: {@code unicode_aware}
	 */
	public boolean unicodeAware() {
		return this.unicodeAware;
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

		generator.writeKey("fuzziness");
		generator.write(this.fuzziness);

		generator.writeKey("min_length");
		generator.write(this.minLength);

		generator.writeKey("prefix_length");
		generator.write(this.prefixLength);

		generator.writeKey("transpositions");
		generator.write(this.transpositions);

		generator.writeKey("unicode_aware");
		generator.write(this.unicodeAware);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SuggestFuzziness}.
	 */
	public static class Builder implements ObjectBuilder<SuggestFuzziness> {
		private String fuzziness;

		private Integer minLength;

		private Integer prefixLength;

		private Boolean transpositions;

		private Boolean unicodeAware;

		/**
		 * API name: {@code fuzziness}
		 */
		public Builder fuzziness(String value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * API name: {@code min_length}
		 */
		public Builder minLength(int value) {
			this.minLength = value;
			return this;
		}

		/**
		 * API name: {@code prefix_length}
		 */
		public Builder prefixLength(int value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * API name: {@code transpositions}
		 */
		public Builder transpositions(boolean value) {
			this.transpositions = value;
			return this;
		}

		/**
		 * API name: {@code unicode_aware}
		 */
		public Builder unicodeAware(boolean value) {
			this.unicodeAware = value;
			return this;
		}

		/**
		 * Builds a {@link SuggestFuzziness}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SuggestFuzziness build() {

			return new SuggestFuzziness(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SuggestFuzziness}
	 */
	public static final JsonpDeserializer<SuggestFuzziness> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SuggestFuzziness::setupSuggestFuzzinessDeserializer, Builder::build);

	protected static void setupSuggestFuzzinessDeserializer(DelegatingDeserializer<SuggestFuzziness.Builder> op) {

		op.add(Builder::fuzziness, JsonpDeserializer.stringDeserializer(), "fuzziness");
		op.add(Builder::minLength, JsonpDeserializer.integerDeserializer(), "min_length");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::transpositions, JsonpDeserializer.booleanDeserializer(), "transpositions");
		op.add(Builder::unicodeAware, JsonpDeserializer.booleanDeserializer(), "unicode_aware");

	}

}
