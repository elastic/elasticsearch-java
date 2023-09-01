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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.AggregationProfile

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.AggregationProfile">API
 *      specification</a>
 */
@JsonpDeserializable
public class AggregationProfile implements JsonpSerializable {
	private final AggregationBreakdown breakdown;

	private final String description;

	private final long timeInNanos;

	private final String type;

	@Nullable
	private final AggregationProfileDebug debug;

	private final List<AggregationProfile> children;

	// ---------------------------------------------------------------------------------------------

	private AggregationProfile(Builder builder) {

		this.breakdown = ApiTypeHelper.requireNonNull(builder.breakdown, this, "breakdown");
		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.timeInNanos = ApiTypeHelper.requireNonNull(builder.timeInNanos, this, "timeInNanos");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.debug = builder.debug;
		this.children = ApiTypeHelper.unmodifiable(builder.children);

	}

	public static AggregationProfile of(Function<Builder, ObjectBuilder<AggregationProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code breakdown}
	 */
	public final AggregationBreakdown breakdown() {
		return this.breakdown;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code time_in_nanos}
	 */
	public final long timeInNanos() {
		return this.timeInNanos;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code debug}
	 */
	@Nullable
	public final AggregationProfileDebug debug() {
		return this.debug;
	}

	/**
	 * API name: {@code children}
	 */
	public final List<AggregationProfile> children() {
		return this.children;
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

		generator.writeKey("breakdown");
		this.breakdown.serialize(generator, mapper);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("time_in_nanos");
		generator.write(this.timeInNanos);

		generator.writeKey("type");
		generator.write(this.type);

		if (this.debug != null) {
			generator.writeKey("debug");
			this.debug.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.children)) {
			generator.writeKey("children");
			generator.writeStartArray();
			for (AggregationProfile item0 : this.children) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationProfile}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AggregationProfile> {
		private AggregationBreakdown breakdown;

		private String description;

		private Long timeInNanos;

		private String type;

		@Nullable
		private AggregationProfileDebug debug;

		@Nullable
		private List<AggregationProfile> children;

		/**
		 * Required - API name: {@code breakdown}
		 */
		public final Builder breakdown(AggregationBreakdown value) {
			this.breakdown = value;
			return this;
		}

		/**
		 * Required - API name: {@code breakdown}
		 */
		public final Builder breakdown(Function<AggregationBreakdown.Builder, ObjectBuilder<AggregationBreakdown>> fn) {
			return this.breakdown(fn.apply(new AggregationBreakdown.Builder()).build());
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_in_nanos}
		 */
		public final Builder timeInNanos(long value) {
			this.timeInNanos = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code debug}
		 */
		public final Builder debug(@Nullable AggregationProfileDebug value) {
			this.debug = value;
			return this;
		}

		/**
		 * API name: {@code debug}
		 */
		public final Builder debug(
				Function<AggregationProfileDebug.Builder, ObjectBuilder<AggregationProfileDebug>> fn) {
			return this.debug(fn.apply(new AggregationProfileDebug.Builder()).build());
		}

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>children</code>.
		 */
		public final Builder children(List<AggregationProfile> list) {
			this.children = _listAddAll(this.children, list);
			return this;
		}

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds one or more values to <code>children</code>.
		 */
		public final Builder children(AggregationProfile value, AggregationProfile... values) {
			this.children = _listAdd(this.children, value, values);
			return this;
		}

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds a value to <code>children</code> using a builder lambda.
		 */
		public final Builder children(Function<AggregationProfile.Builder, ObjectBuilder<AggregationProfile>> fn) {
			return children(fn.apply(new AggregationProfile.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AggregationProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationProfile build() {
			_checkSingleUse();

			return new AggregationProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregationProfile}
	 */
	public static final JsonpDeserializer<AggregationProfile> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AggregationProfile::setupAggregationProfileDeserializer);

	protected static void setupAggregationProfileDeserializer(ObjectDeserializer<AggregationProfile.Builder> op) {

		op.add(Builder::breakdown, AggregationBreakdown._DESERIALIZER, "breakdown");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::timeInNanos, JsonpDeserializer.longDeserializer(), "time_in_nanos");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::debug, AggregationProfileDebug._DESERIALIZER, "debug");
		op.add(Builder::children, JsonpDeserializer.arrayDeserializer(AggregationProfile._DESERIALIZER), "children");

	}

}
