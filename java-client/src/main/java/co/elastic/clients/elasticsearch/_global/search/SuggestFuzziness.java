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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.SuggestFuzziness
public final class SuggestFuzziness implements ToJsonp {
	private final JsonValue fuzziness;

	private final Number minLength;

	private final Number prefixLength;

	private final Boolean transpositions;

	private final Boolean unicodeAware;

	// ---------------------------------------------------------------------------------------------

	protected SuggestFuzziness(Builder builder) {

		this.fuzziness = Objects.requireNonNull(builder.fuzziness, "fuzziness");
		this.minLength = Objects.requireNonNull(builder.minLength, "min_length");
		this.prefixLength = Objects.requireNonNull(builder.prefixLength, "prefix_length");
		this.transpositions = Objects.requireNonNull(builder.transpositions, "transpositions");
		this.unicodeAware = Objects.requireNonNull(builder.unicodeAware, "unicode_aware");

	}

	/**
	 * API name: {@code fuzziness}
	 */
	public JsonValue fuzziness() {
		return this.fuzziness;
	}

	/**
	 * API name: {@code min_length}
	 */
	public Number minLength() {
		return this.minLength;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	public Number prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code transpositions}
	 */
	public Boolean transpositions() {
		return this.transpositions;
	}

	/**
	 * API name: {@code unicode_aware}
	 */
	public Boolean unicodeAware() {
		return this.unicodeAware;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("fuzziness");
		generator.write(this.fuzziness);

		generator.writeKey("min_length");
		generator.write(this.minLength.doubleValue());

		generator.writeKey("prefix_length");
		generator.write(this.prefixLength.doubleValue());

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
		private JsonValue fuzziness;

		private Number minLength;

		private Number prefixLength;

		private Boolean transpositions;

		private Boolean unicodeAware;

		/**
		 * API name: {@code fuzziness}
		 */
		public Builder fuzziness(JsonValue value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * API name: {@code min_length}
		 */
		public Builder minLength(Number value) {
			this.minLength = value;
			return this;
		}

		/**
		 * API name: {@code prefix_length}
		 */
		public Builder prefixLength(Number value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * API name: {@code transpositions}
		 */
		public Builder transpositions(Boolean value) {
			this.transpositions = value;
			return this;
		}

		/**
		 * API name: {@code unicode_aware}
		 */
		public Builder unicodeAware(Boolean value) {
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
	 * Json deserializer for SuggestFuzziness
	 */
	public static final JsonpDeserializer<SuggestFuzziness> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SuggestFuzziness::setupSuggestFuzzinessDeserializer);

	protected static void setupSuggestFuzzinessDeserializer(DelegatingDeserializer<SuggestFuzziness.Builder> op) {

		op.add(Builder::fuzziness, JsonpDeserializer.jsonValueDeserializer(), "fuzziness");
		op.add(Builder::minLength, JsonpDeserializer.numberDeserializer(), "min_length");
		op.add(Builder::prefixLength, JsonpDeserializer.numberDeserializer(), "prefix_length");
		op.add(Builder::transpositions, JsonpDeserializer.booleanDeserializer(), "transpositions");
		op.add(Builder::unicodeAware, JsonpDeserializer.booleanDeserializer(), "unicode_aware");

	}

}
