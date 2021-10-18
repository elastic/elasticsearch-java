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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettings
@JsonpDeserializable
public final class IndexSettings implements JsonpSerializable {
	@Nullable
	private final String numberOfShards;

	@Nullable
	private final String numberOfReplicas;

	@Nullable
	private final Integer numberOfRoutingShards;

	@Nullable
	private final IndexCheckOnStartup checkOnStartup;

	@Nullable
	private final String codec;

	@Nullable
	private final String routingPartitionSize;

	@Nullable
	private final String softDeletesRetentionLeasePeriod;

	@Nullable
	private final Boolean loadFixedBitsetFiltersEagerly;

	@Nullable
	private final Boolean hidden;

	@Nullable
	private final String autoExpandReplicas;

	@Nullable
	private final String searchIdleAfter;

	@Nullable
	private final String refreshInterval;

	@Nullable
	private final Integer maxResultWindow;

	@Nullable
	private final Integer maxInnerResultWindow;

	@Nullable
	private final Integer maxRescoreWindow;

	@Nullable
	private final Integer maxDocvalueFieldsSearch;

	@Nullable
	private final Integer maxScriptFields;

	@Nullable
	private final Integer maxNgramDiff;

	@Nullable
	private final Integer maxShingleDiff;

	@Nullable
	private final IndexSettingBlocks blocks;

	@Nullable
	private final Boolean blocksReadOnly;

	@Nullable
	private final Boolean blocksReadOnlyAllowDelete;

	@Nullable
	private final Boolean blocksRead;

	@Nullable
	private final Boolean blocksWrite;

	@Nullable
	private final Boolean blocksMetadata;

	@Nullable
	private final Integer maxRefreshListeners;

	@Nullable
	private final Integer analyzeMaxTokenCount;

	@Nullable
	private final Integer highlightMaxAnalyzedOffset;

	@Nullable
	private final Integer maxTermsCount;

	@Nullable
	private final Integer maxRegexLength;

	@Nullable
	private final IndexRouting routing;

	@Nullable
	private final String gcDeletes;

	@Nullable
	private final String defaultPipeline;

	@Nullable
	private final String finalPipeline;

	@Nullable
	private final IndexSettingsLifecycle lifecycle;

	@Nullable
	private final String lifecycleName;

	@Nullable
	private final String providedName;

	@Nullable
	private final String creationDate;

	@Nullable
	private final String uuid;

	@Nullable
	private final IndexVersioning version;

	@Nullable
	private final Boolean verifiedBeforeClose;

	@Nullable
	private final String format;

	@Nullable
	private final Integer maxSlicesPerScroll;

	@Nullable
	private final String translogDurability;

	@Nullable
	private final Boolean queryStringLenient;

	@Nullable
	private final String priority;

	@Nullable
	private final Integer topMetricsMaxSize;

	@Nullable
	private final IndexSettingsAnalysis analysis;

	@Nullable
	private final IndexSettings settings;

	// ---------------------------------------------------------------------------------------------

	public IndexSettings(Builder builder) {

		this.numberOfShards = builder.numberOfShards;
		this.numberOfReplicas = builder.numberOfReplicas;
		this.numberOfRoutingShards = builder.numberOfRoutingShards;
		this.checkOnStartup = builder.checkOnStartup;
		this.codec = builder.codec;
		this.routingPartitionSize = builder.routingPartitionSize;
		this.softDeletesRetentionLeasePeriod = builder.softDeletesRetentionLeasePeriod;
		this.loadFixedBitsetFiltersEagerly = builder.loadFixedBitsetFiltersEagerly;
		this.hidden = builder.hidden;
		this.autoExpandReplicas = builder.autoExpandReplicas;
		this.searchIdleAfter = builder.searchIdleAfter;
		this.refreshInterval = builder.refreshInterval;
		this.maxResultWindow = builder.maxResultWindow;
		this.maxInnerResultWindow = builder.maxInnerResultWindow;
		this.maxRescoreWindow = builder.maxRescoreWindow;
		this.maxDocvalueFieldsSearch = builder.maxDocvalueFieldsSearch;
		this.maxScriptFields = builder.maxScriptFields;
		this.maxNgramDiff = builder.maxNgramDiff;
		this.maxShingleDiff = builder.maxShingleDiff;
		this.blocks = builder.blocks;
		this.blocksReadOnly = builder.blocksReadOnly;
		this.blocksReadOnlyAllowDelete = builder.blocksReadOnlyAllowDelete;
		this.blocksRead = builder.blocksRead;
		this.blocksWrite = builder.blocksWrite;
		this.blocksMetadata = builder.blocksMetadata;
		this.maxRefreshListeners = builder.maxRefreshListeners;
		this.analyzeMaxTokenCount = builder.analyzeMaxTokenCount;
		this.highlightMaxAnalyzedOffset = builder.highlightMaxAnalyzedOffset;
		this.maxTermsCount = builder.maxTermsCount;
		this.maxRegexLength = builder.maxRegexLength;
		this.routing = builder.routing;
		this.gcDeletes = builder.gcDeletes;
		this.defaultPipeline = builder.defaultPipeline;
		this.finalPipeline = builder.finalPipeline;
		this.lifecycle = builder.lifecycle;
		this.lifecycleName = builder.lifecycleName;
		this.providedName = builder.providedName;
		this.creationDate = builder.creationDate;
		this.uuid = builder.uuid;
		this.version = builder.version;
		this.verifiedBeforeClose = builder.verifiedBeforeClose;
		this.format = builder.format;
		this.maxSlicesPerScroll = builder.maxSlicesPerScroll;
		this.translogDurability = builder.translogDurability;
		this.queryStringLenient = builder.queryStringLenient;
		this.priority = builder.priority;
		this.topMetricsMaxSize = builder.topMetricsMaxSize;
		this.analysis = builder.analysis;
		this.settings = builder.settings;

	}

	public IndexSettings(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code number_of_shards}
	 */
	@Nullable
	public String numberOfShards() {
		return this.numberOfShards;
	}

	/**
	 * API name: {@code number_of_replicas}
	 */
	@Nullable
	public String numberOfReplicas() {
		return this.numberOfReplicas;
	}

	/**
	 * API name: {@code number_of_routing_shards}
	 */
	@Nullable
	public Integer numberOfRoutingShards() {
		return this.numberOfRoutingShards;
	}

	/**
	 * API name: {@code check_on_startup}
	 */
	@Nullable
	public IndexCheckOnStartup checkOnStartup() {
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
	 * API name: {@code routing_partition_size}
	 */
	@Nullable
	public String routingPartitionSize() {
		return this.routingPartitionSize;
	}

	/**
	 * API name: {@code soft_deletes.retention_lease.period}
	 */
	@Nullable
	public String softDeletesRetentionLeasePeriod() {
		return this.softDeletesRetentionLeasePeriod;
	}

	/**
	 * API name: {@code load_fixed_bitset_filters_eagerly}
	 */
	@Nullable
	public Boolean loadFixedBitsetFiltersEagerly() {
		return this.loadFixedBitsetFiltersEagerly;
	}

	/**
	 * API name: {@code hidden}
	 */
	@Nullable
	public Boolean hidden() {
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
	public String searchIdleAfter() {
		return this.searchIdleAfter;
	}

	/**
	 * API name: {@code refresh_interval}
	 */
	@Nullable
	public String refreshInterval() {
		return this.refreshInterval;
	}

	/**
	 * API name: {@code max_result_window}
	 */
	@Nullable
	public Integer maxResultWindow() {
		return this.maxResultWindow;
	}

	/**
	 * API name: {@code max_inner_result_window}
	 */
	@Nullable
	public Integer maxInnerResultWindow() {
		return this.maxInnerResultWindow;
	}

	/**
	 * API name: {@code max_rescore_window}
	 */
	@Nullable
	public Integer maxRescoreWindow() {
		return this.maxRescoreWindow;
	}

	/**
	 * API name: {@code max_docvalue_fields_search}
	 */
	@Nullable
	public Integer maxDocvalueFieldsSearch() {
		return this.maxDocvalueFieldsSearch;
	}

	/**
	 * API name: {@code max_script_fields}
	 */
	@Nullable
	public Integer maxScriptFields() {
		return this.maxScriptFields;
	}

	/**
	 * API name: {@code max_ngram_diff}
	 */
	@Nullable
	public Integer maxNgramDiff() {
		return this.maxNgramDiff;
	}

	/**
	 * API name: {@code max_shingle_diff}
	 */
	@Nullable
	public Integer maxShingleDiff() {
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
	 * API name: {@code blocks.read_only}
	 */
	@Nullable
	public Boolean blocksReadOnly() {
		return this.blocksReadOnly;
	}

	/**
	 * API name: {@code blocks.read_only_allow_delete}
	 */
	@Nullable
	public Boolean blocksReadOnlyAllowDelete() {
		return this.blocksReadOnlyAllowDelete;
	}

	/**
	 * API name: {@code blocks.read}
	 */
	@Nullable
	public Boolean blocksRead() {
		return this.blocksRead;
	}

	/**
	 * API name: {@code blocks.write}
	 */
	@Nullable
	public Boolean blocksWrite() {
		return this.blocksWrite;
	}

	/**
	 * API name: {@code blocks.metadata}
	 */
	@Nullable
	public Boolean blocksMetadata() {
		return this.blocksMetadata;
	}

	/**
	 * API name: {@code max_refresh_listeners}
	 */
	@Nullable
	public Integer maxRefreshListeners() {
		return this.maxRefreshListeners;
	}

	/**
	 * API name: {@code analyze.max_token_count}
	 */
	@Nullable
	public Integer analyzeMaxTokenCount() {
		return this.analyzeMaxTokenCount;
	}

	/**
	 * API name: {@code highlight.max_analyzed_offset}
	 */
	@Nullable
	public Integer highlightMaxAnalyzedOffset() {
		return this.highlightMaxAnalyzedOffset;
	}

	/**
	 * API name: {@code max_terms_count}
	 */
	@Nullable
	public Integer maxTermsCount() {
		return this.maxTermsCount;
	}

	/**
	 * API name: {@code max_regex_length}
	 */
	@Nullable
	public Integer maxRegexLength() {
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
	public String gcDeletes() {
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
	 * API name: {@code lifecycle.name}
	 */
	@Nullable
	public String lifecycleName() {
		return this.lifecycleName;
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
	public Boolean verifiedBeforeClose() {
		return this.verifiedBeforeClose;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public String format() {
		return this.format;
	}

	/**
	 * API name: {@code max_slices_per_scroll}
	 */
	@Nullable
	public Integer maxSlicesPerScroll() {
		return this.maxSlicesPerScroll;
	}

	/**
	 * API name: {@code translog.durability}
	 */
	@Nullable
	public String translogDurability() {
		return this.translogDurability;
	}

	/**
	 * API name: {@code query_string.lenient}
	 */
	@Nullable
	public Boolean queryStringLenient() {
		return this.queryStringLenient;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public String priority() {
		return this.priority;
	}

	/**
	 * API name: {@code top_metrics_max_size}
	 */
	@Nullable
	public Integer topMetricsMaxSize() {
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
	 * API name: {@code settings}
	 */
	@Nullable
	public IndexSettings settings() {
		return this.settings;
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
			generator.write(this.numberOfRoutingShards);

		}
		if (this.checkOnStartup != null) {

			generator.writeKey("check_on_startup");
			this.checkOnStartup.serialize(generator, mapper);
		}
		if (this.codec != null) {

			generator.writeKey("codec");
			generator.write(this.codec);

		}
		if (this.routingPartitionSize != null) {

			generator.writeKey("routing_partition_size");
			generator.write(this.routingPartitionSize);

		}
		if (this.softDeletesRetentionLeasePeriod != null) {

			generator.writeKey("soft_deletes.retention_lease.period");
			generator.write(this.softDeletesRetentionLeasePeriod);

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
		if (this.searchIdleAfter != null) {

			generator.writeKey("search.idle.after");
			generator.write(this.searchIdleAfter);

		}
		if (this.refreshInterval != null) {

			generator.writeKey("refresh_interval");
			generator.write(this.refreshInterval);

		}
		if (this.maxResultWindow != null) {

			generator.writeKey("max_result_window");
			generator.write(this.maxResultWindow);

		}
		if (this.maxInnerResultWindow != null) {

			generator.writeKey("max_inner_result_window");
			generator.write(this.maxInnerResultWindow);

		}
		if (this.maxRescoreWindow != null) {

			generator.writeKey("max_rescore_window");
			generator.write(this.maxRescoreWindow);

		}
		if (this.maxDocvalueFieldsSearch != null) {

			generator.writeKey("max_docvalue_fields_search");
			generator.write(this.maxDocvalueFieldsSearch);

		}
		if (this.maxScriptFields != null) {

			generator.writeKey("max_script_fields");
			generator.write(this.maxScriptFields);

		}
		if (this.maxNgramDiff != null) {

			generator.writeKey("max_ngram_diff");
			generator.write(this.maxNgramDiff);

		}
		if (this.maxShingleDiff != null) {

			generator.writeKey("max_shingle_diff");
			generator.write(this.maxShingleDiff);

		}
		if (this.blocks != null) {

			generator.writeKey("blocks");
			this.blocks.serialize(generator, mapper);

		}
		if (this.blocksReadOnly != null) {

			generator.writeKey("blocks.read_only");
			generator.write(this.blocksReadOnly);

		}
		if (this.blocksReadOnlyAllowDelete != null) {

			generator.writeKey("blocks.read_only_allow_delete");
			generator.write(this.blocksReadOnlyAllowDelete);

		}
		if (this.blocksRead != null) {

			generator.writeKey("blocks.read");
			generator.write(this.blocksRead);

		}
		if (this.blocksWrite != null) {

			generator.writeKey("blocks.write");
			generator.write(this.blocksWrite);

		}
		if (this.blocksMetadata != null) {

			generator.writeKey("blocks.metadata");
			generator.write(this.blocksMetadata);

		}
		if (this.maxRefreshListeners != null) {

			generator.writeKey("max_refresh_listeners");
			generator.write(this.maxRefreshListeners);

		}
		if (this.analyzeMaxTokenCount != null) {

			generator.writeKey("analyze.max_token_count");
			generator.write(this.analyzeMaxTokenCount);

		}
		if (this.highlightMaxAnalyzedOffset != null) {

			generator.writeKey("highlight.max_analyzed_offset");
			generator.write(this.highlightMaxAnalyzedOffset);

		}
		if (this.maxTermsCount != null) {

			generator.writeKey("max_terms_count");
			generator.write(this.maxTermsCount);

		}
		if (this.maxRegexLength != null) {

			generator.writeKey("max_regex_length");
			generator.write(this.maxRegexLength);

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			this.routing.serialize(generator, mapper);

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
			this.lifecycle.serialize(generator, mapper);

		}
		if (this.lifecycleName != null) {

			generator.writeKey("lifecycle.name");
			generator.write(this.lifecycleName);

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
			this.version.serialize(generator, mapper);

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
			generator.write(this.maxSlicesPerScroll);

		}
		if (this.translogDurability != null) {

			generator.writeKey("translog.durability");
			generator.write(this.translogDurability);

		}
		if (this.queryStringLenient != null) {

			generator.writeKey("query_string.lenient");
			generator.write(this.queryStringLenient);

		}
		if (this.priority != null) {

			generator.writeKey("priority");
			generator.write(this.priority);

		}
		if (this.topMetricsMaxSize != null) {

			generator.writeKey("top_metrics_max_size");
			generator.write(this.topMetricsMaxSize);

		}
		if (this.analysis != null) {

			generator.writeKey("analysis");
			this.analysis.serialize(generator, mapper);

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettings}.
	 */
	public static class Builder implements ObjectBuilder<IndexSettings> {
		@Nullable
		private String numberOfShards;

		@Nullable
		private String numberOfReplicas;

		@Nullable
		private Integer numberOfRoutingShards;

		@Nullable
		private IndexCheckOnStartup checkOnStartup;

		@Nullable
		private String codec;

		@Nullable
		private String routingPartitionSize;

		@Nullable
		private String softDeletesRetentionLeasePeriod;

		@Nullable
		private Boolean loadFixedBitsetFiltersEagerly;

		@Nullable
		private Boolean hidden;

		@Nullable
		private String autoExpandReplicas;

		@Nullable
		private String searchIdleAfter;

		@Nullable
		private String refreshInterval;

		@Nullable
		private Integer maxResultWindow;

		@Nullable
		private Integer maxInnerResultWindow;

		@Nullable
		private Integer maxRescoreWindow;

		@Nullable
		private Integer maxDocvalueFieldsSearch;

		@Nullable
		private Integer maxScriptFields;

		@Nullable
		private Integer maxNgramDiff;

		@Nullable
		private Integer maxShingleDiff;

		@Nullable
		private IndexSettingBlocks blocks;

		@Nullable
		private Boolean blocksReadOnly;

		@Nullable
		private Boolean blocksReadOnlyAllowDelete;

		@Nullable
		private Boolean blocksRead;

		@Nullable
		private Boolean blocksWrite;

		@Nullable
		private Boolean blocksMetadata;

		@Nullable
		private Integer maxRefreshListeners;

		@Nullable
		private Integer analyzeMaxTokenCount;

		@Nullable
		private Integer highlightMaxAnalyzedOffset;

		@Nullable
		private Integer maxTermsCount;

		@Nullable
		private Integer maxRegexLength;

		@Nullable
		private IndexRouting routing;

		@Nullable
		private String gcDeletes;

		@Nullable
		private String defaultPipeline;

		@Nullable
		private String finalPipeline;

		@Nullable
		private IndexSettingsLifecycle lifecycle;

		@Nullable
		private String lifecycleName;

		@Nullable
		private String providedName;

		@Nullable
		private String creationDate;

		@Nullable
		private String uuid;

		@Nullable
		private IndexVersioning version;

		@Nullable
		private Boolean verifiedBeforeClose;

		@Nullable
		private String format;

		@Nullable
		private Integer maxSlicesPerScroll;

		@Nullable
		private String translogDurability;

		@Nullable
		private Boolean queryStringLenient;

		@Nullable
		private String priority;

		@Nullable
		private Integer topMetricsMaxSize;

		@Nullable
		private IndexSettingsAnalysis analysis;

		@Nullable
		private IndexSettings settings;

		/**
		 * API name: {@code number_of_shards}
		 */
		public Builder numberOfShards(@Nullable String value) {
			this.numberOfShards = value;
			return this;
		}

		/**
		 * API name: {@code number_of_replicas}
		 */
		public Builder numberOfReplicas(@Nullable String value) {
			this.numberOfReplicas = value;
			return this;
		}

		/**
		 * API name: {@code number_of_routing_shards}
		 */
		public Builder numberOfRoutingShards(@Nullable Integer value) {
			this.numberOfRoutingShards = value;
			return this;
		}

		/**
		 * API name: {@code check_on_startup}
		 */
		public Builder checkOnStartup(@Nullable IndexCheckOnStartup value) {
			this.checkOnStartup = value;
			return this;
		}

		/**
		 * API name: {@code codec}
		 */
		public Builder codec(@Nullable String value) {
			this.codec = value;
			return this;
		}

		/**
		 * API name: {@code routing_partition_size}
		 */
		public Builder routingPartitionSize(@Nullable String value) {
			this.routingPartitionSize = value;
			return this;
		}

		/**
		 * API name: {@code soft_deletes.retention_lease.period}
		 */
		public Builder softDeletesRetentionLeasePeriod(@Nullable String value) {
			this.softDeletesRetentionLeasePeriod = value;
			return this;
		}

		/**
		 * API name: {@code load_fixed_bitset_filters_eagerly}
		 */
		public Builder loadFixedBitsetFiltersEagerly(@Nullable Boolean value) {
			this.loadFixedBitsetFiltersEagerly = value;
			return this;
		}

		/**
		 * API name: {@code hidden}
		 */
		public Builder hidden(@Nullable Boolean value) {
			this.hidden = value;
			return this;
		}

		/**
		 * API name: {@code auto_expand_replicas}
		 */
		public Builder autoExpandReplicas(@Nullable String value) {
			this.autoExpandReplicas = value;
			return this;
		}

		/**
		 * API name: {@code search.idle.after}
		 */
		public Builder searchIdleAfter(@Nullable String value) {
			this.searchIdleAfter = value;
			return this;
		}

		/**
		 * API name: {@code refresh_interval}
		 */
		public Builder refreshInterval(@Nullable String value) {
			this.refreshInterval = value;
			return this;
		}

		/**
		 * API name: {@code max_result_window}
		 */
		public Builder maxResultWindow(@Nullable Integer value) {
			this.maxResultWindow = value;
			return this;
		}

		/**
		 * API name: {@code max_inner_result_window}
		 */
		public Builder maxInnerResultWindow(@Nullable Integer value) {
			this.maxInnerResultWindow = value;
			return this;
		}

		/**
		 * API name: {@code max_rescore_window}
		 */
		public Builder maxRescoreWindow(@Nullable Integer value) {
			this.maxRescoreWindow = value;
			return this;
		}

		/**
		 * API name: {@code max_docvalue_fields_search}
		 */
		public Builder maxDocvalueFieldsSearch(@Nullable Integer value) {
			this.maxDocvalueFieldsSearch = value;
			return this;
		}

		/**
		 * API name: {@code max_script_fields}
		 */
		public Builder maxScriptFields(@Nullable Integer value) {
			this.maxScriptFields = value;
			return this;
		}

		/**
		 * API name: {@code max_ngram_diff}
		 */
		public Builder maxNgramDiff(@Nullable Integer value) {
			this.maxNgramDiff = value;
			return this;
		}

		/**
		 * API name: {@code max_shingle_diff}
		 */
		public Builder maxShingleDiff(@Nullable Integer value) {
			this.maxShingleDiff = value;
			return this;
		}

		/**
		 * API name: {@code blocks}
		 */
		public Builder blocks(@Nullable IndexSettingBlocks value) {
			this.blocks = value;
			return this;
		}

		/**
		 * API name: {@code blocks}
		 */
		public Builder blocks(Function<IndexSettingBlocks.Builder, ObjectBuilder<IndexSettingBlocks>> fn) {
			return this.blocks(fn.apply(new IndexSettingBlocks.Builder()).build());
		}

		/**
		 * API name: {@code blocks.read_only}
		 */
		public Builder blocksReadOnly(@Nullable Boolean value) {
			this.blocksReadOnly = value;
			return this;
		}

		/**
		 * API name: {@code blocks.read_only_allow_delete}
		 */
		public Builder blocksReadOnlyAllowDelete(@Nullable Boolean value) {
			this.blocksReadOnlyAllowDelete = value;
			return this;
		}

		/**
		 * API name: {@code blocks.read}
		 */
		public Builder blocksRead(@Nullable Boolean value) {
			this.blocksRead = value;
			return this;
		}

		/**
		 * API name: {@code blocks.write}
		 */
		public Builder blocksWrite(@Nullable Boolean value) {
			this.blocksWrite = value;
			return this;
		}

		/**
		 * API name: {@code blocks.metadata}
		 */
		public Builder blocksMetadata(@Nullable Boolean value) {
			this.blocksMetadata = value;
			return this;
		}

		/**
		 * API name: {@code max_refresh_listeners}
		 */
		public Builder maxRefreshListeners(@Nullable Integer value) {
			this.maxRefreshListeners = value;
			return this;
		}

		/**
		 * API name: {@code analyze.max_token_count}
		 */
		public Builder analyzeMaxTokenCount(@Nullable Integer value) {
			this.analyzeMaxTokenCount = value;
			return this;
		}

		/**
		 * API name: {@code highlight.max_analyzed_offset}
		 */
		public Builder highlightMaxAnalyzedOffset(@Nullable Integer value) {
			this.highlightMaxAnalyzedOffset = value;
			return this;
		}

		/**
		 * API name: {@code max_terms_count}
		 */
		public Builder maxTermsCount(@Nullable Integer value) {
			this.maxTermsCount = value;
			return this;
		}

		/**
		 * API name: {@code max_regex_length}
		 */
		public Builder maxRegexLength(@Nullable Integer value) {
			this.maxRegexLength = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable IndexRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(Function<IndexRouting.Builder, ObjectBuilder<IndexRouting>> fn) {
			return this.routing(fn.apply(new IndexRouting.Builder()).build());
		}

		/**
		 * API name: {@code gc_deletes}
		 */
		public Builder gcDeletes(@Nullable String value) {
			this.gcDeletes = value;
			return this;
		}

		/**
		 * API name: {@code default_pipeline}
		 */
		public Builder defaultPipeline(@Nullable String value) {
			this.defaultPipeline = value;
			return this;
		}

		/**
		 * API name: {@code final_pipeline}
		 */
		public Builder finalPipeline(@Nullable String value) {
			this.finalPipeline = value;
			return this;
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public Builder lifecycle(@Nullable IndexSettingsLifecycle value) {
			this.lifecycle = value;
			return this;
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public Builder lifecycle(Function<IndexSettingsLifecycle.Builder, ObjectBuilder<IndexSettingsLifecycle>> fn) {
			return this.lifecycle(fn.apply(new IndexSettingsLifecycle.Builder()).build());
		}

		/**
		 * API name: {@code lifecycle.name}
		 */
		public Builder lifecycleName(@Nullable String value) {
			this.lifecycleName = value;
			return this;
		}

		/**
		 * API name: {@code provided_name}
		 */
		public Builder providedName(@Nullable String value) {
			this.providedName = value;
			return this;
		}

		/**
		 * API name: {@code creation_date}
		 */
		public Builder creationDate(@Nullable String value) {
			this.creationDate = value;
			return this;
		}

		/**
		 * API name: {@code uuid}
		 */
		public Builder uuid(@Nullable String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable IndexVersioning value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Function<IndexVersioning.Builder, ObjectBuilder<IndexVersioning>> fn) {
			return this.version(fn.apply(new IndexVersioning.Builder()).build());
		}

		/**
		 * API name: {@code verified_before_close}
		 */
		public Builder verifiedBeforeClose(@Nullable Boolean value) {
			this.verifiedBeforeClose = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code max_slices_per_scroll}
		 */
		public Builder maxSlicesPerScroll(@Nullable Integer value) {
			this.maxSlicesPerScroll = value;
			return this;
		}

		/**
		 * API name: {@code translog.durability}
		 */
		public Builder translogDurability(@Nullable String value) {
			this.translogDurability = value;
			return this;
		}

		/**
		 * API name: {@code query_string.lenient}
		 */
		public Builder queryStringLenient(@Nullable Boolean value) {
			this.queryStringLenient = value;
			return this;
		}

		/**
		 * API name: {@code priority}
		 */
		public Builder priority(@Nullable String value) {
			this.priority = value;
			return this;
		}

		/**
		 * API name: {@code top_metrics_max_size}
		 */
		public Builder topMetricsMaxSize(@Nullable Integer value) {
			this.topMetricsMaxSize = value;
			return this;
		}

		/**
		 * API name: {@code analysis}
		 */
		public Builder analysis(@Nullable IndexSettingsAnalysis value) {
			this.analysis = value;
			return this;
		}

		/**
		 * API name: {@code analysis}
		 */
		public Builder analysis(Function<IndexSettingsAnalysis.Builder, ObjectBuilder<IndexSettingsAnalysis>> fn) {
			return this.analysis(fn.apply(new IndexSettingsAnalysis.Builder()).build());
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSettings}
	 */
	public static final JsonpDeserializer<IndexSettings> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexSettings::setupIndexSettingsDeserializer, Builder::build);

	protected static void setupIndexSettingsDeserializer(DelegatingDeserializer<IndexSettings.Builder> op) {

		op.add(Builder::numberOfShards, JsonpDeserializer.stringDeserializer(), "number_of_shards",
				"index.number_of_shards");
		op.add(Builder::numberOfReplicas, JsonpDeserializer.stringDeserializer(), "number_of_replicas",
				"index.number_of_replicas");
		op.add(Builder::numberOfRoutingShards, JsonpDeserializer.integerDeserializer(), "number_of_routing_shards",
				"index.number_of_routing_shards");
		op.add(Builder::checkOnStartup, IndexCheckOnStartup._DESERIALIZER, "check_on_startup",
				"index.check_on_startup");
		op.add(Builder::codec, JsonpDeserializer.stringDeserializer(), "codec", "index.codec");
		op.add(Builder::routingPartitionSize, JsonpDeserializer.stringDeserializer(), "routing_partition_size",
				"index.routing_partition_size");
		op.add(Builder::softDeletesRetentionLeasePeriod, JsonpDeserializer.stringDeserializer(),
				"soft_deletes.retention_lease.period", "index.soft_deletes.retention_lease.period");
		op.add(Builder::loadFixedBitsetFiltersEagerly, JsonpDeserializer.booleanDeserializer(),
				"load_fixed_bitset_filters_eagerly", "index.load_fixed_bitset_filters_eagerly");
		op.add(Builder::hidden, JsonpDeserializer.booleanDeserializer(), "hidden", "index.hidden");
		op.add(Builder::autoExpandReplicas, JsonpDeserializer.stringDeserializer(), "auto_expand_replicas",
				"index.auto_expand_replicas");
		op.add(Builder::searchIdleAfter, JsonpDeserializer.stringDeserializer(), "search.idle.after",
				"index.search.idle.after");
		op.add(Builder::refreshInterval, JsonpDeserializer.stringDeserializer(), "refresh_interval",
				"index.refresh_interval");
		op.add(Builder::maxResultWindow, JsonpDeserializer.integerDeserializer(), "max_result_window",
				"index.max_result_window");
		op.add(Builder::maxInnerResultWindow, JsonpDeserializer.integerDeserializer(), "max_inner_result_window",
				"index.max_inner_result_window");
		op.add(Builder::maxRescoreWindow, JsonpDeserializer.integerDeserializer(), "max_rescore_window",
				"index.max_rescore_window");
		op.add(Builder::maxDocvalueFieldsSearch, JsonpDeserializer.integerDeserializer(), "max_docvalue_fields_search",
				"index.max_docvalue_fields_search");
		op.add(Builder::maxScriptFields, JsonpDeserializer.integerDeserializer(), "max_script_fields",
				"index.max_script_fields");
		op.add(Builder::maxNgramDiff, JsonpDeserializer.integerDeserializer(), "max_ngram_diff",
				"index.max_ngram_diff");
		op.add(Builder::maxShingleDiff, JsonpDeserializer.integerDeserializer(), "max_shingle_diff",
				"index.max_shingle_diff");
		op.add(Builder::blocks, IndexSettingBlocks._DESERIALIZER, "blocks", "index.blocks");
		op.add(Builder::blocksReadOnly, JsonpDeserializer.booleanDeserializer(), "blocks.read_only",
				"index.blocks.read_only");
		op.add(Builder::blocksReadOnlyAllowDelete, JsonpDeserializer.booleanDeserializer(),
				"blocks.read_only_allow_delete", "index.blocks.read_only_allow_delete");
		op.add(Builder::blocksRead, JsonpDeserializer.booleanDeserializer(), "blocks.read", "index.blocks.read");
		op.add(Builder::blocksWrite, JsonpDeserializer.booleanDeserializer(), "blocks.write", "index.blocks.write");
		op.add(Builder::blocksMetadata, JsonpDeserializer.booleanDeserializer(), "blocks.metadata",
				"index.blocks.metadata");
		op.add(Builder::maxRefreshListeners, JsonpDeserializer.integerDeserializer(), "max_refresh_listeners",
				"index.max_refresh_listeners");
		op.add(Builder::analyzeMaxTokenCount, JsonpDeserializer.integerDeserializer(), "analyze.max_token_count",
				"index.analyze.max_token_count");
		op.add(Builder::highlightMaxAnalyzedOffset, JsonpDeserializer.integerDeserializer(),
				"highlight.max_analyzed_offset", "index.highlight.max_analyzed_offset");
		op.add(Builder::maxTermsCount, JsonpDeserializer.integerDeserializer(), "max_terms_count",
				"index.max_terms_count");
		op.add(Builder::maxRegexLength, JsonpDeserializer.integerDeserializer(), "max_regex_length",
				"index.max_regex_length");
		op.add(Builder::routing, IndexRouting._DESERIALIZER, "routing", "index.routing");
		op.add(Builder::gcDeletes, JsonpDeserializer.stringDeserializer(), "gc_deletes", "index.gc_deletes");
		op.add(Builder::defaultPipeline, JsonpDeserializer.stringDeserializer(), "default_pipeline",
				"index.default_pipeline");
		op.add(Builder::finalPipeline, JsonpDeserializer.stringDeserializer(), "final_pipeline",
				"index.final_pipeline");
		op.add(Builder::lifecycle, IndexSettingsLifecycle._DESERIALIZER, "lifecycle", "index.lifecycle");
		op.add(Builder::lifecycleName, JsonpDeserializer.stringDeserializer(), "lifecycle.name",
				"index.lifecycle.name");
		op.add(Builder::providedName, JsonpDeserializer.stringDeserializer(), "provided_name", "index.provided_name");
		op.add(Builder::creationDate, JsonpDeserializer.stringDeserializer(), "creation_date", "index.creation_date");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid", "index.uuid");
		op.add(Builder::version, IndexVersioning._DESERIALIZER, "version", "index.version");
		op.add(Builder::verifiedBeforeClose, JsonpDeserializer.booleanDeserializer(), "verified_before_close",
				"index.verified_before_close");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format", "index.format");
		op.add(Builder::maxSlicesPerScroll, JsonpDeserializer.integerDeserializer(), "max_slices_per_scroll",
				"index.max_slices_per_scroll");
		op.add(Builder::translogDurability, JsonpDeserializer.stringDeserializer(), "translog.durability",
				"index.translog.durability");
		op.add(Builder::queryStringLenient, JsonpDeserializer.booleanDeserializer(), "query_string.lenient",
				"index.query_string.lenient");
		op.add(Builder::priority, JsonpDeserializer.stringDeserializer(), "priority", "index.priority");
		op.add(Builder::topMetricsMaxSize, JsonpDeserializer.integerDeserializer(), "top_metrics_max_size");
		op.add(Builder::analysis, IndexSettingsAnalysis._DESERIALIZER, "analysis");
		op.add(Builder::settings, IndexSettings._DESERIALIZER, "settings");

	}

}
