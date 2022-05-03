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
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search._types.HitsMetadata

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.HitsMetadata">API
 *      specification</a>
 */
@JsonpDeserializable
public class HitsMetadata<T> implements JsonpSerializable {
	@Nullable
	private final TotalHits total;

	private final List<Hit<T>> hits;

	@Nullable
	private final Double maxScore;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	private HitsMetadata(Builder<T> builder) {

		this.total = builder.total;
		this.hits = ApiTypeHelper.unmodifiableRequired(builder.hits, this, "hits");
		this.maxScore = builder.maxScore;
		this.tSerializer = builder.tSerializer;

	}

	public static <T> HitsMetadata<T> of(Function<Builder<T>, ObjectBuilder<HitsMetadata<T>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Total hit count information, present only if <code>track_total_hits</code>
	 * wasn't <code>false</code> in the search request.
	 * <p>
	 * API name: {@code total}
	 */
	@Nullable
	public final TotalHits total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code hits}
	 */
	public final List<Hit<T>> hits() {
		return this.hits;
	}

	/**
	 * API name: {@code max_score}
	 * <p>
	 * Defaults to {@code Double.NaN} if parsed from a JSON {@code null} value.
	 */
	@Nullable
	public final Double maxScore() {
		return this.maxScore;
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

		if (this.total != null) {
			generator.writeKey("total");
			this.total.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.hits)) {
			generator.writeKey("hits");
			generator.writeStartArray();
			for (Hit<T> item0 : this.hits) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxScore != null) {
			generator.writeKey("max_score");
			JsonpUtils.serializeDoubleOrNull(generator, this.maxScore, Double.NaN);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HitsMetadata}.
	 */

	public static class Builder<T> extends WithJsonObjectBuilderBase<Builder<T>>
			implements
				ObjectBuilder<HitsMetadata<T>> {
		@Nullable
		private TotalHits total;

		private List<Hit<T>> hits;

		@Nullable
		private Double maxScore;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * Total hit count information, present only if <code>track_total_hits</code>
		 * wasn't <code>false</code> in the search request.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder<T> total(@Nullable TotalHits value) {
			this.total = value;
			return this;
		}

		/**
		 * Total hit count information, present only if <code>track_total_hits</code>
		 * wasn't <code>false</code> in the search request.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder<T> total(Function<TotalHits.Builder, ObjectBuilder<TotalHits>> fn) {
			return this.total(fn.apply(new TotalHits.Builder()).build());
		}

		/**
		 * Required - API name: {@code hits}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>hits</code>.
		 */
		public final Builder<T> hits(List<Hit<T>> list) {
			this.hits = _listAddAll(this.hits, list);
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 * <p>
		 * Adds one or more values to <code>hits</code>.
		 */
		public final Builder<T> hits(Hit<T> value, Hit<T>... values) {
			this.hits = _listAdd(this.hits, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 * <p>
		 * Adds a value to <code>hits</code> using a builder lambda.
		 */
		public final Builder<T> hits(Function<Hit.Builder<T>, ObjectBuilder<Hit<T>>> fn) {
			return hits(fn.apply(new Hit.Builder<T>()).build());
		}

		/**
		 * API name: {@code max_score}
		 * <p>
		 * Defaults to {@code Double.NaN} if parsed from a JSON {@code null} value.
		 */
		public final Builder<T> maxScore(@Nullable Double value) {
			this.maxScore = value;
			return this;
		}

		/**
		 * Serializer for T. If not set, an attempt will be made to find a serializer
		 * from the JSON context.
		 */
		public final Builder<T> tSerializer(@Nullable JsonpSerializer<T> value) {
			this.tSerializer = value;
			return this;
		}

		@Override
		protected Builder<T> self() {
			return this;
		}

		/**
		 * Builds a {@link HitsMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HitsMetadata<T> build() {
			_checkSingleUse();

			return new HitsMetadata<T>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for HitsMetadata
	 */
	public static <T> JsonpDeserializer<HitsMetadata<T>> createHitsMetadataDeserializer(
			JsonpDeserializer<T> tDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<T>>) Builder::new,
				op -> HitsMetadata.setupHitsMetadataDeserializer(op, tDeserializer));
	};

	/**
	 * Json deserializer for {@link HitsMetadata} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<HitsMetadata<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createHitsMetadataDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.search._types.T")));

	protected static <T> void setupHitsMetadataDeserializer(ObjectDeserializer<HitsMetadata.Builder<T>> op,
			JsonpDeserializer<T> tDeserializer) {

		op.add(Builder::total, TotalHits._DESERIALIZER, "total");
		op.add(Builder::hits, JsonpDeserializer.arrayDeserializer(Hit.createHitDeserializer(tDeserializer)), "hits");
		op.add(Builder::maxScore, JsonpDeserializer.doubleOrNullDeserializer(Double.NaN), "max_score");

	}

}
