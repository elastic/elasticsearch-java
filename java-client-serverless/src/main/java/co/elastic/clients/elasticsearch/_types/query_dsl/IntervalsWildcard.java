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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsWildcard

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.IntervalsWildcard">API
 *      specification</a>
 */
@JsonpDeserializable
public class IntervalsWildcard implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	@Nullable
	private final String analyzer;

	private final String pattern;

	@Nullable
	private final String useField;

	// ---------------------------------------------------------------------------------------------

	private IntervalsWildcard(Builder builder) {

		this.analyzer = builder.analyzer;
		this.pattern = ApiTypeHelper.requireNonNull(builder.pattern, this, "pattern");
		this.useField = builder.useField;

	}

	public static IntervalsWildcard of(Function<Builder, ObjectBuilder<IntervalsWildcard>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IntervalsQuery variant kind.
	 */
	@Override
	public IntervalsQuery.Kind _intervalsQueryKind() {
		return IntervalsQuery.Kind.Wildcard;
	}

	/**
	 * Intervals variant kind.
	 */
	@Override
	public Intervals.Kind _intervalsKind() {
		return Intervals.Kind.Wildcard;
	}

	/**
	 * Analyzer used to analyze the <code>pattern</code>. Defaults to the top-level
	 * field's analyzer.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Required - Wildcard pattern used to find matching terms.
	 * <p>
	 * API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	/**
	 * If specified, match intervals from this field rather than the top-level
	 * field. The <code>pattern</code> is normalized using the search analyzer from
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
		generator.writeKey("pattern");
		generator.write(this.pattern);

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
	 * Builder for {@link IntervalsWildcard}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IntervalsWildcard> {
		@Nullable
		private String analyzer;

		private String pattern;

		@Nullable
		private String useField;

		/**
		 * Analyzer used to analyze the <code>pattern</code>. Defaults to the top-level
		 * field's analyzer.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Required - Wildcard pattern used to find matching terms.
		 * <p>
		 * API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		/**
		 * If specified, match intervals from this field rather than the top-level
		 * field. The <code>pattern</code> is normalized using the search analyzer from
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
		 * Builds a {@link IntervalsWildcard}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsWildcard build() {
			_checkSingleUse();

			return new IntervalsWildcard(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsWildcard}
	 */
	public static final JsonpDeserializer<IntervalsWildcard> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IntervalsWildcard::setupIntervalsWildcardDeserializer);

	protected static void setupIntervalsWildcardDeserializer(ObjectDeserializer<IntervalsWildcard.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");

	}

}
