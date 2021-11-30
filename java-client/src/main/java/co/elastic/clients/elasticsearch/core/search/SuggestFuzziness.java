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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/search/_types/suggester.ts#L106-L112">API
 *      specification</a>
 */
@JsonpDeserializable
public class SuggestFuzziness implements JsonpSerializable {
	private final String fuzziness;

	private final int minLength;

	private final int prefixLength;

	private final boolean transpositions;

	private final boolean unicodeAware;

	// ---------------------------------------------------------------------------------------------

	private SuggestFuzziness(Builder builder) {

		this.fuzziness = ApiTypeHelper.requireNonNull(builder.fuzziness, this, "fuzziness");
		this.minLength = ApiTypeHelper.requireNonNull(builder.minLength, this, "minLength");
		this.prefixLength = ApiTypeHelper.requireNonNull(builder.prefixLength, this, "prefixLength");
		this.transpositions = ApiTypeHelper.requireNonNull(builder.transpositions, this, "transpositions");
		this.unicodeAware = ApiTypeHelper.requireNonNull(builder.unicodeAware, this, "unicodeAware");

	}

	public static SuggestFuzziness of(Function<Builder, ObjectBuilder<SuggestFuzziness>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code fuzziness}
	 */
	public final String fuzziness() {
		return this.fuzziness;
	}

	/**
	 * Required - API name: {@code min_length}
	 */
	public final int minLength() {
		return this.minLength;
	}

	/**
	 * Required - API name: {@code prefix_length}
	 */
	public final int prefixLength() {
		return this.prefixLength;
	}

	/**
	 * Required - API name: {@code transpositions}
	 */
	public final boolean transpositions() {
		return this.transpositions;
	}

	/**
	 * Required - API name: {@code unicode_aware}
	 */
	public final boolean unicodeAware() {
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SuggestFuzziness> {
		private String fuzziness;

		private Integer minLength;

		private Integer prefixLength;

		private Boolean transpositions;

		private Boolean unicodeAware;

		/**
		 * Required - API name: {@code fuzziness}
		 */
		public final Builder fuzziness(String value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * Required - API name: {@code min_length}
		 */
		public final Builder minLength(int value) {
			this.minLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code prefix_length}
		 */
		public final Builder prefixLength(int value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code transpositions}
		 */
		public final Builder transpositions(boolean value) {
			this.transpositions = value;
			return this;
		}

		/**
		 * Required - API name: {@code unicode_aware}
		 */
		public final Builder unicodeAware(boolean value) {
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
