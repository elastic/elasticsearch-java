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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeAggregation
@JsonpDeserializable
public final class CompositeAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final Map<String, String> after;

	@Nullable
	private final Integer size;

	@Nullable
	private final List<Map<String, CompositeAggregationSource>> sources;

	// ---------------------------------------------------------------------------------------------

	public CompositeAggregation(Builder builder) {
		super(builder);

		this.after = builder.after;
		this.size = builder.size;
		this.sources = builder.sources;

	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "composite";
	}

	/**
	 * API name: {@code after}
	 */
	@Nullable
	public Map<String, String> after() {
		return this.after;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code sources}
	 */
	@Nullable
	public List<Map<String, CompositeAggregationSource>> sources() {
		return this.sources;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.after != null) {

			generator.writeKey("after");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.after.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.sources != null) {

			generator.writeKey("sources");
			generator.writeStartArray();
			for (Map<String, CompositeAggregationSource> item0 : this.sources) {
				generator.writeStartObject();
				for (Map.Entry<String, CompositeAggregationSource> item1 : item0.entrySet()) {
					generator.writeKey(item1.getKey());
					item1.getValue().serialize(generator, mapper);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompositeAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompositeAggregation> {
		@Nullable
		private Map<String, String> after;

		@Nullable
		private Integer size;

		@Nullable
		private List<Map<String, CompositeAggregationSource>> sources;

		/**
		 * API name: {@code after}
		 */
		public Builder after(@Nullable Map<String, String> value) {
			this.after = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #after(Map)}, creating the map if needed.
		 */
		public Builder putAfter(String key, String value) {
			if (this.after == null) {
				this.after = new HashMap<>();
			}
			this.after.put(key, value);
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sources}
		 */
		public Builder sources(@Nullable List<Map<String, CompositeAggregationSource>> value) {
			this.sources = value;
			return this;
		}

		/**
		 * API name: {@code sources}
		 */
		public Builder sources(Map<String, CompositeAggregationSource>... value) {
			this.sources = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sources(List)}, creating the list if needed.
		 */
		public Builder addSources(Map<String, CompositeAggregationSource> value) {
			if (this.sources == null) {
				this.sources = new ArrayList<>();
			}
			this.sources.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompositeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompositeAggregation build() {

			return new CompositeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompositeAggregation}
	 */
	public static final JsonpDeserializer<CompositeAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompositeAggregation::setupCompositeAggregationDeserializer, Builder::build);

	protected static void setupCompositeAggregationDeserializer(
			DelegatingDeserializer<CompositeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::after, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sources, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(CompositeAggregationSource._DESERIALIZER)), "sources");

	}

}
