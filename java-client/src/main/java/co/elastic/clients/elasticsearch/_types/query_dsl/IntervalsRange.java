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

package co.elastic.clients.elasticsearch._types.query_dsl;

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
import java.lang.String;
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

// typedef: _types.query_dsl.IntervalsRange

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.IntervalsRange">API
 *      specification</a>
 */
@JsonpDeserializable
public class IntervalsRange implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	@Nullable
	private final String analyzer;

	@Nullable
	private final String gte;

	@Nullable
	private final String gt;

	@Nullable
	private final String lte;

	@Nullable
	private final String lt;

	@Nullable
	private final String useField;

	// ---------------------------------------------------------------------------------------------

	private IntervalsRange(Builder builder) {

		this.analyzer = builder.analyzer;
		this.gte = builder.gte;
		this.gt = builder.gt;
		this.lte = builder.lte;
		this.lt = builder.lt;
		this.useField = builder.useField;

	}

	public static IntervalsRange of(Function<Builder, ObjectBuilder<IntervalsRange>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IntervalsQuery variant kind.
	 */
	@Override
	public IntervalsQuery.Kind _intervalsQueryKind() {
		return IntervalsQuery.Kind.Range;
	}

	/**
	 * Intervals variant kind.
	 */
	@Override
	public Intervals.Kind _intervalsKind() {
		return Intervals.Kind.Range;
	}

	/**
	 * Analyzer used to analyze the <code>prefix</code>.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Lower term, either gte or gt must be provided.
	 * <p>
	 * API name: {@code gte}
	 */
	@Nullable
	public final String gte() {
		return this.gte;
	}

	/**
	 * Lower term, either gte or gt must be provided.
	 * <p>
	 * API name: {@code gt}
	 */
	@Nullable
	public final String gt() {
		return this.gt;
	}

	/**
	 * Upper term, either lte or lt must be provided.
	 * <p>
	 * API name: {@code lte}
	 */
	@Nullable
	public final String lte() {
		return this.lte;
	}

	/**
	 * Upper term, either lte or lt must be provided.
	 * <p>
	 * API name: {@code lt}
	 */
	@Nullable
	public final String lt() {
		return this.lt;
	}

	/**
	 * If specified, match intervals from this field rather than the top-level
	 * field. The <code>prefix</code> is normalized using the search analyzer from
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
		if (this.gte != null) {
			generator.writeKey("gte");
			generator.write(this.gte);

		}
		if (this.gt != null) {
			generator.writeKey("gt");
			generator.write(this.gt);

		}
		if (this.lte != null) {
			generator.writeKey("lte");
			generator.write(this.lte);

		}
		if (this.lt != null) {
			generator.writeKey("lt");
			generator.write(this.lt);

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
	 * Builder for {@link IntervalsRange}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IntervalsRange> {
		@Nullable
		private String analyzer;

		@Nullable
		private String gte;

		@Nullable
		private String gt;

		@Nullable
		private String lte;

		@Nullable
		private String lt;

		@Nullable
		private String useField;

		public Builder() {
		}
		private Builder(IntervalsRange instance) {
			this.analyzer = instance.analyzer;
			this.gte = instance.gte;
			this.gt = instance.gt;
			this.lte = instance.lte;
			this.lt = instance.lt;
			this.useField = instance.useField;

		}
		/**
		 * Analyzer used to analyze the <code>prefix</code>.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Lower term, either gte or gt must be provided.
		 * <p>
		 * API name: {@code gte}
		 */
		public final Builder gte(@Nullable String value) {
			this.gte = value;
			return this;
		}

		/**
		 * Lower term, either gte or gt must be provided.
		 * <p>
		 * API name: {@code gt}
		 */
		public final Builder gt(@Nullable String value) {
			this.gt = value;
			return this;
		}

		/**
		 * Upper term, either lte or lt must be provided.
		 * <p>
		 * API name: {@code lte}
		 */
		public final Builder lte(@Nullable String value) {
			this.lte = value;
			return this;
		}

		/**
		 * Upper term, either lte or lt must be provided.
		 * <p>
		 * API name: {@code lt}
		 */
		public final Builder lt(@Nullable String value) {
			this.lt = value;
			return this;
		}

		/**
		 * If specified, match intervals from this field rather than the top-level
		 * field. The <code>prefix</code> is normalized using the search analyzer from
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
		 * Builds a {@link IntervalsRange}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsRange build() {
			_checkSingleUse();

			return new IntervalsRange(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsRange}
	 */
	public static final JsonpDeserializer<IntervalsRange> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsRange::setupIntervalsRangeDeserializer);

	protected static void setupIntervalsRangeDeserializer(ObjectDeserializer<IntervalsRange.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::gte, JsonpDeserializer.stringDeserializer(), "gte");
		op.add(Builder::gt, JsonpDeserializer.stringDeserializer(), "gt");
		op.add(Builder::lte, JsonpDeserializer.stringDeserializer(), "lte");
		op.add(Builder::lt, JsonpDeserializer.stringDeserializer(), "lt");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");

	}

}
