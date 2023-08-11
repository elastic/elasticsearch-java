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

// typedef: _types.query_dsl.IntervalsMatch

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.IntervalsMatch">API
 *      specification</a>
 */
@JsonpDeserializable
public class IntervalsMatch implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Integer maxGaps;

	@Nullable
	private final Boolean ordered;

	private final String query;

	@Nullable
	private final String useField;

	@Nullable
	private final IntervalsFilter filter;

	// ---------------------------------------------------------------------------------------------

	private IntervalsMatch(Builder builder) {

		this.analyzer = builder.analyzer;
		this.maxGaps = builder.maxGaps;
		this.ordered = builder.ordered;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.useField = builder.useField;
		this.filter = builder.filter;

	}

	public static IntervalsMatch of(Function<Builder, ObjectBuilder<IntervalsMatch>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IntervalsQuery variant kind.
	 */
	@Override
	public IntervalsQuery.Kind _intervalsQueryKind() {
		return IntervalsQuery.Kind.Match;
	}

	/**
	 * Intervals variant kind.
	 */
	@Override
	public Intervals.Kind _intervalsKind() {
		return Intervals.Kind.Match;
	}

	/**
	 * Analyzer used to analyze terms in the query.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Maximum number of positions between the matching terms. Terms further apart
	 * than this are not considered matches.
	 * <p>
	 * API name: {@code max_gaps}
	 */
	@Nullable
	public final Integer maxGaps() {
		return this.maxGaps;
	}

	/**
	 * If <code>true</code>, matching terms must appear in their specified order.
	 * <p>
	 * API name: {@code ordered}
	 */
	@Nullable
	public final Boolean ordered() {
		return this.ordered;
	}

	/**
	 * Required - Text you wish to find in the provided field.
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
		return this.query;
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
	 * An optional interval filter.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final IntervalsFilter filter() {
		return this.filter;
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
		if (this.maxGaps != null) {
			generator.writeKey("max_gaps");
			generator.write(this.maxGaps);

		}
		if (this.ordered != null) {
			generator.writeKey("ordered");
			generator.write(this.ordered);

		}
		generator.writeKey("query");
		generator.write(this.query);

		if (this.useField != null) {
			generator.writeKey("use_field");
			generator.write(this.useField);

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsMatch}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IntervalsMatch> {
		@Nullable
		private String analyzer;

		@Nullable
		private Integer maxGaps;

		@Nullable
		private Boolean ordered;

		private String query;

		@Nullable
		private String useField;

		@Nullable
		private IntervalsFilter filter;

		/**
		 * Analyzer used to analyze terms in the query.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Maximum number of positions between the matching terms. Terms further apart
		 * than this are not considered matches.
		 * <p>
		 * API name: {@code max_gaps}
		 */
		public final Builder maxGaps(@Nullable Integer value) {
			this.maxGaps = value;
			return this;
		}

		/**
		 * If <code>true</code>, matching terms must appear in their specified order.
		 * <p>
		 * API name: {@code ordered}
		 */
		public final Builder ordered(@Nullable Boolean value) {
			this.ordered = value;
			return this;
		}

		/**
		 * Required - Text you wish to find in the provided field.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
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

		/**
		 * An optional interval filter.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable IntervalsFilter value) {
			this.filter = value;
			return this;
		}

		/**
		 * An optional interval filter.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<IntervalsFilter.Builder, ObjectBuilder<IntervalsFilter>> fn) {
			return this.filter(fn.apply(new IntervalsFilter.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IntervalsMatch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsMatch build() {
			_checkSingleUse();

			return new IntervalsMatch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsMatch}
	 */
	public static final JsonpDeserializer<IntervalsMatch> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsMatch::setupIntervalsMatchDeserializer);

	protected static void setupIntervalsMatchDeserializer(ObjectDeserializer<IntervalsMatch.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::maxGaps, JsonpDeserializer.integerDeserializer(), "max_gaps");
		op.add(Builder::ordered, JsonpDeserializer.booleanDeserializer(), "ordered");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");
		op.add(Builder::filter, IntervalsFilter._DESERIALIZER, "filter");

	}

}
