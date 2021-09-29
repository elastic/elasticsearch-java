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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.AggregationProfile
@JsonpDeserializable
public final class AggregationProfile implements JsonpSerializable {
	private final AggregationBreakdown breakdown;

	private final String description;

	private final long timeInNanos;

	private final String type;

	@Nullable
	private final AggregationProfileDebug debug;

	@Nullable
	private final List<AggregationProfileDebug> children;

	// ---------------------------------------------------------------------------------------------

	public AggregationProfile(Builder builder) {

		this.breakdown = Objects.requireNonNull(builder.breakdown, "breakdown");
		this.description = Objects.requireNonNull(builder.description, "description");
		this.timeInNanos = Objects.requireNonNull(builder.timeInNanos, "time_in_nanos");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.debug = builder.debug;
		this.children = ModelTypeHelper.unmodifiable(builder.children);

	}

	public AggregationProfile(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code breakdown}
	 */
	public AggregationBreakdown breakdown() {
		return this.breakdown;
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code time_in_nanos}
	 */
	public long timeInNanos() {
		return this.timeInNanos;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code debug}
	 */
	@Nullable
	public AggregationProfileDebug debug() {
		return this.debug;
	}

	/**
	 * API name: {@code children}
	 */
	@Nullable
	public List<AggregationProfileDebug> children() {
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
		if (this.children != null) {

			generator.writeKey("children");
			generator.writeStartArray();
			for (AggregationProfileDebug item0 : this.children) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationProfile}.
	 */
	public static class Builder implements ObjectBuilder<AggregationProfile> {
		private AggregationBreakdown breakdown;

		private String description;

		private Long timeInNanos;

		private String type;

		@Nullable
		private AggregationProfileDebug debug;

		@Nullable
		private List<AggregationProfileDebug> children;

		/**
		 * API name: {@code breakdown}
		 */
		public Builder breakdown(AggregationBreakdown value) {
			this.breakdown = value;
			return this;
		}

		/**
		 * API name: {@code breakdown}
		 */
		public Builder breakdown(Function<AggregationBreakdown.Builder, ObjectBuilder<AggregationBreakdown>> fn) {
			return this.breakdown(fn.apply(new AggregationBreakdown.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code time_in_nanos}
		 */
		public Builder timeInNanos(long value) {
			this.timeInNanos = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code debug}
		 */
		public Builder debug(@Nullable AggregationProfileDebug value) {
			this.debug = value;
			return this;
		}

		/**
		 * API name: {@code debug}
		 */
		public Builder debug(Function<AggregationProfileDebug.Builder, ObjectBuilder<AggregationProfileDebug>> fn) {
			return this.debug(fn.apply(new AggregationProfileDebug.Builder()).build());
		}

		/**
		 * API name: {@code children}
		 */
		public Builder children(@Nullable List<AggregationProfileDebug> value) {
			this.children = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public Builder children(AggregationProfileDebug... value) {
			this.children = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #children(List)}, creating the list if needed. 4
		 */
		public Builder addChildren(AggregationProfileDebug value) {
			if (this.children == null) {
				this.children = new ArrayList<>();
			}
			this.children.add(value);
			return this;
		}

		/**
		 * Set {@link #children(List)} to a singleton list.
		 */
		public Builder children(Function<AggregationProfileDebug.Builder, ObjectBuilder<AggregationProfileDebug>> fn) {
			return this.children(fn.apply(new AggregationProfileDebug.Builder()).build());
		}

		/**
		 * Add a value to {@link #children(List)}, creating the list if needed. 5
		 */
		public Builder addChildren(
				Function<AggregationProfileDebug.Builder, ObjectBuilder<AggregationProfileDebug>> fn) {
			return this.addChildren(fn.apply(new AggregationProfileDebug.Builder()).build());
		}

		/**
		 * Builds a {@link AggregationProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationProfile build() {

			return new AggregationProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregationProfile}
	 */
	public static final JsonpDeserializer<AggregationProfile> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AggregationProfile::setupAggregationProfileDeserializer, Builder::build);

	protected static void setupAggregationProfileDeserializer(DelegatingDeserializer<AggregationProfile.Builder> op) {

		op.add(Builder::breakdown, AggregationBreakdown._DESERIALIZER, "breakdown");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::timeInNanos, JsonpDeserializer.longDeserializer(), "time_in_nanos");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::debug, AggregationProfileDebug._DESERIALIZER, "debug");
		op.add(Builder::children, JsonpDeserializer.arrayDeserializer(AggregationProfileDebug._DESERIALIZER),
				"children");

	}

}
