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

package co.elastic.clients.elasticsearch._types.query_dsl;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsFuzzy

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.IntervalsFuzzy">API
 *      specification</a>
 */
@JsonpDeserializable
public class IntervalsFuzzy implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	@Nullable
	private final String analyzer;

	@Nullable
	private final String fuzziness;

	@Nullable
	private final Integer prefixLength;

	private final String term;

	@Nullable
	private final Boolean transpositions;

	@Nullable
	private final String useField;

	// ---------------------------------------------------------------------------------------------

	private IntervalsFuzzy(Builder builder) {

		this.analyzer = builder.analyzer;
		this.fuzziness = builder.fuzziness;
		this.prefixLength = builder.prefixLength;
		this.term = ApiTypeHelper.requireNonNull(builder.term, this, "term");
		this.transpositions = builder.transpositions;
		this.useField = builder.useField;

	}

	public static IntervalsFuzzy of(Function<Builder, ObjectBuilder<IntervalsFuzzy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IntervalsQuery variant kind.
	 */
	@Override
	public IntervalsQuery.Kind _intervalsQueryKind() {
		return IntervalsQuery.Kind.Fuzzy;
	}

	/**
	 * Intervals variant kind.
	 */
	@Override
	public Intervals.Kind _intervalsKind() {
		return Intervals.Kind.Fuzzy;
	}

	/**
	 * Analyzer used to normalize the term.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Maximum edit distance allowed for matching.
	 * <p>
	 * API name: {@code fuzziness}
	 */
	@Nullable
	public final String fuzziness() {
		return this.fuzziness;
	}

	/**
	 * Number of beginning characters left unchanged when creating expansions.
	 * <p>
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public final Integer prefixLength() {
		return this.prefixLength;
	}

	/**
	 * Required - The term to match.
	 * <p>
	 * API name: {@code term}
	 */
	public final String term() {
		return this.term;
	}

	/**
	 * Indicates whether edits include transpositions of two adjacent characters
	 * (for example, <code>ab</code> to <code>ba</code>).
	 * <p>
	 * API name: {@code transpositions}
	 */
	@Nullable
	public final Boolean transpositions() {
		return this.transpositions;
	}

	/**
	 * If specified, match intervals from this field rather than the top-level
	 * field. The <code>term</code> is normalized using the search analyzer from
	 * this field, unless <code>analyzer</code> is specified separately.
	 * <p>
	 * API name: {@code use_field}
	 */
	@Nullable
	public final String useField() {
		return this.useField;
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

		if (this.analyzer != null) {
			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.fuzziness != null) {
			generator.writeKey("fuzziness");
			generator.write(this.fuzziness);

		}
		if (this.prefixLength != null) {
			generator.writeKey("prefix_length");
			generator.write(this.prefixLength);

		}
		generator.writeKey("term");
		generator.write(this.term);

		if (this.transpositions != null) {
			generator.writeKey("transpositions");
			generator.write(this.transpositions);

		}
		if (this.useField != null) {
			generator.writeKey("use_field");
			generator.write(this.useField);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsFuzzy}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IntervalsFuzzy> {
		@Nullable
		private String analyzer;

		@Nullable
		private String fuzziness;

		@Nullable
		private Integer prefixLength;

		private String term;

		@Nullable
		private Boolean transpositions;

		@Nullable
		private String useField;

		/**
		 * Analyzer used to normalize the term.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Maximum edit distance allowed for matching.
		 * <p>
		 * API name: {@code fuzziness}
		 */
		public final Builder fuzziness(@Nullable String value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * Number of beginning characters left unchanged when creating expansions.
		 * <p>
		 * API name: {@code prefix_length}
		 */
		public final Builder prefixLength(@Nullable Integer value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * Required - The term to match.
		 * <p>
		 * API name: {@code term}
		 */
		public final Builder term(String value) {
			this.term = value;
			return this;
		}

		/**
		 * Indicates whether edits include transpositions of two adjacent characters
		 * (for example, <code>ab</code> to <code>ba</code>).
		 * <p>
		 * API name: {@code transpositions}
		 */
		public final Builder transpositions(@Nullable Boolean value) {
			this.transpositions = value;
			return this;
		}

		/**
		 * If specified, match intervals from this field rather than the top-level
		 * field. The <code>term</code> is normalized using the search analyzer from
		 * this field, unless <code>analyzer</code> is specified separately.
		 * <p>
		 * API name: {@code use_field}
		 */
		public final Builder useField(@Nullable String value) {
			this.useField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IntervalsFuzzy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsFuzzy build() {
			_checkSingleUse();

			return new IntervalsFuzzy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsFuzzy}
	 */
	public static final JsonpDeserializer<IntervalsFuzzy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsFuzzy::setupIntervalsFuzzyDeserializer);

	protected static void setupIntervalsFuzzyDeserializer(ObjectDeserializer<IntervalsFuzzy.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::fuzziness, JsonpDeserializer.stringDeserializer(), "fuzziness");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::term, JsonpDeserializer.stringDeserializer(), "term");
		op.add(Builder::transpositions, JsonpDeserializer.booleanDeserializer(), "transpositions");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");

	}

}
