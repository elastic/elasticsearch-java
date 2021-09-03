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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettings
public class IndexSettings implements ToJsonp {
	@Nullable
	private final JsonValue numberOfShards;

	@Nullable
	private final JsonValue numberOfReplicas;

	@Nullable
	private final Number numberOfRoutingShards;

	@Nullable
	private final JsonValue checkOnStartup;

	@Nullable
	private final String codec;

	@Nullable
	private final JsonValue routingPartitionSize;

	@Nullable
	private final JsonValue softDeletes_retentionLease_period;

	@Nullable
	private final Boolean loadFixedBitsetFiltersEagerly;

	@Nullable
	private final JsonValue hidden;

	@Nullable
	private final String autoExpandReplicas;

	@Nullable
	private final JsonValue search_idle_after;

	@Nullable
	private final JsonValue refreshInterval;

	@Nullable
	private final Number maxResultWindow;

	@Nullable
	private final Number maxInnerResultWindow;

	@Nullable
	private final Number maxRescoreWindow;

	@Nullable
	private final Number maxDocvalueFieldsSearch;

	@Nullable
	private final Number maxScriptFields;

	@Nullable
	private final Number maxNgramDiff;

	@Nullable
	private final Number maxShingleDiff;

	@Nullable
	private final IndexSettingBlocks blocks;

	@Nullable
	private final Number maxRefreshListeners;

	@Nullable
	private final Number analyze_maxTokenCount;

	@Nullable
	private final Number highlight_maxAnalyzedOffset;

	@Nullable
	private final Number maxTermsCount;

	@Nullable
	private final Number maxRegexLength;

	@Nullable
	private final IndexRouting routing;

	@Nullable
	private final JsonValue gcDeletes;

	@Nullable
	private final String defaultPipeline;

	@Nullable
	private final String finalPipeline;

	@Nullable
	private final IndexSettingsLifecycle lifecycle;

	@Nullable
	private final String providedName;

	@Nullable
	private final String creationDate;

	@Nullable
	private final String uuid;

	@Nullable
	private final IndexVersioning version;

	@Nullable
	private final JsonValue verifiedBeforeClose;

	@Nullable
	private final JsonValue format;

	@Nullable
	private final Number maxSlicesPerScroll;

	@Nullable
	private final String translog_durability;

	@Nullable
	private final JsonValue queryString_lenient;

	@Nullable
	private final JsonValue priority;

	@Nullable
	private final Number topMetricsMaxSize;

	@Nullable
	private final IndexSettingsAnalysis analysis;

	// ---------------------------------------------------------------------------------------------

	protected IndexSettings(AbstractBuilder<?> builder) {

		this.numberOfShards = builder.numberOfShards;
		this.numberOfReplicas = builder.numberOfReplicas;
		this.numberOfRoutingShards = builder.numberOfRoutingShards;
		this.checkOnStartup = builder.checkOnStartup;
		this.codec = builder.codec;
		this.routingPartitionSize = builder.routingPartitionSize;
		this.softDeletes_retentionLease_period = builder.softDeletes_retentionLease_period;
		this.loadFixedBitsetFiltersEagerly = builder.loadFixedBitsetFiltersEagerly;
		this.hidden = builder.hidden;
		this.autoExpandReplicas = builder.autoExpandReplicas;
		this.search_idle_after = builder.search_idle_after;
		this.refreshInterval = builder.refreshInterval;
		this.maxResultWindow = builder.maxResultWindow;
		this.maxInnerResultWindow = builder.maxInnerResultWindow;
		this.maxRescoreWindow = builder.maxRescoreWindow;
		this.maxDocvalueFieldsSearch = builder.maxDocvalueFieldsSearch;
		this.maxScriptFields = builder.maxScriptFields;
		this.maxNgramDiff = builder.maxNgramDiff;
		this.maxShingleDiff = builder.maxShingleDiff;
		this.blocks = builder.blocks;
		this.maxRefreshListeners = builder.maxRefreshListeners;
		this.analyze_maxTokenCount = builder.analyze_maxTokenCount;
		this.highlight_maxAnalyzedOffset = builder.highlight_maxAnalyzedOffset;
		this.maxTermsCount = builder.maxTermsCount;
		this.maxRegexLength = builder.maxRegexLength;
		this.routing = builder.routing;
		this.gcDeletes = builder.gcDeletes;
		this.defaultPipeline = builder.defaultPipeline;
		this.finalPipeline = builder.finalPipeline;
		this.lifecycle = builder.lifecycle;
		this.providedName = builder.providedName;
		this.creationDate = builder.creationDate;
		this.uuid = builder.uuid;
		this.version = builder.version;
		this.verifiedBeforeClose = builder.verifiedBeforeClose;
		this.format = builder.format;
		this.maxSlicesPerScroll = builder.maxSlicesPerScroll;
		this.translog_durability = builder.translog_durability;
		this.queryString_lenient = builder.queryString_lenient;
		this.priority = builder.priority;
		this.topMetricsMaxSize = builder.topMetricsMaxSize;
		this.analysis = builder.analysis;

	}

	/**
	 * server_default 1
	 * <p>
	 * API name: {@code number_of_shards}
	 */
	@Nullable
	public JsonValue numberOfShards() {
		return this.numberOfShards;
	}

	/**
	 * server_default 0
	 * <p>
	 * API name: {@code number_of_replicas}
	 */
	@Nullable
	public JsonValue numberOfReplicas() {
		return this.numberOfReplicas;
	}

	/**
	 * API name: {@code number_of_routing_shards}
	 */
	@Nullable
	public Number numberOfRoutingShards() {
		return this.numberOfRoutingShards;
	}

	/**
	 * API name: {@code check_on_startup}
	 */
	@Nullable
	public JsonValue checkOnStartup() {
		return this.checkOnStartup;
	}

	/**
	 * API name: {@code codec}
	 */
	@Nullable
	public String codec() {
		return this.codec;
	}

	/**
	 * server_default 1
	 * <p>
	 * API name: {@code routing_partition_size}
	 */
	@Nullable
	public JsonValue routingPartitionSize() {
		return this.routingPartitionSize;
	}

	/**
	 * API name: {@code soft_deletes.retention_lease.period}
	 */
	@Nullable
	public JsonValue softDeletes_retentionLease_period() {
		return this.softDeletes_retentionLease_period;
	}

	/**
	 * API name: {@code load_fixed_bitset_filters_eagerly}
	 */
	@Nullable
	public Boolean loadFixedBitsetFiltersEagerly() {
		return this.loadFixedBitsetFiltersEagerly;
	}

	/**
	 * server_default false
	 * <p>
	 * API name: {@code hidden}
	 */
	@Nullable
	public JsonValue hidden() {
		return this.hidden;
	}

	/**
	 * API name: {@code auto_expand_replicas}
	 */
	@Nullable
	public String autoExpandReplicas() {
		return this.autoExpandReplicas;
	}

	/**
	 * API name: {@code search.idle.after}
	 */
	@Nullable
	public JsonValue search_idle_after() {
		return this.search_idle_after;
	}

	/**
	 * API name: {@code refresh_interval}
	 */
	@Nullable
	public JsonValue refreshInterval() {
		return this.refreshInterval;
	}

	/**
	 * API name: {@code max_result_window}
	 */
	@Nullable
	public Number maxResultWindow() {
		return this.maxResultWindow;
	}

	/**
	 * API name: {@code max_inner_result_window}
	 */
	@Nullable
	public Number maxInnerResultWindow() {
		return this.maxInnerResultWindow;
	}

	/**
	 * API name: {@code max_rescore_window}
	 */
	@Nullable
	public Number maxRescoreWindow() {
		return this.maxRescoreWindow;
	}

	/**
	 * API name: {@code max_docvalue_fields_search}
	 */
	@Nullable
	public Number maxDocvalueFieldsSearch() {
		return this.maxDocvalueFieldsSearch;
	}

	/**
	 * API name: {@code max_script_fields}
	 */
	@Nullable
	public Number maxScriptFields() {
		return this.maxScriptFields;
	}

	/**
	 * API name: {@code max_ngram_diff}
	 */
	@Nullable
	public Number maxNgramDiff() {
		return this.maxNgramDiff;
	}

	/**
	 * API name: {@code max_shingle_diff}
	 */
	@Nullable
	public Number maxShingleDiff() {
		return this.maxShingleDiff;
	}

	/**
	 * API name: {@code blocks}
	 */
	@Nullable
	public IndexSettingBlocks blocks() {
		return this.blocks;
	}

	/**
	 * API name: {@code max_refresh_listeners}
	 */
	@Nullable
	public Number maxRefreshListeners() {
		return this.maxRefreshListeners;
	}

	/**
	 * API name: {@code analyze.max_token_count}
	 */
	@Nullable
	public Number analyze_maxTokenCount() {
		return this.analyze_maxTokenCount;
	}

	/**
	 * API name: {@code highlight.max_analyzed_offset}
	 */
	@Nullable
	public Number highlight_maxAnalyzedOffset() {
		return this.highlight_maxAnalyzedOffset;
	}

	/**
	 * API name: {@code max_terms_count}
	 */
	@Nullable
	public Number maxTermsCount() {
		return this.maxTermsCount;
	}

	/**
	 * API name: {@code max_regex_length}
	 */
	@Nullable
	public Number maxRegexLength() {
		return this.maxRegexLength;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public IndexRouting routing() {
		return this.routing;
	}

	/**
	 * API name: {@code gc_deletes}
	 */
	@Nullable
	public JsonValue gcDeletes() {
		return this.gcDeletes;
	}

	/**
	 * API name: {@code default_pipeline}
	 */
	@Nullable
	public String defaultPipeline() {
		return this.defaultPipeline;
	}

	/**
	 * API name: {@code final_pipeline}
	 */
	@Nullable
	public String finalPipeline() {
		return this.finalPipeline;
	}

	/**
	 * API name: {@code lifecycle}
	 */
	@Nullable
	public IndexSettingsLifecycle lifecycle() {
		return this.lifecycle;
	}

	/**
	 * API name: {@code provided_name}
	 */
	@Nullable
	public String providedName() {
		return this.providedName;
	}

	/**
	 * API name: {@code creation_date}
	 */
	@Nullable
	public String creationDate() {
		return this.creationDate;
	}

	/**
	 * API name: {@code uuid}
	 */
	@Nullable
	public String uuid() {
		return this.uuid;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public IndexVersioning version() {
		return this.version;
	}

	/**
	 * API name: {@code verified_before_close}
	 */
	@Nullable
	public JsonValue verifiedBeforeClose() {
		return this.verifiedBeforeClose;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public JsonValue format() {
		return this.format;
	}

	/**
	 * API name: {@code max_slices_per_scroll}
	 */
	@Nullable
	public Number maxSlicesPerScroll() {
		return this.maxSlicesPerScroll;
	}

	/**
	 * API name: {@code translog.durability}
	 */
	@Nullable
	public String translog_durability() {
		return this.translog_durability;
	}

	/**
	 * API name: {@code query_string.lenient}
	 */
	@Nullable
	public JsonValue queryString_lenient() {
		return this.queryString_lenient;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public JsonValue priority() {
		return this.priority;
	}

	/**
	 * API name: {@code top_metrics_max_size}
	 */
	@Nullable
	public Number topMetricsMaxSize() {
		return this.topMetricsMaxSize;
	}

	/**
	 * API name: {@code analysis}
	 */
	@Nullable
	public IndexSettingsAnalysis analysis() {
		return this.analysis;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.numberOfShards != null) {

			generator.writeKey("number_of_shards");
			generator.write(this.numberOfShards);

		}
		if (this.numberOfReplicas != null) {

			generator.writeKey("number_of_replicas");
			generator.write(this.numberOfReplicas);

		}
		if (this.numberOfRoutingShards != null) {

			generator.writeKey("number_of_routing_shards");
			generator.write(this.numberOfRoutingShards.doubleValue());

		}
		if (this.checkOnStartup != null) {

			generator.writeKey("check_on_startup");
			generator.write(this.checkOnStartup);

		}
		if (this.codec != null) {

			generator.writeKey("codec");
			generator.write(this.codec);

		}
		if (this.routingPartitionSize != null) {

			generator.writeKey("routing_partition_size");
			generator.write(this.routingPartitionSize);

		}
		if (this.softDeletes_retentionLease_period != null) {

			generator.writeKey("soft_deletes.retention_lease.period");
			generator.write(this.softDeletes_retentionLease_period);

		}
		if (this.loadFixedBitsetFiltersEagerly != null) {

			generator.writeKey("load_fixed_bitset_filters_eagerly");
			generator.write(this.loadFixedBitsetFiltersEagerly);

		}
		if (this.hidden != null) {

			generator.writeKey("hidden");
			generator.write(this.hidden);

		}
		if (this.autoExpandReplicas != null) {

			generator.writeKey("auto_expand_replicas");
			generator.write(this.autoExpandReplicas);

		}
		if (this.search_idle_after != null) {

			generator.writeKey("search.idle.after");
			generator.write(this.search_idle_after);

		}
		if (this.refreshInterval != null) {

			generator.writeKey("refresh_interval");
			generator.write(this.refreshInterval);

		}
		if (this.maxResultWindow != null) {

			generator.writeKey("max_result_window");
			generator.write(this.maxResultWindow.doubleValue());

		}
		if (this.maxInnerResultWindow != null) {

			generator.writeKey("max_inner_result_window");
			generator.write(this.maxInnerResultWindow.doubleValue());

		}
		if (this.maxRescoreWindow != null) {

			generator.writeKey("max_rescore_window");
			generator.write(this.maxRescoreWindow.doubleValue());

		}
		if (this.maxDocvalueFieldsSearch != null) {

			generator.writeKey("max_docvalue_fields_search");
			generator.write(this.maxDocvalueFieldsSearch.doubleValue());

		}
		if (this.maxScriptFields != null) {

			generator.writeKey("max_script_fields");
			generator.write(this.maxScriptFields.doubleValue());

		}
		if (this.maxNgramDiff != null) {

			generator.writeKey("max_ngram_diff");
			generator.write(this.maxNgramDiff.doubleValue());

		}
		if (this.maxShingleDiff != null) {

			generator.writeKey("max_shingle_diff");
			generator.write(this.maxShingleDiff.doubleValue());

		}
		if (this.blocks != null) {

			generator.writeKey("blocks");
			this.blocks.toJsonp(generator, mapper);

		}
		if (this.maxRefreshListeners != null) {

			generator.writeKey("max_refresh_listeners");
			generator.write(this.maxRefreshListeners.doubleValue());

		}
		if (this.analyze_maxTokenCount != null) {

			generator.writeKey("analyze.max_token_count");
			generator.write(this.analyze_maxTokenCount.doubleValue());

		}
		if (this.highlight_maxAnalyzedOffset != null) {

			generator.writeKey("highlight.max_analyzed_offset");
			generator.write(this.highlight_maxAnalyzedOffset.doubleValue());

		}
		if (this.maxTermsCount != null) {

			generator.writeKey("max_terms_count");
			generator.write(this.maxTermsCount.doubleValue());

		}
		if (this.maxRegexLength != null) {

			generator.writeKey("max_regex_length");
			generator.write(this.maxRegexLength.doubleValue());

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			this.routing.toJsonp(generator, mapper);

		}
		if (this.gcDeletes != null) {

			generator.writeKey("gc_deletes");
			generator.write(this.gcDeletes);

		}
		if (this.defaultPipeline != null) {

			generator.writeKey("default_pipeline");
			generator.write(this.defaultPipeline);

		}
		if (this.finalPipeline != null) {

			generator.writeKey("final_pipeline");
			generator.write(this.finalPipeline);

		}
		if (this.lifecycle != null) {

			generator.writeKey("lifecycle");
			this.lifecycle.toJsonp(generator, mapper);

		}
		if (this.providedName != null) {

			generator.writeKey("provided_name");
			generator.write(this.providedName);

		}
		if (this.creationDate != null) {

			generator.writeKey("creation_date");
			generator.write(this.creationDate);

		}
		if (this.uuid != null) {

			generator.writeKey("uuid");
			generator.write(this.uuid);

		}
		if (this.version != null) {

			generator.writeKey("version");
			this.version.toJsonp(generator, mapper);

		}
		if (this.verifiedBeforeClose != null) {

			generator.writeKey("verified_before_close");
			generator.write(this.verifiedBeforeClose);

		}
		if (this.format != null) {

			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.maxSlicesPerScroll != null) {

			generator.writeKey("max_slices_per_scroll");
			generator.write(this.maxSlicesPerScroll.doubleValue());

		}
		if (this.translog_durability != null) {

			generator.writeKey("translog.durability");
			generator.write(this.translog_durability);

		}
		if (this.queryString_lenient != null) {

			generator.writeKey("query_string.lenient");
			generator.write(this.queryString_lenient);

		}
		if (this.priority != null) {

			generator.writeKey("priority");
			generator.write(this.priority);

		}
		if (this.topMetricsMaxSize != null) {

			generator.writeKey("top_metrics_max_size");
			generator.write(this.topMetricsMaxSize.doubleValue());

		}
		if (this.analysis != null) {

			generator.writeKey("analysis");
			this.analysis.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettings}.
	 */
	public static class Builder extends IndexSettings.AbstractBuilder<Builder> implements ObjectBuilder<IndexSettings> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettings build() {

			return new IndexSettings(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private JsonValue numberOfShards;

		@Nullable
		private JsonValue numberOfReplicas;

		@Nullable
		private Number numberOfRoutingShards;

		@Nullable
		private JsonValue checkOnStartup;

		@Nullable
		private String codec;

		@Nullable
		private JsonValue routingPartitionSize;

		@Nullable
		private JsonValue softDeletes_retentionLease_period;

		@Nullable
		private Boolean loadFixedBitsetFiltersEagerly;

		@Nullable
		private JsonValue hidden;

		@Nullable
		private String autoExpandReplicas;

		@Nullable
		private JsonValue search_idle_after;

		@Nullable
		private JsonValue refreshInterval;

		@Nullable
		private Number maxResultWindow;

		@Nullable
		private Number maxInnerResultWindow;

		@Nullable
		private Number maxRescoreWindow;

		@Nullable
		private Number maxDocvalueFieldsSearch;

		@Nullable
		private Number maxScriptFields;

		@Nullable
		private Number maxNgramDiff;

		@Nullable
		private Number maxShingleDiff;

		@Nullable
		private IndexSettingBlocks blocks;

		@Nullable
		private Number maxRefreshListeners;

		@Nullable
		private Number analyze_maxTokenCount;

		@Nullable
		private Number highlight_maxAnalyzedOffset;

		@Nullable
		private Number maxTermsCount;

		@Nullable
		private Number maxRegexLength;

		@Nullable
		private IndexRouting routing;

		@Nullable
		private JsonValue gcDeletes;

		@Nullable
		private String defaultPipeline;

		@Nullable
		private String finalPipeline;

		@Nullable
		private IndexSettingsLifecycle lifecycle;

		@Nullable
		private String providedName;

		@Nullable
		private String creationDate;

		@Nullable
		private String uuid;

		@Nullable
		private IndexVersioning version;

		@Nullable
		private JsonValue verifiedBeforeClose;

		@Nullable
		private JsonValue format;

		@Nullable
		private Number maxSlicesPerScroll;

		@Nullable
		private String translog_durability;

		@Nullable
		private JsonValue queryString_lenient;

		@Nullable
		private JsonValue priority;

		@Nullable
		private Number topMetricsMaxSize;

		@Nullable
		private IndexSettingsAnalysis analysis;

		/**
		 * server_default 1
		 * <p>
		 * API name: {@code number_of_shards}
		 */
		public BuilderT numberOfShards(@Nullable JsonValue value) {
			this.numberOfShards = value;
			return self();
		}

		/**
		 * server_default 0
		 * <p>
		 * API name: {@code number_of_replicas}
		 */
		public BuilderT numberOfReplicas(@Nullable JsonValue value) {
			this.numberOfReplicas = value;
			return self();
		}

		/**
		 * API name: {@code number_of_routing_shards}
		 */
		public BuilderT numberOfRoutingShards(@Nullable Number value) {
			this.numberOfRoutingShards = value;
			return self();
		}

		/**
		 * API name: {@code check_on_startup}
		 */
		public BuilderT checkOnStartup(@Nullable JsonValue value) {
			this.checkOnStartup = value;
			return self();
		}

		/**
		 * API name: {@code codec}
		 */
		public BuilderT codec(@Nullable String value) {
			this.codec = value;
			return self();
		}

		/**
		 * server_default 1
		 * <p>
		 * API name: {@code routing_partition_size}
		 */
		public BuilderT routingPartitionSize(@Nullable JsonValue value) {
			this.routingPartitionSize = value;
			return self();
		}

		/**
		 * API name: {@code soft_deletes.retention_lease.period}
		 */
		public BuilderT softDeletes_retentionLease_period(@Nullable JsonValue value) {
			this.softDeletes_retentionLease_period = value;
			return self();
		}

		/**
		 * API name: {@code load_fixed_bitset_filters_eagerly}
		 */
		public BuilderT loadFixedBitsetFiltersEagerly(@Nullable Boolean value) {
			this.loadFixedBitsetFiltersEagerly = value;
			return self();
		}

		/**
		 * server_default false
		 * <p>
		 * API name: {@code hidden}
		 */
		public BuilderT hidden(@Nullable JsonValue value) {
			this.hidden = value;
			return self();
		}

		/**
		 * API name: {@code auto_expand_replicas}
		 */
		public BuilderT autoExpandReplicas(@Nullable String value) {
			this.autoExpandReplicas = value;
			return self();
		}

		/**
		 * API name: {@code search.idle.after}
		 */
		public BuilderT search_idle_after(@Nullable JsonValue value) {
			this.search_idle_after = value;
			return self();
		}

		/**
		 * API name: {@code refresh_interval}
		 */
		public BuilderT refreshInterval(@Nullable JsonValue value) {
			this.refreshInterval = value;
			return self();
		}

		/**
		 * API name: {@code max_result_window}
		 */
		public BuilderT maxResultWindow(@Nullable Number value) {
			this.maxResultWindow = value;
			return self();
		}

		/**
		 * API name: {@code max_inner_result_window}
		 */
		public BuilderT maxInnerResultWindow(@Nullable Number value) {
			this.maxInnerResultWindow = value;
			return self();
		}

		/**
		 * API name: {@code max_rescore_window}
		 */
		public BuilderT maxRescoreWindow(@Nullable Number value) {
			this.maxRescoreWindow = value;
			return self();
		}

		/**
		 * API name: {@code max_docvalue_fields_search}
		 */
		public BuilderT maxDocvalueFieldsSearch(@Nullable Number value) {
			this.maxDocvalueFieldsSearch = value;
			return self();
		}

		/**
		 * API name: {@code max_script_fields}
		 */
		public BuilderT maxScriptFields(@Nullable Number value) {
			this.maxScriptFields = value;
			return self();
		}

		/**
		 * API name: {@code max_ngram_diff}
		 */
		public BuilderT maxNgramDiff(@Nullable Number value) {
			this.maxNgramDiff = value;
			return self();
		}

		/**
		 * API name: {@code max_shingle_diff}
		 */
		public BuilderT maxShingleDiff(@Nullable Number value) {
			this.maxShingleDiff = value;
			return self();
		}

		/**
		 * API name: {@code blocks}
		 */
		public BuilderT blocks(@Nullable IndexSettingBlocks value) {
			this.blocks = value;
			return self();
		}

		/**
		 * API name: {@code blocks}
		 */
		public BuilderT blocks(Function<IndexSettingBlocks.Builder, ObjectBuilder<IndexSettingBlocks>> fn) {
			return this.blocks(fn.apply(new IndexSettingBlocks.Builder()).build());
		}

		/**
		 * API name: {@code max_refresh_listeners}
		 */
		public BuilderT maxRefreshListeners(@Nullable Number value) {
			this.maxRefreshListeners = value;
			return self();
		}

		/**
		 * API name: {@code analyze.max_token_count}
		 */
		public BuilderT analyze_maxTokenCount(@Nullable Number value) {
			this.analyze_maxTokenCount = value;
			return self();
		}

		/**
		 * API name: {@code highlight.max_analyzed_offset}
		 */
		public BuilderT highlight_maxAnalyzedOffset(@Nullable Number value) {
			this.highlight_maxAnalyzedOffset = value;
			return self();
		}

		/**
		 * API name: {@code max_terms_count}
		 */
		public BuilderT maxTermsCount(@Nullable Number value) {
			this.maxTermsCount = value;
			return self();
		}

		/**
		 * API name: {@code max_regex_length}
		 */
		public BuilderT maxRegexLength(@Nullable Number value) {
			this.maxRegexLength = value;
			return self();
		}

		/**
		 * API name: {@code routing}
		 */
		public BuilderT routing(@Nullable IndexRouting value) {
			this.routing = value;
			return self();
		}

		/**
		 * API name: {@code routing}
		 */
		public BuilderT routing(Function<IndexRouting.Builder, ObjectBuilder<IndexRouting>> fn) {
			return this.routing(fn.apply(new IndexRouting.Builder()).build());
		}

		/**
		 * API name: {@code gc_deletes}
		 */
		public BuilderT gcDeletes(@Nullable JsonValue value) {
			this.gcDeletes = value;
			return self();
		}

		/**
		 * API name: {@code default_pipeline}
		 */
		public BuilderT defaultPipeline(@Nullable String value) {
			this.defaultPipeline = value;
			return self();
		}

		/**
		 * API name: {@code final_pipeline}
		 */
		public BuilderT finalPipeline(@Nullable String value) {
			this.finalPipeline = value;
			return self();
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public BuilderT lifecycle(@Nullable IndexSettingsLifecycle value) {
			this.lifecycle = value;
			return self();
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public BuilderT lifecycle(Function<IndexSettingsLifecycle.Builder, ObjectBuilder<IndexSettingsLifecycle>> fn) {
			return this.lifecycle(fn.apply(new IndexSettingsLifecycle.Builder()).build());
		}

		/**
		 * API name: {@code provided_name}
		 */
		public BuilderT providedName(@Nullable String value) {
			this.providedName = value;
			return self();
		}

		/**
		 * API name: {@code creation_date}
		 */
		public BuilderT creationDate(@Nullable String value) {
			this.creationDate = value;
			return self();
		}

		/**
		 * API name: {@code uuid}
		 */
		public BuilderT uuid(@Nullable String value) {
			this.uuid = value;
			return self();
		}

		/**
		 * API name: {@code version}
		 */
		public BuilderT version(@Nullable IndexVersioning value) {
			this.version = value;
			return self();
		}

		/**
		 * API name: {@code version}
		 */
		public BuilderT version(Function<IndexVersioning.Builder, ObjectBuilder<IndexVersioning>> fn) {
			return this.version(fn.apply(new IndexVersioning.Builder()).build());
		}

		/**
		 * API name: {@code verified_before_close}
		 */
		public BuilderT verifiedBeforeClose(@Nullable JsonValue value) {
			this.verifiedBeforeClose = value;
			return self();
		}

		/**
		 * API name: {@code format}
		 */
		public BuilderT format(@Nullable JsonValue value) {
			this.format = value;
			return self();
		}

		/**
		 * API name: {@code max_slices_per_scroll}
		 */
		public BuilderT maxSlicesPerScroll(@Nullable Number value) {
			this.maxSlicesPerScroll = value;
			return self();
		}

		/**
		 * API name: {@code translog.durability}
		 */
		public BuilderT translog_durability(@Nullable String value) {
			this.translog_durability = value;
			return self();
		}

		/**
		 * API name: {@code query_string.lenient}
		 */
		public BuilderT queryString_lenient(@Nullable JsonValue value) {
			this.queryString_lenient = value;
			return self();
		}

		/**
		 * API name: {@code priority}
		 */
		public BuilderT priority(@Nullable JsonValue value) {
			this.priority = value;
			return self();
		}

		/**
		 * API name: {@code top_metrics_max_size}
		 */
		public BuilderT topMetricsMaxSize(@Nullable Number value) {
			this.topMetricsMaxSize = value;
			return self();
		}

		/**
		 * API name: {@code analysis}
		 */
		public BuilderT analysis(@Nullable IndexSettingsAnalysis value) {
			this.analysis = value;
			return self();
		}

		/**
		 * API name: {@code analysis}
		 */
		public BuilderT analysis(Function<IndexSettingsAnalysis.Builder, ObjectBuilder<IndexSettingsAnalysis>> fn) {
			return this.analysis(fn.apply(new IndexSettingsAnalysis.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexSettings
	 */
	public static final JsonpDeserializer<IndexSettings> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexSettings::setupIndexSettingsDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupIndexSettingsDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::numberOfShards, JsonpDeserializer.jsonValueDeserializer(), "number_of_shards",
				"index.number_of_shards");
		op.add(AbstractBuilder::numberOfReplicas, JsonpDeserializer.jsonValueDeserializer(), "number_of_replicas",
				"index.number_of_replicas");
		op.add(AbstractBuilder::numberOfRoutingShards, JsonpDeserializer.numberDeserializer(),
				"number_of_routing_shards", "index.number_of_routing_shards");
		op.add(AbstractBuilder::checkOnStartup, JsonpDeserializer.jsonValueDeserializer(), "check_on_startup",
				"index.check_on_startup");
		op.add(AbstractBuilder::codec, JsonpDeserializer.stringDeserializer(), "codec", "index.codec");
		op.add(AbstractBuilder::routingPartitionSize, JsonpDeserializer.jsonValueDeserializer(),
				"routing_partition_size", "index.routing_partition_size");
		op.add(AbstractBuilder::softDeletes_retentionLease_period, JsonpDeserializer.jsonValueDeserializer(),
				"soft_deletes.retention_lease.period", "index.soft_deletes.retention_lease.period");
		op.add(AbstractBuilder::loadFixedBitsetFiltersEagerly, JsonpDeserializer.booleanDeserializer(),
				"load_fixed_bitset_filters_eagerly", "index.load_fixed_bitset_filters_eagerly");
		op.add(AbstractBuilder::hidden, JsonpDeserializer.jsonValueDeserializer(), "hidden", "index.hidden");
		op.add(AbstractBuilder::autoExpandReplicas, JsonpDeserializer.stringDeserializer(), "auto_expand_replicas",
				"index.auto_expand_replicas");
		op.add(AbstractBuilder::search_idle_after, JsonpDeserializer.jsonValueDeserializer(), "search.idle.after",
				"index.search.idle.after");
		op.add(AbstractBuilder::refreshInterval, JsonpDeserializer.jsonValueDeserializer(), "refresh_interval",
				"index.refresh_interval");
		op.add(AbstractBuilder::maxResultWindow, JsonpDeserializer.numberDeserializer(), "max_result_window",
				"index.max_result_window");
		op.add(AbstractBuilder::maxInnerResultWindow, JsonpDeserializer.numberDeserializer(), "max_inner_result_window",
				"index.max_inner_result_window");
		op.add(AbstractBuilder::maxRescoreWindow, JsonpDeserializer.numberDeserializer(), "max_rescore_window",
				"index.max_rescore_window");
		op.add(AbstractBuilder::maxDocvalueFieldsSearch, JsonpDeserializer.numberDeserializer(),
				"max_docvalue_fields_search", "index.max_docvalue_fields_search");
		op.add(AbstractBuilder::maxScriptFields, JsonpDeserializer.numberDeserializer(), "max_script_fields",
				"index.max_script_fields");
		op.add(AbstractBuilder::maxNgramDiff, JsonpDeserializer.numberDeserializer(), "max_ngram_diff",
				"index.max_ngram_diff");
		op.add(AbstractBuilder::maxShingleDiff, JsonpDeserializer.numberDeserializer(), "max_shingle_diff",
				"index.max_shingle_diff");
		op.add(AbstractBuilder::blocks, IndexSettingBlocks.DESERIALIZER, "blocks", "index.blocks");
		op.add(AbstractBuilder::maxRefreshListeners, JsonpDeserializer.numberDeserializer(), "max_refresh_listeners",
				"index.max_refresh_listeners");
		op.add(AbstractBuilder::analyze_maxTokenCount, JsonpDeserializer.numberDeserializer(),
				"analyze.max_token_count", "index.analyze.max_token_count");
		op.add(AbstractBuilder::highlight_maxAnalyzedOffset, JsonpDeserializer.numberDeserializer(),
				"highlight.max_analyzed_offset", "index.highlight.max_analyzed_offset");
		op.add(AbstractBuilder::maxTermsCount, JsonpDeserializer.numberDeserializer(), "max_terms_count",
				"index.max_terms_count");
		op.add(AbstractBuilder::maxRegexLength, JsonpDeserializer.numberDeserializer(), "max_regex_length",
				"index.max_regex_length");
		op.add(AbstractBuilder::routing, IndexRouting.DESERIALIZER, "routing", "index.routing");
		op.add(AbstractBuilder::gcDeletes, JsonpDeserializer.jsonValueDeserializer(), "gc_deletes", "index.gc_deletes");
		op.add(AbstractBuilder::defaultPipeline, JsonpDeserializer.stringDeserializer(), "default_pipeline",
				"index.default_pipeline");
		op.add(AbstractBuilder::finalPipeline, JsonpDeserializer.stringDeserializer(), "final_pipeline",
				"index.final_pipeline");
		op.add(AbstractBuilder::lifecycle, IndexSettingsLifecycle.DESERIALIZER, "lifecycle", "index.lifecycle");
		op.add(AbstractBuilder::providedName, JsonpDeserializer.stringDeserializer(), "provided_name",
				"index.provided_name");
		op.add(AbstractBuilder::creationDate, JsonpDeserializer.stringDeserializer(), "creation_date",
				"index.creation_date");
		op.add(AbstractBuilder::uuid, JsonpDeserializer.stringDeserializer(), "uuid", "index.uuid");
		op.add(AbstractBuilder::version, IndexVersioning.DESERIALIZER, "version", "index.version");
		op.add(AbstractBuilder::verifiedBeforeClose, JsonpDeserializer.jsonValueDeserializer(), "verified_before_close",
				"index.verified_before_close");
		op.add(AbstractBuilder::format, JsonpDeserializer.jsonValueDeserializer(), "format", "index.format");
		op.add(AbstractBuilder::maxSlicesPerScroll, JsonpDeserializer.numberDeserializer(), "max_slices_per_scroll",
				"index.max_slices_per_scroll");
		op.add(AbstractBuilder::translog_durability, JsonpDeserializer.stringDeserializer(), "translog.durability",
				"index.translog.durability");
		op.add(AbstractBuilder::queryString_lenient, JsonpDeserializer.jsonValueDeserializer(), "query_string.lenient",
				"index.query_string.lenient");
		op.add(AbstractBuilder::priority, JsonpDeserializer.jsonValueDeserializer(), "priority", "index.priority");
		op.add(AbstractBuilder::topMetricsMaxSize, JsonpDeserializer.numberDeserializer(), "top_metrics_max_size");
		op.add(AbstractBuilder::analysis, IndexSettingsAnalysis.DESERIALIZER, "analysis");

	}

}
