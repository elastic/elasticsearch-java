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

package co.elastic.clients.elasticsearch.fleet;

import co.elastic.clients.elasticsearch._types.ClusterStatistics;
import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import co.elastic.clients.elasticsearch.core.search.Profile;
import co.elastic.clients.elasticsearch.core.search.Suggestion;
import co.elastic.clients.json.ExternallyTaggedUnion;
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: fleet.search.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#fleet.search.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class FleetSearchResponse<TDocument> implements JsonpSerializable {
	private final long took;

	private final boolean timedOut;

	private final ShardStatistics shards;

	private final HitsMetadata<TDocument> hits;

	private final Map<String, Aggregate> aggregations;

	@Nullable
	private final ClusterStatistics clusters;

	private final Map<String, JsonData> fields;

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

	private final Map<String, List<Suggestion<TDocument>>> suggest;

	@Nullable
	private final Boolean terminatedEarly;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private FleetSearchResponse(Builder<TDocument> builder) {

		this.took = ApiTypeHelper.requireNonNull(builder.took, this, "took");
		this.timedOut = ApiTypeHelper.requireNonNull(builder.timedOut, this, "timedOut");
		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.hits = ApiTypeHelper.requireNonNull(builder.hits, this, "hits");
		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.clusters = builder.clusters;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.maxScore = builder.maxScore;
		this.numReducePhases = builder.numReducePhases;
		this.profile = builder.profile;
		this.pitId = builder.pitId;
		this.scrollId = builder.scrollId;
		this.suggest = ApiTypeHelper.unmodifiable(builder.suggest);
		this.terminatedEarly = builder.terminatedEarly;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> FleetSearchResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<FleetSearchResponse<TDocument>>> fn) {
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

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("hits");
		this.hits.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			ExternallyTaggedUnion.serializeTypedKeys(this.aggregations, generator, mapper);

		}
		if (this.clusters != null) {
			generator.writeKey("_clusters");
			this.clusters.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
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
		if (ApiTypeHelper.isDefined(this.suggest)) {
			generator.writeKey("suggest");
			ExternallyTaggedUnion.serializeTypedKeysArray(this.suggest, generator, mapper);

		}
		if (this.terminatedEarly != null) {
			generator.writeKey("terminated_early");
			generator.write(this.terminatedEarly);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FleetSearchResponse}.
	 */

	public static class Builder<TDocument> extends WithJsonObjectBuilderBase<Builder<TDocument>>
			implements
				ObjectBuilder<FleetSearchResponse<TDocument>> {
		private Long took;

		private Boolean timedOut;

		private ShardStatistics shards;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private Map<String, Aggregate> aggregations;

		@Nullable
		private ClusterStatistics clusters;

		@Nullable
		private Map<String, JsonData> fields;

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

		@Nullable
		private Map<String, List<Suggestion<TDocument>>> suggest;

		@Nullable
		private Boolean terminatedEarly;

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
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final Builder<TDocument> aggregations(Map<String, Aggregate> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder<TDocument> aggregations(String key, Aggregate value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder<TDocument> aggregations(String key,
				Function<Aggregate.Builder, ObjectBuilder<Aggregate>> fn) {
			return aggregations(key, fn.apply(new Aggregate.Builder()).build());
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
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder<TDocument> fields(Map<String, JsonData> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder<TDocument> fields(String key, JsonData value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
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
		 * API name: {@code suggest}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>suggest</code>.
		 */
		public final Builder<TDocument> suggest(Map<String, List<Suggestion<TDocument>>> map) {
			this.suggest = _mapPutAll(this.suggest, map);
			return this;
		}

		/**
		 * API name: {@code suggest}
		 * <p>
		 * Adds an entry to <code>suggest</code>.
		 */
		public final Builder<TDocument> suggest(String key, List<Suggestion<TDocument>> value) {
			this.suggest = _mapPut(this.suggest, key, value);
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
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link FleetSearchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FleetSearchResponse<TDocument> build() {
			_checkSingleUse();

			return new FleetSearchResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for FleetSearchResponse
	 */
	public static <TDocument> JsonpDeserializer<FleetSearchResponse<TDocument>> createFleetSearchResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> FleetSearchResponse.setupFleetSearchResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link FleetSearchResponse} based on named
	 * deserializers provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<FleetSearchResponse<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createFleetSearchResponseDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:fleet.search.TDocument")));

	protected static <TDocument> void setupFleetSearchResponseDeserializer(
			ObjectDeserializer<FleetSearchResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::hits, HitsMetadata.createHitsMetadataDeserializer(tDocumentDeserializer), "hits");
		op.add(Builder::aggregations, Aggregate._TYPED_KEYS_DESERIALIZER, "aggregations");
		op.add(Builder::clusters, ClusterStatistics._DESERIALIZER, "_clusters");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::maxScore, JsonpDeserializer.doubleDeserializer(), "max_score");
		op.add(Builder::numReducePhases, JsonpDeserializer.longDeserializer(), "num_reduce_phases");
		op.add(Builder::profile, Profile._DESERIALIZER, "profile");
		op.add(Builder::pitId, JsonpDeserializer.stringDeserializer(), "pit_id");
		op.add(Builder::scrollId, JsonpDeserializer.stringDeserializer(), "_scroll_id");
		op.add(Builder::suggest, ExternallyTaggedUnion.<Suggestion<TDocument>>arrayMapDeserializer(
				Suggestion.createSuggestionDeserializer(tDocumentDeserializer)), "suggest");
		op.add(Builder::terminatedEarly, JsonpDeserializer.booleanDeserializer(), "terminated_early");

	}

}
