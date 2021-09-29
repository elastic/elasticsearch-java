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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.elasticsearch._types.CompletionStats;
import co.elastic.clients.elasticsearch._types.DocStats;
import co.elastic.clients.elasticsearch._types.FielddataStats;
import co.elastic.clients.elasticsearch._types.QueryCacheStats;
import co.elastic.clients.elasticsearch._types.SegmentsStats;
import co.elastic.clients.elasticsearch._types.StoreStats;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterIndices
@JsonpDeserializable
public final class ClusterIndices implements JsonpSerializable {
	private final CompletionStats completion;

	private final long count;

	private final DocStats docs;

	private final FielddataStats fielddata;

	private final QueryCacheStats queryCache;

	private final SegmentsStats segments;

	private final ClusterIndicesShards shards;

	private final StoreStats store;

	private final FieldTypesMappings mappings;

	private final CharFilterTypes analysis;

	@Nullable
	private final List<IndicesVersions> versions;

	// ---------------------------------------------------------------------------------------------

	public ClusterIndices(Builder builder) {

		this.completion = Objects.requireNonNull(builder.completion, "completion");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.docs = Objects.requireNonNull(builder.docs, "docs");
		this.fielddata = Objects.requireNonNull(builder.fielddata, "fielddata");
		this.queryCache = Objects.requireNonNull(builder.queryCache, "query_cache");
		this.segments = Objects.requireNonNull(builder.segments, "segments");
		this.shards = Objects.requireNonNull(builder.shards, "shards");
		this.store = Objects.requireNonNull(builder.store, "store");
		this.mappings = Objects.requireNonNull(builder.mappings, "mappings");
		this.analysis = Objects.requireNonNull(builder.analysis, "analysis");
		this.versions = ModelTypeHelper.unmodifiable(builder.versions);

	}

	public ClusterIndices(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Contains statistics about memory used for completion in selected nodes.
	 * <p>
	 * API name: {@code completion}
	 */
	public CompletionStats completion() {
		return this.completion;
	}

	/**
	 * Total number of indices with shards assigned to selected nodes.
	 * <p>
	 * API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * Contains counts for documents in selected nodes.
	 * <p>
	 * API name: {@code docs}
	 */
	public DocStats docs() {
		return this.docs;
	}

	/**
	 * Contains statistics about the field data cache of selected nodes.
	 * <p>
	 * API name: {@code fielddata}
	 */
	public FielddataStats fielddata() {
		return this.fielddata;
	}

	/**
	 * Contains statistics about the query cache of selected nodes.
	 * <p>
	 * API name: {@code query_cache}
	 */
	public QueryCacheStats queryCache() {
		return this.queryCache;
	}

	/**
	 * Contains statistics about segments in selected nodes.
	 * <p>
	 * API name: {@code segments}
	 */
	public SegmentsStats segments() {
		return this.segments;
	}

	/**
	 * Contains statistics about indices with shards assigned to selected nodes.
	 * <p>
	 * API name: {@code shards}
	 */
	public ClusterIndicesShards shards() {
		return this.shards;
	}

	/**
	 * Contains statistics about the size of shards assigned to selected nodes.
	 * <p>
	 * API name: {@code store}
	 */
	public StoreStats store() {
		return this.store;
	}

	/**
	 * Contains statistics about field mappings in selected nodes.
	 * <p>
	 * API name: {@code mappings}
	 */
	public FieldTypesMappings mappings() {
		return this.mappings;
	}

	/**
	 * Contains statistics about analyzers and analyzer components used in selected
	 * nodes.
	 * <p>
	 * API name: {@code analysis}
	 */
	public CharFilterTypes analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code versions}
	 */
	@Nullable
	public List<IndicesVersions> versions() {
		return this.versions;
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

		generator.writeKey("completion");
		this.completion.serialize(generator, mapper);

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("docs");
		this.docs.serialize(generator, mapper);

		generator.writeKey("fielddata");
		this.fielddata.serialize(generator, mapper);

		generator.writeKey("query_cache");
		this.queryCache.serialize(generator, mapper);

		generator.writeKey("segments");
		this.segments.serialize(generator, mapper);

		generator.writeKey("shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("store");
		this.store.serialize(generator, mapper);

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

		generator.writeKey("analysis");
		this.analysis.serialize(generator, mapper);

		if (this.versions != null) {

			generator.writeKey("versions");
			generator.writeStartArray();
			for (IndicesVersions item0 : this.versions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterIndices}.
	 */
	public static class Builder implements ObjectBuilder<ClusterIndices> {
		private CompletionStats completion;

		private Long count;

		private DocStats docs;

		private FielddataStats fielddata;

		private QueryCacheStats queryCache;

		private SegmentsStats segments;

		private ClusterIndicesShards shards;

		private StoreStats store;

		private FieldTypesMappings mappings;

		private CharFilterTypes analysis;

		@Nullable
		private List<IndicesVersions> versions;

		/**
		 * Contains statistics about memory used for completion in selected nodes.
		 * <p>
		 * API name: {@code completion}
		 */
		public Builder completion(CompletionStats value) {
			this.completion = value;
			return this;
		}

		/**
		 * Contains statistics about memory used for completion in selected nodes.
		 * <p>
		 * API name: {@code completion}
		 */
		public Builder completion(Function<CompletionStats.Builder, ObjectBuilder<CompletionStats>> fn) {
			return this.completion(fn.apply(new CompletionStats.Builder()).build());
		}

		/**
		 * Total number of indices with shards assigned to selected nodes.
		 * <p>
		 * API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Contains counts for documents in selected nodes.
		 * <p>
		 * API name: {@code docs}
		 */
		public Builder docs(DocStats value) {
			this.docs = value;
			return this;
		}

		/**
		 * Contains counts for documents in selected nodes.
		 * <p>
		 * API name: {@code docs}
		 */
		public Builder docs(Function<DocStats.Builder, ObjectBuilder<DocStats>> fn) {
			return this.docs(fn.apply(new DocStats.Builder()).build());
		}

		/**
		 * Contains statistics about the field data cache of selected nodes.
		 * <p>
		 * API name: {@code fielddata}
		 */
		public Builder fielddata(FielddataStats value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * Contains statistics about the field data cache of selected nodes.
		 * <p>
		 * API name: {@code fielddata}
		 */
		public Builder fielddata(Function<FielddataStats.Builder, ObjectBuilder<FielddataStats>> fn) {
			return this.fielddata(fn.apply(new FielddataStats.Builder()).build());
		}

		/**
		 * Contains statistics about the query cache of selected nodes.
		 * <p>
		 * API name: {@code query_cache}
		 */
		public Builder queryCache(QueryCacheStats value) {
			this.queryCache = value;
			return this;
		}

		/**
		 * Contains statistics about the query cache of selected nodes.
		 * <p>
		 * API name: {@code query_cache}
		 */
		public Builder queryCache(Function<QueryCacheStats.Builder, ObjectBuilder<QueryCacheStats>> fn) {
			return this.queryCache(fn.apply(new QueryCacheStats.Builder()).build());
		}

		/**
		 * Contains statistics about segments in selected nodes.
		 * <p>
		 * API name: {@code segments}
		 */
		public Builder segments(SegmentsStats value) {
			this.segments = value;
			return this;
		}

		/**
		 * Contains statistics about segments in selected nodes.
		 * <p>
		 * API name: {@code segments}
		 */
		public Builder segments(Function<SegmentsStats.Builder, ObjectBuilder<SegmentsStats>> fn) {
			return this.segments(fn.apply(new SegmentsStats.Builder()).build());
		}

		/**
		 * Contains statistics about indices with shards assigned to selected nodes.
		 * <p>
		 * API name: {@code shards}
		 */
		public Builder shards(ClusterIndicesShards value) {
			this.shards = value;
			return this;
		}

		/**
		 * Contains statistics about indices with shards assigned to selected nodes.
		 * <p>
		 * API name: {@code shards}
		 */
		public Builder shards(Function<ClusterIndicesShards.Builder, ObjectBuilder<ClusterIndicesShards>> fn) {
			return this.shards(fn.apply(new ClusterIndicesShards.Builder()).build());
		}

		/**
		 * Contains statistics about the size of shards assigned to selected nodes.
		 * <p>
		 * API name: {@code store}
		 */
		public Builder store(StoreStats value) {
			this.store = value;
			return this;
		}

		/**
		 * Contains statistics about the size of shards assigned to selected nodes.
		 * <p>
		 * API name: {@code store}
		 */
		public Builder store(Function<StoreStats.Builder, ObjectBuilder<StoreStats>> fn) {
			return this.store(fn.apply(new StoreStats.Builder()).build());
		}

		/**
		 * Contains statistics about field mappings in selected nodes.
		 * <p>
		 * API name: {@code mappings}
		 */
		public Builder mappings(FieldTypesMappings value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Contains statistics about field mappings in selected nodes.
		 * <p>
		 * API name: {@code mappings}
		 */
		public Builder mappings(Function<FieldTypesMappings.Builder, ObjectBuilder<FieldTypesMappings>> fn) {
			return this.mappings(fn.apply(new FieldTypesMappings.Builder()).build());
		}

		/**
		 * Contains statistics about analyzers and analyzer components used in selected
		 * nodes.
		 * <p>
		 * API name: {@code analysis}
		 */
		public Builder analysis(CharFilterTypes value) {
			this.analysis = value;
			return this;
		}

		/**
		 * Contains statistics about analyzers and analyzer components used in selected
		 * nodes.
		 * <p>
		 * API name: {@code analysis}
		 */
		public Builder analysis(Function<CharFilterTypes.Builder, ObjectBuilder<CharFilterTypes>> fn) {
			return this.analysis(fn.apply(new CharFilterTypes.Builder()).build());
		}

		/**
		 * API name: {@code versions}
		 */
		public Builder versions(@Nullable List<IndicesVersions> value) {
			this.versions = value;
			return this;
		}

		/**
		 * API name: {@code versions}
		 */
		public Builder versions(IndicesVersions... value) {
			this.versions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #versions(List)}, creating the list if needed. 4
		 */
		public Builder addVersions(IndicesVersions value) {
			if (this.versions == null) {
				this.versions = new ArrayList<>();
			}
			this.versions.add(value);
			return this;
		}

		/**
		 * Set {@link #versions(List)} to a singleton list.
		 */
		public Builder versions(Function<IndicesVersions.Builder, ObjectBuilder<IndicesVersions>> fn) {
			return this.versions(fn.apply(new IndicesVersions.Builder()).build());
		}

		/**
		 * Add a value to {@link #versions(List)}, creating the list if needed. 5
		 */
		public Builder addVersions(Function<IndicesVersions.Builder, ObjectBuilder<IndicesVersions>> fn) {
			return this.addVersions(fn.apply(new IndicesVersions.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterIndices}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterIndices build() {

			return new ClusterIndices(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterIndices}
	 */
	public static final JsonpDeserializer<ClusterIndices> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterIndices::setupClusterIndicesDeserializer, Builder::build);

	protected static void setupClusterIndicesDeserializer(DelegatingDeserializer<ClusterIndices.Builder> op) {

		op.add(Builder::completion, CompletionStats._DESERIALIZER, "completion");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::docs, DocStats._DESERIALIZER, "docs");
		op.add(Builder::fielddata, FielddataStats._DESERIALIZER, "fielddata");
		op.add(Builder::queryCache, QueryCacheStats._DESERIALIZER, "query_cache");
		op.add(Builder::segments, SegmentsStats._DESERIALIZER, "segments");
		op.add(Builder::shards, ClusterIndicesShards._DESERIALIZER, "shards");
		op.add(Builder::store, StoreStats._DESERIALIZER, "store");
		op.add(Builder::mappings, FieldTypesMappings._DESERIALIZER, "mappings");
		op.add(Builder::analysis, CharFilterTypes._DESERIALIZER, "analysis");
		op.add(Builder::versions, JsonpDeserializer.arrayDeserializer(IndicesVersions._DESERIALIZER), "versions");

	}

}
