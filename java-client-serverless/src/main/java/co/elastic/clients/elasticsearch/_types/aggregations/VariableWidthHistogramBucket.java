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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.VariableWidthHistogramBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.VariableWidthHistogramBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class VariableWidthHistogramBucket extends MultiBucketBase {
	private final double min;

	private final double key;

	private final double max;

	@Nullable
	private final String minAsString;

	@Nullable
	private final String keyAsString;

	@Nullable
	private final String maxAsString;

	// ---------------------------------------------------------------------------------------------

	private VariableWidthHistogramBucket(Builder builder) {
		super(builder);

		this.min = ApiTypeHelper.requireNonNull(builder.min, this, "min");
		this.key = ApiTypeHelper.requireNonNull(builder.key, this, "key");
		this.max = ApiTypeHelper.requireNonNull(builder.max, this, "max");
		this.minAsString = builder.minAsString;
		this.keyAsString = builder.keyAsString;
		this.maxAsString = builder.maxAsString;

	}

	public static VariableWidthHistogramBucket of(Function<Builder, ObjectBuilder<VariableWidthHistogramBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code min}
	 */
	public final double min() {
		return this.min;
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final double key() {
		return this.key;
	}

	/**
	 * Required - API name: {@code max}
	 */
	public final double max() {
		return this.max;
	}

	/**
	 * API name: {@code min_as_string}
	 */
	@Nullable
	public final String minAsString() {
		return this.minAsString;
	}

	/**
	 * API name: {@code key_as_string}
	 */
	@Nullable
	public final String keyAsString() {
		return this.keyAsString;
	}

	/**
	 * API name: {@code max_as_string}
	 */
	@Nullable
	public final String maxAsString() {
		return this.maxAsString;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("min");
		generator.write(this.min);

		generator.writeKey("key");
		generator.write(this.key);

		generator.writeKey("max");
		generator.write(this.max);

		if (this.minAsString != null) {
			generator.writeKey("min_as_string");
			generator.write(this.minAsString);

		}
		if (this.keyAsString != null) {
			generator.writeKey("key_as_string");
			generator.write(this.keyAsString);

		}
		if (this.maxAsString != null) {
			generator.writeKey("max_as_string");
			generator.write(this.maxAsString);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VariableWidthHistogramBucket}.
	 */

	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<VariableWidthHistogramBucket> {
		private Double min;

		private Double key;

		private Double max;

		@Nullable
		private String minAsString;

		@Nullable
		private String keyAsString;

		@Nullable
		private String maxAsString;

		/**
		 * Required - API name: {@code min}
		 */
		public final Builder min(double value) {
			this.min = value;
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(double value) {
			this.key = value;
			return this;
		}

		/**
		 * Required - API name: {@code max}
		 */
		public final Builder max(double value) {
			this.max = value;
			return this;
		}

		/**
		 * API name: {@code min_as_string}
		 */
		public final Builder minAsString(@Nullable String value) {
			this.minAsString = value;
			return this;
		}

		/**
		 * API name: {@code key_as_string}
		 */
		public final Builder keyAsString(@Nullable String value) {
			this.keyAsString = value;
			return this;
		}

		/**
		 * API name: {@code max_as_string}
		 */
		public final Builder maxAsString(@Nullable String value) {
			this.maxAsString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link VariableWidthHistogramBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VariableWidthHistogramBucket build() {
			_checkSingleUse();

			return new VariableWidthHistogramBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VariableWidthHistogramBucket}
	 */
	public static final JsonpDeserializer<VariableWidthHistogramBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, VariableWidthHistogramBucket::setupVariableWidthHistogramBucketDeserializer);

	protected static void setupVariableWidthHistogramBucketDeserializer(
			ObjectDeserializer<VariableWidthHistogramBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::min, JsonpDeserializer.doubleDeserializer(), "min");
		op.add(Builder::key, JsonpDeserializer.doubleDeserializer(), "key");
		op.add(Builder::max, JsonpDeserializer.doubleDeserializer(), "max");
		op.add(Builder::minAsString, JsonpDeserializer.stringDeserializer(), "min_as_string");
		op.add(Builder::keyAsString, JsonpDeserializer.stringDeserializer(), "key_as_string");
		op.add(Builder::maxAsString, JsonpDeserializer.stringDeserializer(), "max_as_string");

	}

}
