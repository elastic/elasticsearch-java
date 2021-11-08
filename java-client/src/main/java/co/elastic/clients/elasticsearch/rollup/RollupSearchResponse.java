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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.ExternallyTaggedUnion;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: rollup.rollup_search.Response

public class RollupSearchResponse<TDocument> implements JsonpSerializable {
	private final long took;

	private final boolean timedOut;

	@Nullable
	private final Boolean terminatedEarly;

	private final ShardStatistics shards;

	private final HitsMetadata<TDocument> hits;

	private final Map<String, Aggregate> aggregations;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private RollupSearchResponse(Builder<TDocument> builder) {

		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.timedOut = ModelTypeHelper.requireNonNull(builder.timedOut, this, "timedOut");
		this.terminatedEarly = builder.terminatedEarly;
		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.hits = ModelTypeHelper.requireNonNull(builder.hits, this, "hits");
		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> RollupSearchResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<RollupSearchResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code timed_out}
	 */
	public final boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code terminated_early}
	 */
	@Nullable
	public final Boolean terminatedEarly() {
		return this.terminatedEarly;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code hits}
	 */
	public final HitsMetadata<TDocument> hits() {
		return this.hits;
	}

	/**
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregate> aggregations() {
		return this.aggregations;
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

		generator.writeKey("took");
		generator.write(this.took);

		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		if (this.terminatedEarly != null) {
			generator.writeKey("terminated_early");
			generator.write(this.terminatedEarly);

		}
		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("hits");
		this.hits.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			ExternallyTaggedUnion.serializeTypedKeys(this.aggregations, generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupSearchResponse}.
	 */
	public static class Builder<TDocument> extends ObjectBuilderBase
			implements
				ObjectBuilder<RollupSearchResponse<TDocument>> {
		private Long took;

		private Boolean timedOut;

		@Nullable
		private Boolean terminatedEarly;

		private ShardStatistics shards;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private Map<String, Aggregate> aggregations;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code took}
		 */
		public final Builder<TDocument> took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - API name: {@code timed_out}
		 */
		public final Builder<TDocument> timedOut(boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code terminated_early}
		 */
		public final Builder<TDocument> terminatedEarly(@Nullable Boolean value) {
			this.terminatedEarly = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder<TDocument> shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder<TDocument> shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public final Builder<TDocument> hits(HitsMetadata<TDocument> value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public final Builder<TDocument> hits(
				Function<HitsMetadata.Builder<TDocument>, ObjectBuilder<HitsMetadata<TDocument>>> fn) {
			return this.hits(fn.apply(new HitsMetadata.Builder<TDocument>()).build());
		}

		/**
		 * API name: {@code aggregations}
		 */
		public final Builder<TDocument> aggregations(@Nullable Map<String, Aggregate> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder<TDocument> aggregations(String key, Function<Aggregate.Builder, ObjectBuilder<Aggregate>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregate.Builder()).build()));
		}

		public final Builder<TDocument> aggregations(
				Function<MapBuilder<String, Aggregate, Aggregate.Builder>, ObjectBuilder<Map<String, Aggregate>>> fn) {
			return aggregations(fn.apply(new MapBuilder<>(Aggregate.Builder::new)).build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link RollupSearchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupSearchResponse<TDocument> build() {
			_checkSingleUse();

			return new RollupSearchResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for RollupSearchResponse
	 */
	public static <TDocument> JsonpDeserializer<RollupSearchResponse<TDocument>> createRollupSearchResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> RollupSearchResponse.setupRollupSearchResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupRollupSearchResponseDeserializer(
			DelegatingDeserializer<RollupSearchResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::terminatedEarly, JsonpDeserializer.booleanDeserializer(), "terminated_early");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::hits, HitsMetadata.createHitsMetadataDeserializer(tDocumentDeserializer), "hits");
		op.add(Builder::aggregations, Aggregate._TYPED_KEYS_DESERIALIZER, "aggregations");

	}

}
