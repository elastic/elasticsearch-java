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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompositeAggregation extends BucketAggregationBase implements AggregationVariant {
	private final Map<String, FieldValue> after;

	@Nullable
	private final Integer size;

	private final List<Map<String, CompositeAggregationSource>> sources;

	// ---------------------------------------------------------------------------------------------

	private CompositeAggregation(Builder builder) {
		super(builder);

		this.after = ApiTypeHelper.unmodifiable(builder.after);
		this.size = builder.size;
		this.sources = ApiTypeHelper.unmodifiable(builder.sources);

	}

	public static CompositeAggregation of(Function<Builder, ObjectBuilder<CompositeAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Composite;
	}

	/**
	 * When paginating, use the <code>after_key</code> value returned in the
	 * previous response to retrieve the next page.
	 * <p>
	 * API name: {@code after}
	 */
	public final Map<String, FieldValue> after() {
		return this.after;
	}

	/**
	 * The number of composite buckets that should be returned.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * The value sources used to build composite buckets. Keys are returned in the
	 * order of the <code>sources</code> definition.
	 * <p>
	 * API name: {@code sources}
	 */
	public final List<Map<String, CompositeAggregationSource>> sources() {
		return this.sources;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.after)) {
			generator.writeKey("after");
			generator.writeStartObject();
			for (Map.Entry<String, FieldValue> item0 : this.after.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ApiTypeHelper.isDefined(this.sources)) {
			generator.writeKey("sources");
			generator.writeStartArray();
			for (Map<String, CompositeAggregationSource> item0 : this.sources) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, CompositeAggregationSource> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
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
		private Map<String, FieldValue> after;

		@Nullable
		private Integer size;

		@Nullable
		private List<Map<String, CompositeAggregationSource>> sources;

		/**
		 * When paginating, use the <code>after_key</code> value returned in the
		 * previous response to retrieve the next page.
		 * <p>
		 * API name: {@code after}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>after</code>.
		 */
		public final Builder after(Map<String, FieldValue> map) {
			this.after = _mapPutAll(this.after, map);
			return this;
		}

		/**
		 * When paginating, use the <code>after_key</code> value returned in the
		 * previous response to retrieve the next page.
		 * <p>
		 * API name: {@code after}
		 * <p>
		 * Adds an entry to <code>after</code>.
		 */
		public final Builder after(String key, FieldValue value) {
			this.after = _mapPut(this.after, key, value);
			return this;
		}

		/**
		 * When paginating, use the <code>after_key</code> value returned in the
		 * previous response to retrieve the next page.
		 * <p>
		 * API name: {@code after}
		 * <p>
		 * Adds an entry to <code>after</code> using a builder lambda.
		 */
		public final Builder after(String key, Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return after(key, fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * The number of composite buckets that should be returned.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * The value sources used to build composite buckets. Keys are returned in the
		 * order of the <code>sources</code> definition.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sources</code>.
		 */
		public final Builder sources(List<Map<String, CompositeAggregationSource>> list) {
			this.sources = _listAddAll(this.sources, list);
			return this;
		}

		/**
		 * The value sources used to build composite buckets. Keys are returned in the
		 * order of the <code>sources</code> definition.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds one or more values to <code>sources</code>.
		 */
		public final Builder sources(Map<String, CompositeAggregationSource> value,
				Map<String, CompositeAggregationSource>... values) {
			this.sources = _listAdd(this.sources, value, values);
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
			_checkSingleUse();

			return new CompositeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompositeAggregation}
	 */
	public static final JsonpDeserializer<CompositeAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompositeAggregation::setupCompositeAggregationDeserializer);

	protected static void setupCompositeAggregationDeserializer(ObjectDeserializer<CompositeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::after, JsonpDeserializer.stringMapDeserializer(FieldValue._DESERIALIZER), "after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sources, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(CompositeAggregationSource._DESERIALIZER)), "sources");

	}

}
