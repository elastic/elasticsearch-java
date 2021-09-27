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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.elasticsearch._core.search.HitsMetadata;
import co.elastic.clients.elasticsearch._core.search.Profile;
import co.elastic.clients.elasticsearch._core.search.Suggestion;
import co.elastic.clients.elasticsearch._types.ClusterStatistics;
import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search.Response

public class SearchResponse<TDocument> implements JsonpSerializable {
	private final long took;

	private final boolean timedOut;

	private final ShardStatistics shards;

	private final HitsMetadata<TDocument> hits;

	@Nullable
	private final Map<String, JsonValue /* _types.aggregations.Aggregate */> aggregations;

	@Nullable
	private final ClusterStatistics clusters;

	@Nullable
	private final List<TDocument> documents;

	@Nullable
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

	@Nullable
	private final Map<String, List<Suggestion<TDocument>>> suggest;

	@Nullable
	private final Boolean terminatedEarly;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public SearchResponse(AbstractBuilder<TDocument, ?> builder) {

		this.took = Objects.requireNonNull(builder.took, "took");
		this.timedOut = Objects.requireNonNull(builder.timedOut, "timed_out");
		this.shards = Objects.requireNonNull(builder.shards, "_shards");
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.aggregations = builder.aggregations;
		this.clusters = builder.clusters;
		this.documents = builder.documents;
		this.fields = builder.fields;
		this.maxScore = builder.maxScore;
		this.numReducePhases = builder.numReducePhases;
		this.profile = builder.profile;
		this.pitId = builder.pitId;
		this.scrollId = builder.scrollId;
		this.suggest = builder.suggest;
		this.terminatedEarly = builder.terminatedEarly;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code took}
	 */
	public long took() {
		return this.took;
	}

	/**
	 * API name: {@code timed_out}
	 */
	public boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code hits}
	 */
	public HitsMetadata<TDocument> hits() {
		return this.hits;
	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, JsonValue /* _types.aggregations.Aggregate */> aggregations() {
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
	 * API name: {@code documents}
	 */
	@Nullable
	public List<TDocument> documents() {
		return this.documents;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code max_score}
	 */
	@Nullable
	public Double maxScore() {
		return this.maxScore;
	}

	/**
	 * API name: {@code num_reduce_phases}
	 */
	@Nullable
	public Long numReducePhases() {
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

		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue /* _types.aggregations.Aggregate */> item0 : this.aggregations
					.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.clusters != null) {

			generator.writeKey("_clusters");
			this.clusters.serialize(generator, mapper);

		}
		if (this.documents != null) {

			generator.writeKey("documents");
			generator.writeStartArray();
			for (TDocument item0 : this.documents) {
				JsonpUtils.serialize(item0, generator, tDocumentSerializer, mapper);

			}
			generator.writeEnd();

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchResponse}.
	 */
	public static class Builder<TDocument> extends SearchResponse.AbstractBuilder<TDocument, Builder<TDocument>>
			implements
				ObjectBuilder<SearchResponse<TDocument>> {
		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link SearchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchResponse<TDocument> build() {

			return new SearchResponse<TDocument>(this);
		}
	}

	protected abstract static class AbstractBuilder<TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>> {
		private Long took;

		private Boolean timedOut;

		private ShardStatistics shards;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private Map<String, JsonValue /* _types.aggregations.Aggregate */> aggregations;

		@Nullable
		private ClusterStatistics clusters;

		@Nullable
		private List<TDocument> documents;

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
		 * API name: {@code took}
		 */
		public BuilderT took(long value) {
			this.took = value;
			return self();
		}

		/**
		 * API name: {@code timed_out}
		 */
		public BuilderT timedOut(boolean value) {
			this.timedOut = value;
			return self();
		}

		/**
		 * API name: {@code _shards}
		 */
		public BuilderT shards(ShardStatistics value) {
			this.shards = value;
			return self();
		}

		/**
		 * API name: {@code _shards}
		 */
		public BuilderT shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code hits}
		 */
		public BuilderT hits(HitsMetadata<TDocument> value) {
			this.hits = value;
			return self();
		}

		/**
		 * API name: {@code hits}
		 */
		public BuilderT hits(Function<HitsMetadata.Builder<TDocument>, ObjectBuilder<HitsMetadata<TDocument>>> fn) {
			return this.hits(fn.apply(new HitsMetadata.Builder<TDocument>()).build());
		}

		/**
		 * API name: {@code aggregations}
		 */
		public BuilderT aggregations(@Nullable Map<String, JsonValue /* _types.aggregations.Aggregate */> value) {
			this.aggregations = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public BuilderT putAggregations(String key, JsonValue /* _types.aggregations.Aggregate */ value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return self();
		}

		/**
		 * API name: {@code _clusters}
		 */
		public BuilderT clusters(@Nullable ClusterStatistics value) {
			this.clusters = value;
			return self();
		}

		/**
		 * API name: {@code _clusters}
		 */
		public BuilderT clusters(Function<ClusterStatistics.Builder, ObjectBuilder<ClusterStatistics>> fn) {
			return this.clusters(fn.apply(new ClusterStatistics.Builder()).build());
		}

		/**
		 * API name: {@code documents}
		 */
		public BuilderT documents(@Nullable List<TDocument> value) {
			this.documents = value;
			return self();
		}

		/**
		 * API name: {@code documents}
		 */
		public BuilderT documents(TDocument... value) {
			this.documents = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #documents(List)}, creating the list if needed.
		 */
		public BuilderT addDocuments(TDocument value) {
			if (this.documents == null) {
				this.documents = new ArrayList<>();
			}
			this.documents.add(value);
			return self();
		}

		/**
		 * API name: {@code fields}
		 */
		public BuilderT fields(@Nullable Map<String, JsonData> value) {
			this.fields = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public BuilderT putFields(String key, JsonData value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return self();
		}

		/**
		 * API name: {@code max_score}
		 */
		public BuilderT maxScore(@Nullable Double value) {
			this.maxScore = value;
			return self();
		}

		/**
		 * API name: {@code num_reduce_phases}
		 */
		public BuilderT numReducePhases(@Nullable Long value) {
			this.numReducePhases = value;
			return self();
		}

		/**
		 * API name: {@code profile}
		 */
		public BuilderT profile(@Nullable Profile value) {
			this.profile = value;
			return self();
		}

		/**
		 * API name: {@code profile}
		 */
		public BuilderT profile(Function<Profile.Builder, ObjectBuilder<Profile>> fn) {
			return this.profile(fn.apply(new Profile.Builder()).build());
		}

		/**
		 * API name: {@code pit_id}
		 */
		public BuilderT pitId(@Nullable String value) {
			this.pitId = value;
			return self();
		}

		/**
		 * API name: {@code _scroll_id}
		 */
		public BuilderT scrollId(@Nullable String value) {
			this.scrollId = value;
			return self();
		}

		/**
		 * API name: {@code suggest}
		 */
		public BuilderT suggest(@Nullable Map<String, List<Suggestion<TDocument>>> value) {
			this.suggest = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #suggest(Map)}, creating the map if needed.
		 */
		public BuilderT putSuggest(String key, List<Suggestion<TDocument>> value) {
			if (this.suggest == null) {
				this.suggest = new HashMap<>();
			}
			this.suggest.put(key, value);
			return self();
		}

		/**
		 * API name: {@code terminated_early}
		 */
		public BuilderT terminatedEarly(@Nullable Boolean value) {
			this.terminatedEarly = value;
			return self();
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public BuilderT tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for SearchResponse
	 */
	public static <TDocument> JsonpDeserializer<SearchResponse<TDocument>> createSearchResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> SearchResponse.setupSearchResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>> void setupSearchResponseDeserializer(
			DelegatingDeserializer<BuilderT> op, JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(AbstractBuilder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(AbstractBuilder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(AbstractBuilder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(AbstractBuilder::hits, HitsMetadata.createHitsMetadataDeserializer(tDocumentDeserializer), "hits");
		op.add(AbstractBuilder::aggregations,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "aggregations");
		op.add(AbstractBuilder::clusters, ClusterStatistics._DESERIALIZER, "_clusters");
		op.add(AbstractBuilder::documents, JsonpDeserializer.arrayDeserializer(tDocumentDeserializer), "documents");
		op.add(AbstractBuilder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(AbstractBuilder::maxScore, JsonpDeserializer.doubleDeserializer(), "max_score");
		op.add(AbstractBuilder::numReducePhases, JsonpDeserializer.longDeserializer(), "num_reduce_phases");
		op.add(AbstractBuilder::profile, Profile._DESERIALIZER, "profile");
		op.add(AbstractBuilder::pitId, JsonpDeserializer.stringDeserializer(), "pit_id");
		op.add(AbstractBuilder::scrollId, JsonpDeserializer.stringDeserializer(), "_scroll_id");
		op.add(AbstractBuilder::suggest, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(Suggestion.createSuggestionDeserializer(tDocumentDeserializer))),
				"suggest");
		op.add(AbstractBuilder::terminatedEarly, JsonpDeserializer.booleanDeserializer(), "terminated_early");

	}

}
