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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._core.search.FieldCollapse;
import co.elastic.clients.elasticsearch._core.search.Highlight;
import co.elastic.clients.elasticsearch._core.search.PointInTimeReference;
import co.elastic.clients.elasticsearch._core.search.Rescore;
import co.elastic.clients.elasticsearch._core.search.Suggest;
import co.elastic.clients.elasticsearch._types.DefaultOperator;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.elasticsearch._types.SuggestMode;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: async_search.submit.Request
@JsonpDeserializable
public final class SubmitRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Long batchedReduceSize;

	@Nullable
	private final String waitForCompletionTimeout;

	@Nullable
	private final Boolean keepOnCompletion;

	@Nullable
	private final Boolean typedKeys;

	@Nullable
	private final Map<String, Aggregation> aggs;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean allowPartialSearchResults;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final FieldCollapse collapse;

	@Nullable
	private final DefaultOperator defaultOperator;

	@Nullable
	private final String df;

	@Nullable
	private final List<String> docvalueFields;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Integer from;

	@Nullable
	private final Highlight highlight;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final List<Map<String, Double>> indicesBoost;

	@Nullable
	private final String keepAlive;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Long maxConcurrentShardRequests;

	@Nullable
	private final Double minScore;

	@Nullable
	private final Query postFilter;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean profile;

	@Nullable
	private final PointInTimeReference pit;

	@Nullable
	private final Query query;

	@Nullable
	private final Boolean requestCache;

	@Nullable
	private final List<Rescore> rescore;

	@Nullable
	private final String routing;

	@Nullable
	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final List<String> searchAfter;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final Boolean sequenceNumberPrimaryTerm;

	@Nullable
	private final Integer size;

	@Nullable
	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	@Nullable
	private final JsonValue /* Union(_global.search._types.SourceFilter | internal.boolean) */ source;

	@Nullable
	private final List<String> stats;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final Map<String, Suggest> suggest;

	@Nullable
	private final String suggestField;

	@Nullable
	private final SuggestMode suggestMode;

	@Nullable
	private final Long suggestSize;

	@Nullable
	private final String suggestText;

	@Nullable
	private final Long terminateAfter;

	@Nullable
	private final String timeout;

	@Nullable
	private final Boolean trackScores;

	@Nullable
	private final Boolean trackTotalHits;

	@Nullable
	private final Boolean version;

	@Nullable
	private final List<JsonValue /* Union(_types.DateField | _types.Field) */> fields;

	@Nullable
	private final Map<String, RuntimeField> runtimeMappings;

	// ---------------------------------------------------------------------------------------------

	public SubmitRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.batchedReduceSize = builder.batchedReduceSize;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.typedKeys = builder.typedKeys;
		this.aggs = ModelTypeHelper.unmodifiable(builder.aggs);
		this.allowNoIndices = builder.allowNoIndices;
		this.allowPartialSearchResults = builder.allowPartialSearchResults;
		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.collapse = builder.collapse;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.docvalueFields = ModelTypeHelper.unmodifiable(builder.docvalueFields);
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.explain = builder.explain;
		this.from = builder.from;
		this.highlight = builder.highlight;
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.indicesBoost = ModelTypeHelper.unmodifiable(builder.indicesBoost);
		this.keepAlive = builder.keepAlive;
		this.lenient = builder.lenient;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.minScore = builder.minScore;
		this.postFilter = builder.postFilter;
		this.preference = builder.preference;
		this.profile = builder.profile;
		this.pit = builder.pit;
		this.query = builder.query;
		this.requestCache = builder.requestCache;
		this.rescore = ModelTypeHelper.unmodifiable(builder.rescore);
		this.routing = builder.routing;
		this.scriptFields = ModelTypeHelper.unmodifiable(builder.scriptFields);
		this.searchAfter = ModelTypeHelper.unmodifiable(builder.searchAfter);
		this.searchType = builder.searchType;
		this.sequenceNumberPrimaryTerm = builder.sequenceNumberPrimaryTerm;
		this.size = builder.size;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.source = builder.source;
		this.stats = ModelTypeHelper.unmodifiable(builder.stats);
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);
		this.suggest = ModelTypeHelper.unmodifiable(builder.suggest);
		this.suggestField = builder.suggestField;
		this.suggestMode = builder.suggestMode;
		this.suggestSize = builder.suggestSize;
		this.suggestText = builder.suggestText;
		this.terminateAfter = builder.terminateAfter;
		this.timeout = builder.timeout;
		this.trackScores = builder.trackScores;
		this.trackTotalHits = builder.trackTotalHits;
		this.version = builder.version;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);

	}

	public SubmitRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of index names to search; use <code>_all</code> or
	 * empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * The number of shard results that should be reduced at once on the
	 * coordinating node. This value should be used as the granularity at which
	 * progress results will be made available.
	 * <p>
	 * API name: {@code batched_reduce_size}
	 */
	@Nullable
	public Long batchedReduceSize() {
		return this.batchedReduceSize;
	}

	/**
	 * Specify the time that the request should block waiting for the final response
	 * <p>
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public String waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	/**
	 * Control whether the response should be stored in the cluster if it completed
	 * within the provided [wait_for_completion] time (default: false)
	 * <p>
	 * API name: {@code keep_on_completion}
	 */
	@Nullable
	public Boolean keepOnCompletion() {
		return this.keepOnCompletion;
	}

	/**
	 * Specify whether aggregation and suggester names should be prefixed by their
	 * respective types in the response
	 * <p>
	 * API name: {@code typed_keys}
	 */
	@Nullable
	public Boolean typedKeys() {
		return this.typedKeys;
	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * API name: {@code collapse}
	 */
	@Nullable
	public FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * API name: {@code default_operator}
	 */
	@Nullable
	public DefaultOperator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * API name: {@code df}
	 */
	@Nullable
	public String df() {
		return this.df;
	}

	/**
	 * API name: {@code docvalue_fields}
	 */
	@Nullable
	public List<String> docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public Highlight highlight() {
		return this.highlight;
	}

	/**
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code indices_boost}
	 */
	@Nullable
	public List<Map<String, Double>> indicesBoost() {
		return this.indicesBoost;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public String keepAlive() {
		return this.keepAlive;
	}

	/**
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public Long maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * API name: {@code min_score}
	 */
	@Nullable
	public Double minScore() {
		return this.minScore;
	}

	/**
	 * API name: {@code post_filter}
	 */
	@Nullable
	public Query postFilter() {
		return this.postFilter;
	}

	/**
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public Boolean profile() {
		return this.profile;
	}

	/**
	 * API name: {@code pit}
	 */
	@Nullable
	public PointInTimeReference pit() {
		return this.pit;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public Query query() {
		return this.query;
	}

	/**
	 * API name: {@code request_cache}
	 */
	@Nullable
	public Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * API name: {@code rescore}
	 */
	@Nullable
	public List<Rescore> rescore() {
		return this.rescore;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code script_fields}
	 */
	@Nullable
	public Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code search_after}
	 */
	@Nullable
	public List<String> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * API name: {@code search_type}
	 */
	@Nullable
	public SearchType searchType() {
		return this.searchType;
	}

	/**
	 * API name: {@code sequence_number_primary_term}
	 */
	@Nullable
	public Boolean sequenceNumberPrimaryTerm() {
		return this.sequenceNumberPrimaryTerm;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue /* Union(_global.search._types.SourceFilter | internal.boolean) */ source() {
		return this.source;
	}

	/**
	 * API name: {@code stats}
	 */
	@Nullable
	public List<String> stats() {
		return this.stats;
	}

	/**
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public Map<String, Suggest> suggest() {
		return this.suggest;
	}

	/**
	 * API name: {@code suggest_field}
	 */
	@Nullable
	public String suggestField() {
		return this.suggestField;
	}

	/**
	 * API name: {@code suggest_mode}
	 */
	@Nullable
	public SuggestMode suggestMode() {
		return this.suggestMode;
	}

	/**
	 * API name: {@code suggest_size}
	 */
	@Nullable
	public Long suggestSize() {
		return this.suggestSize;
	}

	/**
	 * API name: {@code suggest_text}
	 */
	@Nullable
	public String suggestText() {
		return this.suggestText;
	}

	/**
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public Long terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code track_scores}
	 */
	@Nullable
	public Boolean trackScores() {
		return this.trackScores;
	}

	/**
	 * API name: {@code track_total_hits}
	 */
	@Nullable
	public Boolean trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Boolean version() {
		return this.version;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<JsonValue /* Union(_types.DateField | _types.Field) */> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code runtime_mappings}
	 */
	@Nullable
	public Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
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

		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.allowNoIndices != null) {

			generator.writeKey("allow_no_indices");
			generator.write(this.allowNoIndices);

		}
		if (this.allowPartialSearchResults != null) {

			generator.writeKey("allow_partial_search_results");
			generator.write(this.allowPartialSearchResults);

		}
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.analyzeWildcard != null) {

			generator.writeKey("analyze_wildcard");
			generator.write(this.analyzeWildcard);

		}
		if (this.collapse != null) {

			generator.writeKey("collapse");
			this.collapse.serialize(generator, mapper);

		}
		if (this.defaultOperator != null) {

			generator.writeKey("default_operator");
			this.defaultOperator.serialize(generator, mapper);
		}
		if (this.df != null) {

			generator.writeKey("df");
			generator.write(this.df);

		}
		if (this.docvalueFields != null) {

			generator.writeKey("docvalue_fields");
			generator.writeStartArray();
			for (String item0 : this.docvalueFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.expandWildcards != null) {

			generator.writeKey("expand_wildcards");
			generator.writeStartArray();
			for (ExpandWildcardOptions item0 : this.expandWildcards) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.explain != null) {

			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.highlight != null) {

			generator.writeKey("highlight");
			this.highlight.serialize(generator, mapper);

		}
		if (this.ignoreThrottled != null) {

			generator.writeKey("ignore_throttled");
			generator.write(this.ignoreThrottled);

		}
		if (this.ignoreUnavailable != null) {

			generator.writeKey("ignore_unavailable");
			generator.write(this.ignoreUnavailable);

		}
		if (this.indicesBoost != null) {

			generator.writeKey("indices_boost");
			generator.writeStartArray();
			for (Map<String, Double> item0 : this.indicesBoost) {
				generator.writeStartObject();
				for (Map.Entry<String, Double> item1 : item0.entrySet()) {
					generator.writeKey(item1.getKey());
					generator.write(item1.getValue());

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.keepAlive != null) {

			generator.writeKey("keep_alive");
			generator.write(this.keepAlive);

		}
		if (this.lenient != null) {

			generator.writeKey("lenient");
			generator.write(this.lenient);

		}
		if (this.maxConcurrentShardRequests != null) {

			generator.writeKey("max_concurrent_shard_requests");
			generator.write(this.maxConcurrentShardRequests);

		}
		if (this.minScore != null) {

			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		if (this.postFilter != null) {

			generator.writeKey("post_filter");
			this.postFilter.serialize(generator, mapper);

		}
		if (this.preference != null) {

			generator.writeKey("preference");
			generator.write(this.preference);

		}
		if (this.profile != null) {

			generator.writeKey("profile");
			generator.write(this.profile);

		}
		if (this.pit != null) {

			generator.writeKey("pit");
			this.pit.serialize(generator, mapper);

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.requestCache != null) {

			generator.writeKey("request_cache");
			generator.write(this.requestCache);

		}
		if (this.rescore != null) {

			generator.writeKey("rescore");
			generator.writeStartArray();
			for (Rescore item0 : this.rescore) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.scriptFields != null) {

			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.searchAfter != null) {

			generator.writeKey("search_after");
			generator.writeStartArray();
			for (String item0 : this.searchAfter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.searchType != null) {

			generator.writeKey("search_type");
			this.searchType.serialize(generator, mapper);
		}
		if (this.sequenceNumberPrimaryTerm != null) {

			generator.writeKey("sequence_number_primary_term");
			generator.write(this.sequenceNumberPrimaryTerm);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.source != null) {

			generator.writeKey("_source");
			generator.write(this.source);

		}
		if (this.stats != null) {

			generator.writeKey("stats");
			generator.writeStartArray();
			for (String item0 : this.stats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.storedFields != null) {

			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.suggest != null) {

			generator.writeKey("suggest");
			generator.writeStartObject();
			for (Map.Entry<String, Suggest> item0 : this.suggest.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.suggestField != null) {

			generator.writeKey("suggest_field");
			generator.write(this.suggestField);

		}
		if (this.suggestMode != null) {

			generator.writeKey("suggest_mode");
			this.suggestMode.serialize(generator, mapper);
		}
		if (this.suggestSize != null) {

			generator.writeKey("suggest_size");
			generator.write(this.suggestSize);

		}
		if (this.suggestText != null) {

			generator.writeKey("suggest_text");
			generator.write(this.suggestText);

		}
		if (this.terminateAfter != null) {

			generator.writeKey("terminate_after");
			generator.write(this.terminateAfter);

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
			generator.write(this.trackTotalHits);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (JsonValue /* Union(_types.DateField | _types.Field) */ item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.runtimeMappings != null) {

			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SubmitRequest}.
	 */
	public static class Builder implements ObjectBuilder<SubmitRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Long batchedReduceSize;

		@Nullable
		private String waitForCompletionTimeout;

		@Nullable
		private Boolean keepOnCompletion;

		@Nullable
		private Boolean typedKeys;

		@Nullable
		private Map<String, Aggregation> aggs;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean allowPartialSearchResults;

		@Nullable
		private String analyzer;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private FieldCollapse collapse;

		@Nullable
		private DefaultOperator defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private List<String> docvalueFields;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean explain;

		@Nullable
		private Integer from;

		@Nullable
		private Highlight highlight;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<Map<String, Double>> indicesBoost;

		@Nullable
		private String keepAlive;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Long maxConcurrentShardRequests;

		@Nullable
		private Double minScore;

		@Nullable
		private Query postFilter;

		@Nullable
		private String preference;

		@Nullable
		private Boolean profile;

		@Nullable
		private PointInTimeReference pit;

		@Nullable
		private Query query;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private List<Rescore> rescore;

		@Nullable
		private String routing;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private List<String> searchAfter;

		@Nullable
		private SearchType searchType;

		@Nullable
		private Boolean sequenceNumberPrimaryTerm;

		@Nullable
		private Integer size;

		@Nullable
		private List<JsonValue /* _global.search._types.SortCombinations */> sort;

		@Nullable
		private JsonValue /* Union(_global.search._types.SourceFilter | internal.boolean) */ source;

		@Nullable
		private List<String> stats;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private Map<String, Suggest> suggest;

		@Nullable
		private String suggestField;

		@Nullable
		private SuggestMode suggestMode;

		@Nullable
		private Long suggestSize;

		@Nullable
		private String suggestText;

		@Nullable
		private Long terminateAfter;

		@Nullable
		private String timeout;

		@Nullable
		private Boolean trackScores;

		@Nullable
		private Boolean trackTotalHits;

		@Nullable
		private Boolean version;

		@Nullable
		private List<JsonValue /* Union(_types.DateField | _types.Field) */> fields;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * The number of shard results that should be reduced at once on the
		 * coordinating node. This value should be used as the granularity at which
		 * progress results will be made available.
		 * <p>
		 * API name: {@code batched_reduce_size}
		 */
		public Builder batchedReduceSize(@Nullable Long value) {
			this.batchedReduceSize = value;
			return this;
		}

		/**
		 * Specify the time that the request should block waiting for the final response
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public Builder waitForCompletionTimeout(@Nullable String value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * Control whether the response should be stored in the cluster if it completed
		 * within the provided [wait_for_completion] time (default: false)
		 * <p>
		 * API name: {@code keep_on_completion}
		 */
		public Builder keepOnCompletion(@Nullable Boolean value) {
			this.keepOnCompletion = value;
			return this;
		}

		/**
		 * Specify whether aggregation and suggester names should be prefixed by their
		 * respective types in the response
		 * <p>
		 * API name: {@code typed_keys}
		 */
		public Builder typedKeys(@Nullable Boolean value) {
			this.typedKeys = value;
			return this;
		}

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, Aggregation> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Aggregation value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggs(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code allow_partial_search_results}
		 */
		public Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		/**
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable DefaultOperator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * API name: {@code df}
		 */
		public Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public Builder docvalueFields(@Nullable List<String> value) {
			this.docvalueFields = value;
			return this;
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public Builder docvalueFields(String... value) {
			this.docvalueFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #docvalueFields(List)}, creating the list if needed.
		 */
		public Builder addDocvalueFields(String value) {
			if (this.docvalueFields == null) {
				this.docvalueFields = new ArrayList<>();
			}
			this.docvalueFields.add(value);
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #expandWildcards(List)}, creating the list if needed.
		 */
		public Builder addExpandWildcards(ExpandWildcardOptions value) {
			if (this.expandWildcards == null) {
				this.expandWildcards = new ArrayList<>();
			}
			this.expandWildcards.add(value);
			return this;
		}

		/**
		 * API name: {@code explain}
		 */
		public Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(Function<Highlight.Builder, ObjectBuilder<Highlight>> fn) {
			return this.highlight(fn.apply(new Highlight.Builder()).build());
		}

		/**
		 * API name: {@code ignore_throttled}
		 */
		public Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code indices_boost}
		 */
		public Builder indicesBoost(@Nullable List<Map<String, Double>> value) {
			this.indicesBoost = value;
			return this;
		}

		/**
		 * API name: {@code indices_boost}
		 */
		public Builder indicesBoost(Map<String, Double>... value) {
			this.indicesBoost = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indicesBoost(List)}, creating the list if needed.
		 */
		public Builder addIndicesBoost(Map<String, Double> value) {
			if (this.indicesBoost == null) {
				this.indicesBoost = new ArrayList<>();
			}
			this.indicesBoost.add(value);
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public Builder maxConcurrentShardRequests(@Nullable Long value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * API name: {@code min_score}
		 */
		public Builder minScore(@Nullable Double value) {
			this.minScore = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(@Nullable Query value) {
			this.postFilter = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.postFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * API name: {@code pit}
		 */
		public Builder pit(@Nullable PointInTimeReference value) {
			this.pit = value;
			return this;
		}

		/**
		 * API name: {@code pit}
		 */
		public Builder pit(Function<PointInTimeReference.Builder, ObjectBuilder<PointInTimeReference>> fn) {
			return this.pit(fn.apply(new PointInTimeReference.Builder()).build());
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code request_cache}
		 */
		public Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public Builder rescore(@Nullable List<Rescore> value) {
			this.rescore = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public Builder rescore(Rescore... value) {
			this.rescore = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rescore(List)}, creating the list if needed.
		 */
		public Builder addRescore(Rescore value) {
			if (this.rescore == null) {
				this.rescore = new ArrayList<>();
			}
			this.rescore.add(value);
			return this;
		}

		/**
		 * Set {@link #rescore(List)} to a singleton list.
		 */
		public Builder rescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return this.rescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * Add a value to {@link #rescore(List)}, creating the list if needed.
		 */
		public Builder addRescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return this.addRescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code script_fields}
		 */
		public Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, ScriptField value) {
			if (this.scriptFields == null) {
				this.scriptFields = new HashMap<>();
			}
			this.scriptFields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #scriptFields(Map)} to a singleton map.
		 */
		public Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.scriptFields(Collections.singletonMap(key, fn.apply(new ScriptField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.putScriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(@Nullable List<String> value) {
			this.searchAfter = value;
			return this;
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(String... value) {
			this.searchAfter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #searchAfter(List)}, creating the list if needed.
		 */
		public Builder addSearchAfter(String value) {
			if (this.searchAfter == null) {
				this.searchAfter = new ArrayList<>();
			}
			this.searchAfter.add(value);
			return this;
		}

		/**
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * API name: {@code sequence_number_primary_term}
		 */
		public Builder sequenceNumberPrimaryTerm(@Nullable Boolean value) {
			this.sequenceNumberPrimaryTerm = value;
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
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue /* _global.search._types.SortCombinations */> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue /* _global.search._types.SortCombinations */ value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder source(
				@Nullable JsonValue /* Union(_global.search._types.SourceFilter | internal.boolean) */ value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(@Nullable List<String> value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(String... value) {
			this.stats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stats(List)}, creating the list if needed.
		 */
		public Builder addStats(String value) {
			if (this.stats == null) {
				this.stats = new ArrayList<>();
			}
			this.stats.add(value);
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed.
		 */
		public Builder addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
			return this;
		}

		/**
		 * API name: {@code suggest}
		 */
		public Builder suggest(@Nullable Map<String, Suggest> value) {
			this.suggest = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #suggest(Map)}, creating the map if needed.
		 */
		public Builder putSuggest(String key, Suggest value) {
			if (this.suggest == null) {
				this.suggest = new HashMap<>();
			}
			this.suggest.put(key, value);
			return this;
		}

		/**
		 * Set {@link #suggest(Map)} to a singleton map.
		 */
		public Builder suggest(String key, Function<Suggest.Builder, ObjectBuilder<Suggest>> fn) {
			return this.suggest(Collections.singletonMap(key, fn.apply(new Suggest.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #suggest(Map)}, creating the map if needed.
		 */
		public Builder putSuggest(String key, Function<Suggest.Builder, ObjectBuilder<Suggest>> fn) {
			return this.putSuggest(key, fn.apply(new Suggest.Builder()).build());
		}

		/**
		 * API name: {@code suggest_field}
		 */
		public Builder suggestField(@Nullable String value) {
			this.suggestField = value;
			return this;
		}

		/**
		 * API name: {@code suggest_mode}
		 */
		public Builder suggestMode(@Nullable SuggestMode value) {
			this.suggestMode = value;
			return this;
		}

		/**
		 * API name: {@code suggest_size}
		 */
		public Builder suggestSize(@Nullable Long value) {
			this.suggestSize = value;
			return this;
		}

		/**
		 * API name: {@code suggest_text}
		 */
		public Builder suggestText(@Nullable String value) {
			this.suggestText = value;
			return this;
		}

		/**
		 * API name: {@code terminate_after}
		 */
		public Builder terminateAfter(@Nullable Long value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code track_scores}
		 */
		public Builder trackScores(@Nullable Boolean value) {
			this.trackScores = value;
			return this;
		}

		/**
		 * API name: {@code track_total_hits}
		 */
		public Builder trackTotalHits(@Nullable Boolean value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<JsonValue /* Union(_types.DateField | _types.Field) */> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(JsonValue /* Union(_types.DateField | _types.Field) */... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(JsonValue /* Union(_types.DateField | _types.Field) */ value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 */
		public Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, RuntimeField value) {
			if (this.runtimeMappings == null) {
				this.runtimeMappings = new HashMap<>();
			}
			this.runtimeMappings.put(key, value);
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.putRuntimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Builds a {@link SubmitRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SubmitRequest build() {

			return new SubmitRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SubmitRequest}
	 */
	public static final JsonpDeserializer<SubmitRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SubmitRequest::setupSubmitRequestDeserializer, Builder::build);

	protected static void setupSubmitRequestDeserializer(DelegatingDeserializer<SubmitRequest.Builder> op) {

		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER), "aggs");
		op.add(Builder::allowNoIndices, JsonpDeserializer.booleanDeserializer(), "allow_no_indices");
		op.add(Builder::allowPartialSearchResults, JsonpDeserializer.booleanDeserializer(),
				"allow_partial_search_results");
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::analyzeWildcard, JsonpDeserializer.booleanDeserializer(), "analyze_wildcard");
		op.add(Builder::collapse, FieldCollapse._DESERIALIZER, "collapse");
		op.add(Builder::defaultOperator, DefaultOperator._DESERIALIZER, "default_operator");
		op.add(Builder::df, JsonpDeserializer.stringDeserializer(), "df");
		op.add(Builder::docvalueFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"docvalue_fields");
		op.add(Builder::expandWildcards, JsonpDeserializer.arrayDeserializer(ExpandWildcardOptions._DESERIALIZER),
				"expand_wildcards");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::highlight, Highlight._DESERIALIZER, "highlight");
		op.add(Builder::ignoreThrottled, JsonpDeserializer.booleanDeserializer(), "ignore_throttled");
		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::indicesBoost,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer())),
				"indices_boost");
		op.add(Builder::keepAlive, JsonpDeserializer.stringDeserializer(), "keep_alive");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::maxConcurrentShardRequests, JsonpDeserializer.longDeserializer(),
				"max_concurrent_shard_requests");
		op.add(Builder::minScore, JsonpDeserializer.doubleDeserializer(), "min_score");
		op.add(Builder::postFilter, Query._DESERIALIZER, "post_filter");
		op.add(Builder::preference, JsonpDeserializer.stringDeserializer(), "preference");
		op.add(Builder::profile, JsonpDeserializer.booleanDeserializer(), "profile");
		op.add(Builder::pit, PointInTimeReference._DESERIALIZER, "pit");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::requestCache, JsonpDeserializer.booleanDeserializer(), "request_cache");
		op.add(Builder::rescore, JsonpDeserializer.arrayDeserializer(Rescore._DESERIALIZER), "rescore");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"search_after");
		op.add(Builder::searchType, SearchType._DESERIALIZER, "search_type");
		op.add(Builder::sequenceNumberPrimaryTerm, JsonpDeserializer.booleanDeserializer(),
				"sequence_number_primary_term");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");
		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::stats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "stats");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::suggest, JsonpDeserializer.stringMapDeserializer(Suggest._DESERIALIZER), "suggest");
		op.add(Builder::suggestField, JsonpDeserializer.stringDeserializer(), "suggest_field");
		op.add(Builder::suggestMode, SuggestMode._DESERIALIZER, "suggest_mode");
		op.add(Builder::suggestSize, JsonpDeserializer.longDeserializer(), "suggest_size");
		op.add(Builder::suggestText, JsonpDeserializer.stringDeserializer(), "suggest_text");
		op.add(Builder::terminateAfter, JsonpDeserializer.longDeserializer(), "terminate_after");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");
		op.add(Builder::trackScores, JsonpDeserializer.booleanDeserializer(), "track_scores");
		op.add(Builder::trackTotalHits, JsonpDeserializer.booleanDeserializer(), "track_total_hits");
		op.add(Builder::version, JsonpDeserializer.booleanDeserializer(), "version");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code async_search.submit}".
	 */
	private static final SimpleEndpoint<SubmitRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_async_search");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_async_search");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.batchedReduceSize != null) {
					params.put("batched_reduce_size", String.valueOf(request.batchedReduceSize));
				}
				if (request.waitForCompletionTimeout != null) {
					params.put("wait_for_completion_timeout", request.waitForCompletionTimeout);
				}
				if (request.keepOnCompletion != null) {
					params.put("keep_on_completion", String.valueOf(request.keepOnCompletion));
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code async_search.submit}" endpoint.
	 */
	public static <TDocument> Endpoint<SubmitRequest, SubmitResponse<TDocument>, ElasticsearchError> createSubmitEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(SubmitResponse.createSubmitResponseDeserializer(tDocumentDeserializer));
	}
}
