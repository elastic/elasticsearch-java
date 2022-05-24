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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SuggestFuzziness

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.SuggestFuzziness">API
 *      specification</a>
 */
@JsonpDeserializable
public class SuggestFuzziness implements JsonpSerializable {
	@Nullable
	private final String fuzziness;

	@Nullable
	private final Integer minLength;

	@Nullable
	private final Integer prefixLength;

	@Nullable
	private final Boolean transpositions;

	@Nullable
	private final Boolean unicodeAware;

	// ---------------------------------------------------------------------------------------------

	private SuggestFuzziness(Builder builder) {

		this.fuzziness = builder.fuzziness;
		this.minLength = builder.minLength;
		this.prefixLength = builder.prefixLength;
		this.transpositions = builder.transpositions;
		this.unicodeAware = builder.unicodeAware;

	}

	public static SuggestFuzziness of(Function<Builder, ObjectBuilder<SuggestFuzziness>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code fuzziness}
	 */
	@Nullable
	public final String fuzziness() {
		return this.fuzziness;
	}

	/**
	 * API name: {@code min_length}
	 */
	@Nullable
	public final Integer minLength() {
		return this.minLength;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public final Integer prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code transpositions}
	 */
	@Nullable
	public final Boolean transpositions() {
		return this.transpositions;
	}

	/**
	 * API name: {@code unicode_aware}
	 */
	@Nullable
	public final Boolean unicodeAware() {
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

		if (this.fuzziness != null) {
			generator.writeKey("fuzziness");
			generator.write(this.fuzziness);

		}
		if (this.minLength != null) {
			generator.writeKey("min_length");
			generator.write(this.minLength);

		}
		if (this.prefixLength != null) {
			generator.writeKey("prefix_length");
			generator.write(this.prefixLength);

		}
		if (this.transpositions != null) {
			generator.writeKey("transpositions");
			generator.write(this.transpositions);

		}
		if (this.unicodeAware != null) {
			generator.writeKey("unicode_aware");
			generator.write(this.unicodeAware);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SuggestFuzziness}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SuggestFuzziness> {
		@Nullable
		private String fuzziness;

		@Nullable
		private Integer minLength;

		@Nullable
		private Integer prefixLength;

		@Nullable
		private Boolean transpositions;

		@Nullable
		private Boolean unicodeAware;

		/**
		 * API name: {@code fuzziness}
		 */
		public final Builder fuzziness(@Nullable String value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * API name: {@code min_length}
		 */
		public final Builder minLength(@Nullable Integer value) {
			this.minLength = value;
			return this;
		}

		/**
		 * API name: {@code prefix_length}
		 */
		public final Builder prefixLength(@Nullable Integer value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * API name: {@code transpositions}
		 */
		public final Builder transpositions(@Nullable Boolean value) {
			this.transpositions = value;
			return this;
		}

		/**
		 * API name: {@code unicode_aware}
		 */
		public final Builder unicodeAware(@Nullable Boolean value) {
			this.unicodeAware = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SuggestFuzziness}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SuggestFuzziness build() {
			_checkSingleUse();

			return new SuggestFuzziness(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SuggestFuzziness}
	 */
	public static final JsonpDeserializer<SuggestFuzziness> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SuggestFuzziness::setupSuggestFuzzinessDeserializer);

	protected static void setupSuggestFuzzinessDeserializer(ObjectDeserializer<SuggestFuzziness.Builder> op) {

		op.add(Builder::fuzziness, JsonpDeserializer.stringDeserializer(), "fuzziness");
		op.add(Builder::minLength, JsonpDeserializer.integerDeserializer(), "min_length");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::transpositions, JsonpDeserializer.booleanDeserializer(), "transpositions");
		op.add(Builder::unicodeAware, JsonpDeserializer.booleanDeserializer(), "unicode_aware");

	}

}
