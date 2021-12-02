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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_global/search/_types/hits.ts#L66-L71">API
 *      specification</a>
 */

public class HitsMetadata<T> implements JsonpSerializable {
	private final TotalHits total;

	private final List<Hit<T>> hits;

	@Nullable
	private final Double maxScore;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	private HitsMetadata(Builder<T> builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");
		this.hits = ApiTypeHelper.unmodifiableRequired(builder.hits, this, "hits");
		this.maxScore = builder.maxScore;
		this.tSerializer = builder.tSerializer;

	}

	public static <T> HitsMetadata<T> of(Function<Builder<T>, ObjectBuilder<HitsMetadata<T>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
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

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

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
			generator.write(this.maxScore);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HitsMetadata}.
	 */

	public static class Builder<T> extends ObjectBuilderBase implements ObjectBuilder<HitsMetadata<T>> {
		private TotalHits total;

		private List<Hit<T>> hits;

		@Nullable
		private Double maxScore;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder<T> total(TotalHits value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
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

	protected static <T> void setupHitsMetadataDeserializer(ObjectDeserializer<HitsMetadata.Builder<T>> op,
			JsonpDeserializer<T> tDeserializer) {

		op.add(Builder::total, TotalHits._DESERIALIZER, "total");
		op.add(Builder::hits, JsonpDeserializer.arrayDeserializer(Hit.createHitDeserializer(tDeserializer)), "hits");
		op.add(Builder::maxScore, JsonpDeserializer.doubleDeserializer(), "max_score");

	}

}
