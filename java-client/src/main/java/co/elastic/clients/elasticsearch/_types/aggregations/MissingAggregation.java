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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MissingAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MissingAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class MissingAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final String field;

	@Nullable
	private final FieldValue missing;

	// ---------------------------------------------------------------------------------------------

	private MissingAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.missing = builder.missing;

	}

	public static MissingAggregation of(Function<Builder, ObjectBuilder<MissingAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Missing;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final FieldValue missing() {
		return this.missing;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			this.missing.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MissingAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MissingAggregation> {
		@Nullable
		private String field;

		@Nullable
		private FieldValue missing;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable FieldValue value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.missing(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(String value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(long value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(double value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(boolean value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MissingAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MissingAggregation build() {
			_checkSingleUse();

			return new MissingAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MissingAggregation}
	 */
	public static final JsonpDeserializer<MissingAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MissingAggregation::setupMissingAggregationDeserializer);

	protected static void setupMissingAggregationDeserializer(ObjectDeserializer<MissingAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::missing, FieldValue._DESERIALIZER, "missing");

	}

}
