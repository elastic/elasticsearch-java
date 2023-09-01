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

package co.elastic.clients.elasticsearch.core.msearch;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.KnnQuery;
import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.FieldAndFormat;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.search.FieldCollapse;
import co.elastic.clients.elasticsearch.core.search.Highlight;
import co.elastic.clients.elasticsearch.core.search.PointInTimeReference;
import co.elastic.clients.elasticsearch.core.search.Rescore;
import co.elastic.clients.elasticsearch.core.search.SourceConfig;
import co.elastic.clients.elasticsearch.core.search.Suggester;
import co.elastic.clients.elasticsearch.core.search.TrackHits;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.msearch.MultisearchBody

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.msearch.MultisearchBody">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultisearchBody implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final FieldCollapse collapse;

	@Nullable
	private final Query query;

	@Nullable
	private final Boolean explain;

	private final Map<String, JsonData> ext;

	private final List<String> storedFields;

	private final List<FieldAndFormat> docvalueFields;

	private final List<KnnQuery> knn;

	@Nullable
	private final Integer from;

	@Nullable
	private final Highlight highlight;

	private final List<Map<String, Double>> indicesBoost;

	@Nullable
	private final Double minScore;

	@Nullable
	private final Query postFilter;

	@Nullable
	private final Boolean profile;

	private final List<Rescore> rescore;

	private final Map<String, ScriptField> scriptFields;

	private final List<FieldValue> searchAfter;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	@Nullable
	private final SourceConfig source;

	private final List<FieldAndFormat> fields;

	@Nullable
	private final Long terminateAfter;

	private final List<String> stats;

	@Nullable
	private final String timeout;

	@Nullable
	private final Boolean trackScores;

	@Nullable
	private final TrackHits trackTotalHits;

	@Nullable
	private final Boolean version;

	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final Boolean seqNoPrimaryTerm;

	@Nullable
	private final PointInTimeReference pit;

	@Nullable
	private final Suggester suggest;

	// ---------------------------------------------------------------------------------------------

	private MultisearchBody(Builder builder) {

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.collapse = builder.collapse;
		this.query = builder.query;
		this.explain = builder.explain;
		this.ext = ApiTypeHelper.unmodifiable(builder.ext);
		this.storedFields = ApiTypeHelper.unmodifiable(builder.storedFields);
		this.docvalueFields = ApiTypeHelper.unmodifiable(builder.docvalueFields);
		this.knn = ApiTypeHelper.unmodifiable(builder.knn);
		this.from = builder.from;
		this.highlight = builder.highlight;
		this.indicesBoost = ApiTypeHelper.unmodifiable(builder.indicesBoost);
		this.minScore = builder.minScore;
		this.postFilter = builder.postFilter;
		this.profile = builder.profile;
		this.rescore = ApiTypeHelper.unmodifiable(builder.rescore);
		this.scriptFields = ApiTypeHelper.unmodifiable(builder.scriptFields);
		this.searchAfter = ApiTypeHelper.unmodifiable(builder.searchAfter);
		this.size = builder.size;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.source = builder.source;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.terminateAfter = builder.terminateAfter;
		this.stats = ApiTypeHelper.unmodifiable(builder.stats);
		this.timeout = builder.timeout;
		this.trackScores = builder.trackScores;
		this.trackTotalHits = builder.trackTotalHits;
		this.version = builder.version;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.seqNoPrimaryTerm = builder.seqNoPrimaryTerm;
		this.pit = builder.pit;
		this.suggest = builder.suggest;

	}

	public static MultisearchBody of(Function<Builder, ObjectBuilder<MultisearchBody>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code collapse}
	 */
	@Nullable
	public final FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * Defines the search definition using the Query DSL.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * If true, returns detailed information about score computation as part of a
	 * hit.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * Configuration of search extensions defined by Elasticsearch plugins.
	 * <p>
	 * API name: {@code ext}
	 */
	public final Map<String, JsonData> ext() {
		return this.ext;
	}

	/**
	 * List of stored fields to return as part of a hit. If no fields are specified,
	 * no stored fields are included in the response. If this field is specified,
	 * the _source parameter defaults to false. You can pass _source: true to return
	 * both source fields and stored fields in the search response.
	 * <p>
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * Array of wildcard (*) patterns. The request returns doc values for field
	 * names matching these patterns in the hits.fields property of the response.
	 * <p>
	 * API name: {@code docvalue_fields}
	 */
	public final List<FieldAndFormat> docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * Defines the approximate kNN search to run.
	 * <p>
	 * API name: {@code knn}
	 */
	public final List<KnnQuery> knn() {
		return this.knn;
	}

	/**
	 * Starting document offset. By default, you cannot page through more than
	 * 10,000 hits using the from and size parameters. To page through more hits,
	 * use the search_after parameter.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public final Highlight highlight() {
		return this.highlight;
	}

	/**
	 * Boosts the _score of documents from specified indices.
	 * <p>
	 * API name: {@code indices_boost}
	 */
	public final List<Map<String, Double>> indicesBoost() {
		return this.indicesBoost;
	}

	/**
	 * Minimum _score for matching documents. Documents with a lower _score are not
	 * included in the search results.
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public final Double minScore() {
		return this.minScore;
	}

	/**
	 * API name: {@code post_filter}
	 */
	@Nullable
	public final Query postFilter() {
		return this.postFilter;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public final Boolean profile() {
		return this.profile;
	}

	/**
	 * API name: {@code rescore}
	 */
	public final List<Rescore> rescore() {
		return this.rescore;
	}

	/**
	 * Retrieve a script evaluation (based on different fields) for each hit.
	 * <p>
	 * API name: {@code script_fields}
	 */
	public final Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code search_after}
	 */
	public final List<FieldValue> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * The number of hits to return. By default, you cannot page through more than
	 * 10,000 hits using the from and size parameters. To page through more hits,
	 * use the search_after parameter.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * Indicates which source fields are returned for matching documents. These
	 * fields are returned in the hits._source property of the search response.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfig source() {
		return this.source;
	}

	/**
	 * Array of wildcard (*) patterns. The request returns values for field names
	 * matching these patterns in the hits.fields property of the response.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<FieldAndFormat> fields() {
		return this.fields;
	}

	/**
	 * Maximum number of documents to collect for each shard. If a query reaches
	 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
	 * documents before sorting. Defaults to 0, which does not terminate query
	 * execution early.
	 * <p>
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public final Long terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * Stats groups to associate with the search. Each group maintains a statistics
	 * aggregation for its associated searches. You can retrieve these stats using
	 * the indices stats API.
	 * <p>
	 * API name: {@code stats}
	 */
	public final List<String> stats() {
		return this.stats;
	}

	/**
	 * Specifies the period of time to wait for a response from each shard. If no
	 * response is received before the timeout expires, the request fails and
	 * returns an error. Defaults to no timeout.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * If true, calculate and return document scores, even if the scores are not
	 * used for sorting.
	 * <p>
	 * API name: {@code track_scores}
	 */
	@Nullable
	public final Boolean trackScores() {
		return this.trackScores;
	}

	/**
	 * Number of hits matching the query to count accurately. If true, the exact
	 * number of hits is returned at the cost of some performance. If false, the
	 * response does not include the total number of hits matching the query.
	 * Defaults to 10,000 hits.
	 * <p>
	 * API name: {@code track_total_hits}
	 */
	@Nullable
	public final TrackHits trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * If true, returns document version as part of a hit.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Boolean version() {
		return this.version;
	}

	/**
	 * Defines one or more runtime fields in the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * If true, returns sequence number and primary term of the last modification of
	 * each hit. See Optimistic concurrency control.
	 * <p>
	 * API name: {@code seq_no_primary_term}
	 */
	@Nullable
	public final Boolean seqNoPrimaryTerm() {
		return this.seqNoPrimaryTerm;
	}

	/**
	 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
	 * specify an &lt;index&gt; in the request path.
	 * <p>
	 * API name: {@code pit}
	 */
	@Nullable
	public final PointInTimeReference pit() {
		return this.pit;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public final Suggester suggest() {
		return this.suggest;
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

		if (ApiTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.collapse != null) {
			generator.writeKey("collapse");
			this.collapse.serialize(generator, mapper);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.explain != null) {
			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (ApiTypeHelper.isDefined(this.ext)) {
			generator.writeKey("ext");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.ext.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.storedFields)) {
			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.docvalueFields)) {
			generator.writeKey("docvalue_fields");
			generator.writeStartArray();
			for (FieldAndFormat item0 : this.docvalueFields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.knn)) {
			generator.writeKey("knn");
			generator.writeStartArray();
			for (KnnQuery item0 : this.knn) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.highlight != null) {
			generator.writeKey("highlight");
			this.highlight.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.indicesBoost)) {
			generator.writeKey("indices_boost");
			generator.writeStartArray();
			for (Map<String, Double> item0 : this.indicesBoost) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, Double> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.minScore != null) {
			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		if (this.postFilter != null) {
			generator.writeKey("post_filter");
			this.postFilter.serialize(generator, mapper);

		}
		if (this.profile != null) {
			generator.writeKey("profile");
			generator.write(this.profile);

		}
		if (ApiTypeHelper.isDefined(this.rescore)) {
			generator.writeKey("rescore");
			generator.writeStartArray();
			for (Rescore item0 : this.rescore) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.scriptFields)) {
			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.searchAfter)) {
			generator.writeKey("search_after");
			generator.writeStartArray();
			for (FieldValue item0 : this.searchAfter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (FieldAndFormat item0 : this.fields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.terminateAfter != null) {
			generator.writeKey("terminate_after");
			generator.write(this.terminateAfter);

		}
		if (ApiTypeHelper.isDefined(this.stats)) {
			generator.writeKey("stats");
			generator.writeStartArray();
			for (String item0 : this.stats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			generator.write(this.timeout);

		}
		if (this.trackScores != null) {
			generator.writeKey("track_scores");
			generator.write(this.trackScores);

		}
		if (this.trackTotalHits != null) {
			generator.writeKey("track_total_hits");
			this.trackTotalHits.serialize(generator, mapper);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.seqNoPrimaryTerm != null) {
			generator.writeKey("seq_no_primary_term");
			generator.write(this.seqNoPrimaryTerm);

		}
		if (this.pit != null) {
			generator.writeKey("pit");
			this.pit.serialize(generator, mapper);

		}
		if (this.suggest != null) {
			generator.writeKey("suggest");
			this.suggest.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultisearchBody}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MultisearchBody> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private FieldCollapse collapse;

		@Nullable
		private Query query;

		@Nullable
		private Boolean explain;

		@Nullable
		private Map<String, JsonData> ext;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private List<FieldAndFormat> docvalueFields;

		@Nullable
		private List<KnnQuery> knn;

		@Nullable
		private Integer from;

		@Nullable
		private Highlight highlight;

		@Nullable
		private List<Map<String, Double>> indicesBoost;

		@Nullable
		private Double minScore;

		@Nullable
		private Query postFilter;

		@Nullable
		private Boolean profile;

		@Nullable
		private List<Rescore> rescore;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private List<FieldValue> searchAfter;

		@Nullable
		private Integer size;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private SourceConfig source;

		@Nullable
		private List<FieldAndFormat> fields;

		@Nullable
		private Long terminateAfter;

		@Nullable
		private List<String> stats;

		@Nullable
		private String timeout;

		@Nullable
		private Boolean trackScores;

		@Nullable
		private TrackHits trackTotalHits;

		@Nullable
		private Boolean version;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Boolean seqNoPrimaryTerm;

		@Nullable
		private PointInTimeReference pit;

		@Nullable
		private Suggester suggest;

		/**
		 * API name: {@code aggregations}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final Builder aggregations(Map<String, Aggregation> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, Aggregation value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return aggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code collapse}
		 */
		public final Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public final Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		/**
		 * Defines the search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Defines the search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * If true, returns detailed information about score computation as part of a
		 * hit.
		 * <p>
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Configuration of search extensions defined by Elasticsearch plugins.
		 * <p>
		 * API name: {@code ext}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>ext</code>.
		 */
		public final Builder ext(Map<String, JsonData> map) {
			this.ext = _mapPutAll(this.ext, map);
			return this;
		}

		/**
		 * Configuration of search extensions defined by Elasticsearch plugins.
		 * <p>
		 * API name: {@code ext}
		 * <p>
		 * Adds an entry to <code>ext</code>.
		 */
		public final Builder ext(String key, JsonData value) {
			this.ext = _mapPut(this.ext, key, value);
			return this;
		}

		/**
		 * List of stored fields to return as part of a hit. If no fields are specified,
		 * no stored fields are included in the response. If this field is specified,
		 * the _source parameter defaults to false. You can pass _source: true to return
		 * both source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>storedFields</code>.
		 */
		public final Builder storedFields(List<String> list) {
			this.storedFields = _listAddAll(this.storedFields, list);
			return this;
		}

		/**
		 * List of stored fields to return as part of a hit. If no fields are specified,
		 * no stored fields are included in the response. If this field is specified,
		 * the _source parameter defaults to false. You can pass _source: true to return
		 * both source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds one or more values to <code>storedFields</code>.
		 */
		public final Builder storedFields(String value, String... values) {
			this.storedFields = _listAdd(this.storedFields, value, values);
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns doc values for field
		 * names matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docvalueFields</code>.
		 */
		public final Builder docvalueFields(List<FieldAndFormat> list) {
			this.docvalueFields = _listAddAll(this.docvalueFields, list);
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns doc values for field
		 * names matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 * <p>
		 * Adds one or more values to <code>docvalueFields</code>.
		 */
		public final Builder docvalueFields(FieldAndFormat value, FieldAndFormat... values) {
			this.docvalueFields = _listAdd(this.docvalueFields, value, values);
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns doc values for field
		 * names matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 * <p>
		 * Adds a value to <code>docvalueFields</code> using a builder lambda.
		 */
		public final Builder docvalueFields(Function<FieldAndFormat.Builder, ObjectBuilder<FieldAndFormat>> fn) {
			return docvalueFields(fn.apply(new FieldAndFormat.Builder()).build());
		}

		/**
		 * Defines the approximate kNN search to run.
		 * <p>
		 * API name: {@code knn}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>knn</code>.
		 */
		public final Builder knn(List<KnnQuery> list) {
			this.knn = _listAddAll(this.knn, list);
			return this;
		}

		/**
		 * Defines the approximate kNN search to run.
		 * <p>
		 * API name: {@code knn}
		 * <p>
		 * Adds one or more values to <code>knn</code>.
		 */
		public final Builder knn(KnnQuery value, KnnQuery... values) {
			this.knn = _listAdd(this.knn, value, values);
			return this;
		}

		/**
		 * Defines the approximate kNN search to run.
		 * <p>
		 * API name: {@code knn}
		 * <p>
		 * Adds a value to <code>knn</code> using a builder lambda.
		 */
		public final Builder knn(Function<KnnQuery.Builder, ObjectBuilder<KnnQuery>> fn) {
			return knn(fn.apply(new KnnQuery.Builder()).build());
		}

		/**
		 * Starting document offset. By default, you cannot page through more than
		 * 10,000 hits using the from and size parameters. To page through more hits,
		 * use the search_after parameter.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public final Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public final Builder highlight(Function<Highlight.Builder, ObjectBuilder<Highlight>> fn) {
			return this.highlight(fn.apply(new Highlight.Builder()).build());
		}

		/**
		 * Boosts the _score of documents from specified indices.
		 * <p>
		 * API name: {@code indices_boost}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indicesBoost</code>.
		 */
		public final Builder indicesBoost(List<Map<String, Double>> list) {
			this.indicesBoost = _listAddAll(this.indicesBoost, list);
			return this;
		}

		/**
		 * Boosts the _score of documents from specified indices.
		 * <p>
		 * API name: {@code indices_boost}
		 * <p>
		 * Adds one or more values to <code>indicesBoost</code>.
		 */
		public final Builder indicesBoost(Map<String, Double> value, Map<String, Double>... values) {
			this.indicesBoost = _listAdd(this.indicesBoost, value, values);
			return this;
		}

		/**
		 * Minimum _score for matching documents. Documents with a lower _score are not
		 * included in the search results.
		 * <p>
		 * API name: {@code min_score}
		 */
		public final Builder minScore(@Nullable Double value) {
			this.minScore = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public final Builder postFilter(@Nullable Query value) {
			this.postFilter = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public final Builder postFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.postFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code profile}
		 */
		public final Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rescore</code>.
		 */
		public final Builder rescore(List<Rescore> list) {
			this.rescore = _listAddAll(this.rescore, list);
			return this;
		}

		/**
		 * API name: {@code rescore}
		 * <p>
		 * Adds one or more values to <code>rescore</code>.
		 */
		public final Builder rescore(Rescore value, Rescore... values) {
			this.rescore = _listAdd(this.rescore, value, values);
			return this;
		}

		/**
		 * API name: {@code rescore}
		 * <p>
		 * Adds a value to <code>rescore</code> using a builder lambda.
		 */
		public final Builder rescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return rescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>scriptFields</code>.
		 */
		public final Builder scriptFields(Map<String, ScriptField> map) {
			this.scriptFields = _mapPutAll(this.scriptFields, map);
			return this;
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds an entry to <code>scriptFields</code>.
		 */
		public final Builder scriptFields(String key, ScriptField value) {
			this.scriptFields = _mapPut(this.scriptFields, key, value);
			return this;
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds an entry to <code>scriptFields</code> using a builder lambda.
		 */
		public final Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return scriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * API name: {@code search_after}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(List<FieldValue> list) {
			this.searchAfter = _listAddAll(this.searchAfter, list);
			return this;
		}

		/**
		 * API name: {@code search_after}
		 * <p>
		 * Adds one or more values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(FieldValue value, FieldValue... values) {
			this.searchAfter = _listAdd(this.searchAfter, value, values);
			return this;
		}

		/**
		 * API name: {@code search_after}
		 * <p>
		 * Adds a value to <code>searchAfter</code> using a builder lambda.
		 */
		public final Builder searchAfter(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return searchAfter(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * The number of hits to return. By default, you cannot page through more than
		 * 10,000 hits using the from and size parameters. To page through more hits,
		 * use the search_after parameter.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<SortOptions> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(SortOptions value, SortOptions... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		/**
		 * Indicates which source fields are returned for matching documents. These
		 * fields are returned in the hits._source property of the search response.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * Indicates which source fields are returned for matching documents. These
		 * fields are returned in the hits._source property of the search response.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(Function<SourceConfig.Builder, ObjectBuilder<SourceConfig>> fn) {
			return this.source(fn.apply(new SourceConfig.Builder()).build());
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<FieldAndFormat> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(FieldAndFormat value, FieldAndFormat... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds a value to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(Function<FieldAndFormat.Builder, ObjectBuilder<FieldAndFormat>> fn) {
			return fields(fn.apply(new FieldAndFormat.Builder()).build());
		}

		/**
		 * Maximum number of documents to collect for each shard. If a query reaches
		 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
		 * documents before sorting. Defaults to 0, which does not terminate query
		 * execution early.
		 * <p>
		 * API name: {@code terminate_after}
		 */
		public final Builder terminateAfter(@Nullable Long value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * Stats groups to associate with the search. Each group maintains a statistics
		 * aggregation for its associated searches. You can retrieve these stats using
		 * the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stats</code>.
		 */
		public final Builder stats(List<String> list) {
			this.stats = _listAddAll(this.stats, list);
			return this;
		}

		/**
		 * Stats groups to associate with the search. Each group maintains a statistics
		 * aggregation for its associated searches. You can retrieve these stats using
		 * the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 * <p>
		 * Adds one or more values to <code>stats</code>.
		 */
		public final Builder stats(String value, String... values) {
			this.stats = _listAdd(this.stats, value, values);
			return this;
		}

		/**
		 * Specifies the period of time to wait for a response from each shard. If no
		 * response is received before the timeout expires, the request fails and
		 * returns an error. Defaults to no timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * If true, calculate and return document scores, even if the scores are not
		 * used for sorting.
		 * <p>
		 * API name: {@code track_scores}
		 */
		public final Builder trackScores(@Nullable Boolean value) {
			this.trackScores = value;
			return this;
		}

		/**
		 * Number of hits matching the query to count accurately. If true, the exact
		 * number of hits is returned at the cost of some performance. If false, the
		 * response does not include the total number of hits matching the query.
		 * Defaults to 10,000 hits.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(@Nullable TrackHits value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * Number of hits matching the query to count accurately. If true, the exact
		 * number of hits is returned at the cost of some performance. If false, the
		 * response does not include the total number of hits matching the query.
		 * Defaults to 10,000 hits.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(Function<TrackHits.Builder, ObjectBuilder<TrackHits>> fn) {
			return this.trackTotalHits(fn.apply(new TrackHits.Builder()).build());
		}

		/**
		 * If true, returns document version as part of a hit.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * If true, returns sequence number and primary term of the last modification of
		 * each hit. See Optimistic concurrency control.
		 * <p>
		 * API name: {@code seq_no_primary_term}
		 */
		public final Builder seqNoPrimaryTerm(@Nullable Boolean value) {
			this.seqNoPrimaryTerm = value;
			return this;
		}

		/**
		 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an &lt;index&gt; in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public final Builder pit(@Nullable PointInTimeReference value) {
			this.pit = value;
			return this;
		}

		/**
		 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an &lt;index&gt; in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public final Builder pit(Function<PointInTimeReference.Builder, ObjectBuilder<PointInTimeReference>> fn) {
			return this.pit(fn.apply(new PointInTimeReference.Builder()).build());
		}

		/**
		 * API name: {@code suggest}
		 */
		public final Builder suggest(@Nullable Suggester value) {
			this.suggest = value;
			return this;
		}

		/**
		 * API name: {@code suggest}
		 */
		public final Builder suggest(Function<Suggester.Builder, ObjectBuilder<Suggester>> fn) {
			return this.suggest(fn.apply(new Suggester.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultisearchBody}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultisearchBody build() {
			_checkSingleUse();

			return new MultisearchBody(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultisearchBody}
	 */
	public static final JsonpDeserializer<MultisearchBody> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MultisearchBody::setupMultisearchBodyDeserializer);

	protected static void setupMultisearchBodyDeserializer(ObjectDeserializer<MultisearchBody.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::collapse, FieldCollapse._DESERIALIZER, "collapse");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::ext, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "ext");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::docvalueFields, JsonpDeserializer.arrayDeserializer(FieldAndFormat._DESERIALIZER),
				"docvalue_fields");
		op.add(Builder::knn, JsonpDeserializer.arrayDeserializer(KnnQuery._DESERIALIZER), "knn");
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::highlight, Highlight._DESERIALIZER, "highlight");
		op.add(Builder::indicesBoost,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer())),
				"indices_boost");
		op.add(Builder::minScore, JsonpDeserializer.doubleDeserializer(), "min_score");
		op.add(Builder::postFilter, Query._DESERIALIZER, "post_filter");
		op.add(Builder::profile, JsonpDeserializer.booleanDeserializer(), "profile");
		op.add(Builder::rescore, JsonpDeserializer.arrayDeserializer(Rescore._DESERIALIZER), "rescore");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "search_after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");
		op.add(Builder::source, SourceConfig._DESERIALIZER, "_source");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(FieldAndFormat._DESERIALIZER), "fields");
		op.add(Builder::terminateAfter, JsonpDeserializer.longDeserializer(), "terminate_after");
		op.add(Builder::stats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "stats");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");
		op.add(Builder::trackScores, JsonpDeserializer.booleanDeserializer(), "track_scores");
		op.add(Builder::trackTotalHits, TrackHits._DESERIALIZER, "track_total_hits");
		op.add(Builder::version, JsonpDeserializer.booleanDeserializer(), "version");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::seqNoPrimaryTerm, JsonpDeserializer.booleanDeserializer(), "seq_no_primary_term");
		op.add(Builder::pit, PointInTimeReference._DESERIALIZER, "pit");
		op.add(Builder::suggest, Suggester._DESERIALIZER, "suggest");

	}

}
