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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RangeBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.RangeBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class RangeBucket extends MultiBucketBase {
	@Nullable
	private final Double from;

	@Nullable
	private final Double to;

	@Nullable
	private final String fromAsString;

	@Nullable
	private final String toAsString;

	@Nullable
	private final String key;

	// ---------------------------------------------------------------------------------------------

	private RangeBucket(Builder builder) {
		super(builder);

		this.from = builder.from;
		this.to = builder.to;
		this.fromAsString = builder.fromAsString;
		this.toAsString = builder.toAsString;
		this.key = builder.key;

	}

	public static RangeBucket of(Function<Builder, ObjectBuilder<RangeBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public final Double from() {
		return this.from;
	}

	/**
	 * API name: {@code to}
	 */
	@Nullable
	public final Double to() {
		return this.to;
	}

	/**
	 * API name: {@code from_as_string}
	 */
	@Nullable
	public final String fromAsString() {
		return this.fromAsString;
	}

	/**
	 * API name: {@code to_as_string}
	 */
	@Nullable
	public final String toAsString() {
		return this.toAsString;
	}

	/**
	 * The bucket key. Present if the aggregation is <em>not</em> keyed
	 * <p>
	 * API name: {@code key}
	 */
	@Nullable
	public final String key() {
		return this.key;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.to != null) {
			generator.writeKey("to");
			generator.write(this.to);

		}
		if (this.fromAsString != null) {
			generator.writeKey("from_as_string");
			generator.write(this.fromAsString);

		}
		if (this.toAsString != null) {
			generator.writeKey("to_as_string");
			generator.write(this.toAsString);

		}
		if (this.key != null) {
			generator.writeKey("key");
			generator.write(this.key);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RangeBucket}.
	 */

	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder> implements ObjectBuilder<RangeBucket> {
		@Nullable
		private Double from;

		@Nullable
		private Double to;

		@Nullable
		private String fromAsString;

		@Nullable
		private String toAsString;

		@Nullable
		private String key;

		/**
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Double value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code to}
		 */
		public final Builder to(@Nullable Double value) {
			this.to = value;
			return this;
		}

		/**
		 * API name: {@code from_as_string}
		 */
		public final Builder fromAsString(@Nullable String value) {
			this.fromAsString = value;
			return this;
		}

		/**
		 * API name: {@code to_as_string}
		 */
		public final Builder toAsString(@Nullable String value) {
			this.toAsString = value;
			return this;
		}

		/**
		 * The bucket key. Present if the aggregation is <em>not</em> keyed
		 * <p>
		 * API name: {@code key}
		 */
		public final Builder key(@Nullable String value) {
			this.key = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RangeBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RangeBucket build() {
			_checkSingleUse();

			return new RangeBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RangeBucket}
	 */
	public static final JsonpDeserializer<RangeBucket> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RangeBucket::setupRangeBucketDeserializer);

	protected static void setupRangeBucketDeserializer(ObjectDeserializer<RangeBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::from, JsonpDeserializer.doubleDeserializer(), "from");
		op.add(Builder::to, JsonpDeserializer.doubleDeserializer(), "to");
		op.add(Builder::fromAsString, JsonpDeserializer.stringDeserializer(), "from_as_string");
		op.add(Builder::toAsString, JsonpDeserializer.stringDeserializer(), "to_as_string");
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");

	}

}
