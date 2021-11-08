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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.elasticsearch._types.ClusterStatistics;
import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import co.elastic.clients.elasticsearch.core.search.Profile;
import co.elastic.clients.elasticsearch.core.search.Suggestion;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.ExternallyTaggedUnion;
import co.elastic.clients.json.JsonData;
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
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: async_search._types.AsyncSearch

public class AsyncSearch<TDocument> implements JsonpSerializable {
	private final Map<String, Aggregate> aggregations;

	@Nullable
	private final ClusterStatistics clusters;

	private final Map<String, JsonData> fields;

	private final HitsMetadata<TDocument> hits;

	@Nullable
	private final Double maxScore;

	@Nullable
	private final Long numReducePhases;

	@Nullable
	private final Profile profile;

	@Nullable
	private final String pitId;

	@Nullable
	private final String scrollId;

	private final ShardStatistics shards;

	private final Map<String, List<Suggestion<TDocument>>> suggest;

	@Nullable
	private final Boolean terminatedEarly;

	private final boolean timedOut;

	private final long took;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private AsyncSearch(Builder<TDocument> builder) {

		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.clusters = builder.clusters;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.hits = ModelTypeHelper.requireNonNull(builder.hits, this, "hits");
		this.maxScore = builder.maxScore;
		this.numReducePhases = builder.numReducePhases;
		this.profile = builder.profile;
		this.pitId = builder.pitId;
		this.scrollId = builder.scrollId;
		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.suggest = ModelTypeHelper.unmodifiable(builder.suggest);
		this.terminatedEarly = builder.terminatedEarly;
		this.timedOut = ModelTypeHelper.requireNonNull(builder.timedOut, this, "timedOut");
		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> AsyncSearch<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<AsyncSearch<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregate> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code _clusters}
	 */
	@Nullable
	public final ClusterStatistics clusters() {
		return this.clusters;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code hits}
	 */
	public final HitsMetadata<TDocument> hits() {
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
	 * API name: {@code num_reduce_phases}
	 */
	@Nullable
	public final Long numReducePhases() {
		return this.numReducePhases;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public final Profile profile() {
		return this.profile;
	}

	/**
	 * API name: {@code pit_id}
	 */
	@Nullable
	public final String pitId() {
		return this.pitId;
	}

	/**
	 * API name: {@code _scroll_id}
	 */
	@Nullable
	public final String scrollId() {
		return this.scrollId;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code suggest}
	 */
	public final Map<String, List<Suggestion<TDocument>>> suggest() {
		return this.suggest;
	}

	/**
	 * API name: {@code terminated_early}
	 */
	@Nullable
	public final Boolean terminatedEarly() {
		return this.terminatedEarly;
	}

	/**
	 * Required - API name: {@code timed_out}
	 */
	public final boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
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

		if (ModelTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			ExternallyTaggedUnion.serializeTypedKeys(this.aggregations, generator, mapper);

		}
		if (this.clusters != null) {
			generator.writeKey("_clusters");
			this.clusters.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("hits");
		this.hits.serialize(generator, mapper);

		if (this.maxScore != null) {
			generator.writeKey("max_score");
			generator.write(this.maxScore);

		}
		if (this.numReducePhases != null) {
			generator.writeKey("num_reduce_phases");
			generator.write(this.numReducePhases);

		}
		if (this.profile != null) {
			generator.writeKey("profile");
			this.profile.serialize(generator, mapper);

		}
		if (this.pitId != null) {
			generator.writeKey("pit_id");
			generator.write(this.pitId);

		}
		if (this.scrollId != null) {
			generator.writeKey("_scroll_id");
			generator.write(this.scrollId);

		}
		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.suggest)) {
			generator.writeKey("suggest");
			generator.writeStartObject();
			for (Map.Entry<String, List<Suggestion<TDocument>>> item0 : this.suggest.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (Suggestion<TDocument> item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.terminatedEarly != null) {
			generator.writeKey("terminated_early");
			generator.write(this.terminatedEarly);

		}
		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("took");
		generator.write(this.took);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AsyncSearch}.
	 */
	public static class Builder<TDocument> extends ObjectBuilderBase implements ObjectBuilder<AsyncSearch<TDocument>> {
		@Nullable
		private Map<String, Aggregate> aggregations;

		@Nullable
		private ClusterStatistics clusters;

		@Nullable
		private Map<String, JsonData> fields;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private Double maxScore;

		@Nullable
		private Long numReducePhases;

		@Nullable
		private Profile profile;

		@Nullable
		private String pitId;

		@Nullable
		private String scrollId;

		private ShardStatistics shards;

		@Nullable
		private Map<String, List<Suggestion<TDocument>>> suggest;

		@Nullable
		private Boolean terminatedEarly;

		private Boolean timedOut;

		private Long took;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

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
		 * API name: {@code _clusters}
		 */
		public final Builder<TDocument> clusters(@Nullable ClusterStatistics value) {
			this.clusters = value;
			return this;
		}

		/**
		 * API name: {@code _clusters}
		 */
		public final Builder<TDocument> clusters(
				Function<ClusterStatistics.Builder, ObjectBuilder<ClusterStatistics>> fn) {
			return this.clusters(fn.apply(new ClusterStatistics.Builder()).build());
		}

		/**
		 * API name: {@code fields}
		 */
		public final Builder<TDocument> fields(@Nullable Map<String, JsonData> value) {
			this.fields = value;
			return this;
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
		 * API name: {@code max_score}
		 */
		public final Builder<TDocument> maxScore(@Nullable Double value) {
			this.maxScore = value;
			return this;
		}

		/**
		 * API name: {@code num_reduce_phases}
		 */
		public final Builder<TDocument> numReducePhases(@Nullable Long value) {
			this.numReducePhases = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public final Builder<TDocument> profile(@Nullable Profile value) {
			this.profile = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public final Builder<TDocument> profile(Function<Profile.Builder, ObjectBuilder<Profile>> fn) {
			return this.profile(fn.apply(new Profile.Builder()).build());
		}

		/**
		 * API name: {@code pit_id}
		 */
		public final Builder<TDocument> pitId(@Nullable String value) {
			this.pitId = value;
			return this;
		}

		/**
		 * API name: {@code _scroll_id}
		 */
		public final Builder<TDocument> scrollId(@Nullable String value) {
			this.scrollId = value;
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
		 * API name: {@code suggest}
		 */
		public final Builder<TDocument> suggest(@Nullable Map<String, List<Suggestion<TDocument>>> value) {
			this.suggest = value;
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
		 * Required - API name: {@code timed_out}
		 */
		public final Builder<TDocument> timedOut(boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * Required - API name: {@code took}
		 */
		public final Builder<TDocument> took(long value) {
			this.took = value;
			return this;
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
		 * Builds a {@link AsyncSearch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AsyncSearch<TDocument> build() {
			_checkSingleUse();

			return new AsyncSearch<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for AsyncSearch
	 */
	public static <TDocument> JsonpDeserializer<AsyncSearch<TDocument>> createAsyncSearchDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> AsyncSearch.setupAsyncSearchDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupAsyncSearchDeserializer(
			DelegatingDeserializer<AsyncSearch.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::aggregations, Aggregate._TYPED_KEYS_DESERIALIZER, "aggregations");
		op.add(Builder::clusters, ClusterStatistics._DESERIALIZER, "_clusters");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::hits, HitsMetadata.createHitsMetadataDeserializer(tDocumentDeserializer), "hits");
		op.add(Builder::maxScore, JsonpDeserializer.doubleDeserializer(), "max_score");
		op.add(Builder::numReducePhases, JsonpDeserializer.longDeserializer(), "num_reduce_phases");
		op.add(Builder::profile, Profile._DESERIALIZER, "profile");
		op.add(Builder::pitId, JsonpDeserializer.stringDeserializer(), "pit_id");
		op.add(Builder::scrollId, JsonpDeserializer.stringDeserializer(), "_scroll_id");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::suggest, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(Suggestion.createSuggestionDeserializer(tDocumentDeserializer))),
				"suggest");
		op.add(Builder::terminatedEarly, JsonpDeserializer.booleanDeserializer(), "terminated_early");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");

	}

}
