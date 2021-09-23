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

import co.elastic.clients.elasticsearch._core.search.HitsMetadata;
import co.elastic.clients.elasticsearch._core.search.Profile;
import co.elastic.clients.elasticsearch._core.search.Suggestion;
import co.elastic.clients.elasticsearch._types.ClusterStatistics;
import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: async_search._types.AsyncSearch
public final class AsyncSearch<TDocument> implements JsonpSerializable {
	@Nullable
	private final Map<String, JsonValue> aggregations;

	@Nullable
	private final ClusterStatistics clusters;

	@Nullable
	private final Map<String, JsonData> fields;

	private final HitsMetadata<TDocument> hits;

	@Nullable
	private final Number maxScore;

	@Nullable
	private final Number numReducePhases;

	@Nullable
	private final Profile profile;

	@Nullable
	private final String pitId;

	@Nullable
	private final String scrollId;

	private final ShardStatistics shards;

	@Nullable
	private final Map<String, List<Suggestion<TDocument>>> suggest;

	@Nullable
	private final Boolean terminatedEarly;

	private final Boolean timedOut;

	private final Number took;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public AsyncSearch(Builder<TDocument> builder) {

		this.aggregations = builder.aggregations;
		this.clusters = builder.clusters;
		this.fields = builder.fields;
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.maxScore = builder.maxScore;
		this.numReducePhases = builder.numReducePhases;
		this.profile = builder.profile;
		this.pitId = builder.pitId;
		this.scrollId = builder.scrollId;
		this.shards = Objects.requireNonNull(builder.shards, "_shards");
		this.suggest = builder.suggest;
		this.terminatedEarly = builder.terminatedEarly;
		this.timedOut = Objects.requireNonNull(builder.timedOut, "timed_out");
		this.took = Objects.requireNonNull(builder.took, "took");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, JsonValue> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code _clusters}
	 */
	@Nullable
	public ClusterStatistics clusters() {
		return this.clusters;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code hits}
	 */
	public HitsMetadata<TDocument> hits() {
		return this.hits;
	}

	/**
	 * API name: {@code max_score}
	 */
	@Nullable
	public Number maxScore() {
		return this.maxScore;
	}

	/**
	 * API name: {@code num_reduce_phases}
	 */
	@Nullable
	public Number numReducePhases() {
		return this.numReducePhases;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public Profile profile() {
		return this.profile;
	}

	/**
	 * API name: {@code pit_id}
	 */
	@Nullable
	public String pitId() {
		return this.pitId;
	}

	/**
	 * API name: {@code _scroll_id}
	 */
	@Nullable
	public String scrollId() {
		return this.scrollId;
	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public Map<String, List<Suggestion<TDocument>>> suggest() {
		return this.suggest;
	}

	/**
	 * API name: {@code terminated_early}
	 */
	@Nullable
	public Boolean terminatedEarly() {
		return this.terminatedEarly;
	}

	/**
	 * API name: {@code timed_out}
	 */
	public Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code took}
	 */
	public Number took() {
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

		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.clusters != null) {

			generator.writeKey("_clusters");
			this.clusters.serialize(generator, mapper);

		}
		if (this.fields != null) {

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
			generator.write(this.maxScore.doubleValue());

		}
		if (this.numReducePhases != null) {

			generator.writeKey("num_reduce_phases");
			generator.write(this.numReducePhases.doubleValue());

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

		if (this.suggest != null) {

			generator.writeKey("suggest");
			generator.writeStartObject();
			for (Map.Entry<String, List<Suggestion<TDocument>>> item0 : this.suggest.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				for (Suggestion<TDocument> item1 : item0.getValue()) {
					item1.serialize(generator, mapper);

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
		generator.write(this.took.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AsyncSearch}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<AsyncSearch<TDocument>> {
		@Nullable
		private Map<String, JsonValue> aggregations;

		@Nullable
		private ClusterStatistics clusters;

		@Nullable
		private Map<String, JsonData> fields;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private Number maxScore;

		@Nullable
		private Number numReducePhases;

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

		private Number took;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code aggregations}
		 */
		public Builder<TDocument> aggregations(@Nullable Map<String, JsonValue> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putAggregations(String key, JsonValue value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * API name: {@code _clusters}
		 */
		public Builder<TDocument> clusters(@Nullable ClusterStatistics value) {
			this.clusters = value;
			return this;
		}

		/**
		 * API name: {@code _clusters}
		 */
		public Builder<TDocument> clusters(Function<ClusterStatistics.Builder, ObjectBuilder<ClusterStatistics>> fn) {
			return this.clusters(fn.apply(new ClusterStatistics.Builder()).build());
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder<TDocument> fields(@Nullable Map<String, JsonData> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putFields(String key, JsonData value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * API name: {@code hits}
		 */
		public Builder<TDocument> hits(HitsMetadata<TDocument> value) {
			this.hits = value;
			return this;
		}

		/**
		 * API name: {@code hits}
		 */
		public Builder<TDocument> hits(
				Function<HitsMetadata.Builder<TDocument>, ObjectBuilder<HitsMetadata<TDocument>>> fn) {
			return this.hits(fn.apply(new HitsMetadata.Builder<TDocument>()).build());
		}

		/**
		 * API name: {@code max_score}
		 */
		public Builder<TDocument> maxScore(@Nullable Number value) {
			this.maxScore = value;
			return this;
		}

		/**
		 * API name: {@code num_reduce_phases}
		 */
		public Builder<TDocument> numReducePhases(@Nullable Number value) {
			this.numReducePhases = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public Builder<TDocument> profile(@Nullable Profile value) {
			this.profile = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public Builder<TDocument> profile(Function<Profile.Builder, ObjectBuilder<Profile>> fn) {
			return this.profile(fn.apply(new Profile.Builder()).build());
		}

		/**
		 * API name: {@code pit_id}
		 */
		public Builder<TDocument> pitId(@Nullable String value) {
			this.pitId = value;
			return this;
		}

		/**
		 * API name: {@code _scroll_id}
		 */
		public Builder<TDocument> scrollId(@Nullable String value) {
			this.scrollId = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder<TDocument> shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder<TDocument> shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code suggest}
		 */
		public Builder<TDocument> suggest(@Nullable Map<String, List<Suggestion<TDocument>>> value) {
			this.suggest = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #suggest(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putSuggest(String key, List<Suggestion<TDocument>> value) {
			if (this.suggest == null) {
				this.suggest = new HashMap<>();
			}
			this.suggest.put(key, value);
			return this;
		}

		/**
		 * API name: {@code terminated_early}
		 */
		public Builder<TDocument> terminatedEarly(@Nullable Boolean value) {
			this.terminatedEarly = value;
			return this;
		}

		/**
		 * API name: {@code timed_out}
		 */
		public Builder<TDocument> timedOut(Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public Builder<TDocument> took(Number value) {
			this.took = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
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

		op.add(Builder::aggregations,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "aggregations");
		op.add(Builder::clusters, ClusterStatistics.DESERIALIZER, "_clusters");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "fields");
		op.add(Builder::hits, HitsMetadata.createHitsMetadataDeserializer(tDocumentDeserializer), "hits");
		op.add(Builder::maxScore, JsonpDeserializer.numberDeserializer(), "max_score");
		op.add(Builder::numReducePhases, JsonpDeserializer.numberDeserializer(), "num_reduce_phases");
		op.add(Builder::profile, Profile.DESERIALIZER, "profile");
		op.add(Builder::pitId, JsonpDeserializer.stringDeserializer(), "pit_id");
		op.add(Builder::scrollId, JsonpDeserializer.stringDeserializer(), "_scroll_id");
		op.add(Builder::shards, ShardStatistics.DESERIALIZER, "_shards");
		op.add(Builder::suggest, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(Suggestion.createSuggestionDeserializer(tDocumentDeserializer))),
				"suggest");
		op.add(Builder::terminatedEarly, JsonpDeserializer.booleanDeserializer(), "terminated_early");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.numberDeserializer(), "took");

	}

}
