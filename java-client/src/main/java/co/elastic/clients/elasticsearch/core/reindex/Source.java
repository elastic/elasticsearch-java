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

package co.elastic.clients.elasticsearch.core.reindex;

import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _global.reindex.Source

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.reindex.Source">API
 *      specification</a>
 */
@JsonpDeserializable
public class Source implements JsonpSerializable {
	private final List<String> index;

	@Nullable
	private final Query query;

	@Nullable
	private final RemoteSource remote;

	@Nullable
	private final Integer size;

	@Nullable
	private final SlicedScroll slice;

	private final List<SortOptions> sort;

	private final List<String> sourceFields;

	private final Map<String, RuntimeField> runtimeMappings;

	// ---------------------------------------------------------------------------------------------

	private Source(Builder builder) {

		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.query = builder.query;
		this.remote = builder.remote;
		this.size = builder.size;
		this.slice = builder.slice;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.sourceFields = ApiTypeHelper.unmodifiable(builder.sourceFields);
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);

	}

	public static Source of(Function<Builder, ObjectBuilder<Source>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the data stream, index, or alias you are copying from.
	 * It accepts a comma-separated list to reindex from multiple sources.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * The documents to reindex, which is defined with Query DSL.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * A remote instance of Elasticsearch that you want to index from.
	 * <p>
	 * API name: {@code remote}
	 */
	@Nullable
	public final RemoteSource remote() {
		return this.remote;
	}

	/**
	 * The number of documents to index per batch. Use it when you are indexing from
	 * remote to ensure that the batches fit within the on-heap buffer, which
	 * defaults to a maximum size of 100 MB.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Slice the reindex request manually using the provided slice ID and total
	 * number of slices.
	 * <p>
	 * API name: {@code slice}
	 */
	@Nullable
	public final SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * A comma-separated list of <code>&lt;field&gt;:&lt;direction&gt;</code> pairs
	 * to sort by before indexing. Use it in conjunction with <code>max_docs</code>
	 * to control what documents are reindexed.
	 * <p>
	 * WARNING: Sort in reindex is deprecated. Sorting in reindex was never
	 * guaranteed to index documents in order and prevents further development of
	 * reindex such as resilience and performance improvements. If used in
	 * combination with <code>max_docs</code>, consider using a query filter
	 * instead.
	 * <p>
	 * API name: {@code sort}
	 * 
	 * @deprecated 7.6.0
	 */
	@Deprecated
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * If <code>true</code>, reindex all source fields. Set it to a list to reindex
	 * select fields.
	 * <p>
	 * API name: {@code _source}
	 */
	public final List<String> sourceFields() {
		return this.sourceFields;
	}

	/**
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
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

		if (ApiTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (String item0 : this.index) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.remote != null) {
			generator.writeKey("remote");
			this.remote.serialize(generator, mapper);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.slice != null) {
			generator.writeKey("slice");
			this.slice.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.sourceFields)) {
			generator.writeKey("_source");
			generator.writeStartArray();
			for (String item0 : this.sourceFields) {
				generator.write(item0);

			}
			generator.writeEnd();

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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Source}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Source> {
		private List<String> index;

		@Nullable
		private Query query;

		@Nullable
		private RemoteSource remote;

		@Nullable
		private Integer size;

		@Nullable
		private SlicedScroll slice;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private List<String> sourceFields;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		/**
		 * Required - The name of the data stream, index, or alias you are copying from.
		 * It accepts a comma-separated list to reindex from multiple sources.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - The name of the data stream, index, or alias you are copying from.
		 * It accepts a comma-separated list to reindex from multiple sources.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * The documents to reindex, which is defined with Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * The documents to reindex, which is defined with Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * The documents to reindex, which is defined with Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(QueryVariant value) {
			this.query = value._toQuery();
			return this;
		}

		/**
		 * A remote instance of Elasticsearch that you want to index from.
		 * <p>
		 * API name: {@code remote}
		 */
		public final Builder remote(@Nullable RemoteSource value) {
			this.remote = value;
			return this;
		}

		/**
		 * A remote instance of Elasticsearch that you want to index from.
		 * <p>
		 * API name: {@code remote}
		 */
		public final Builder remote(Function<RemoteSource.Builder, ObjectBuilder<RemoteSource>> fn) {
			return this.remote(fn.apply(new RemoteSource.Builder()).build());
		}

		/**
		 * The number of documents to index per batch. Use it when you are indexing from
		 * remote to ensure that the batches fit within the on-heap buffer, which
		 * defaults to a maximum size of 100 MB.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Slice the reindex request manually using the provided slice ID and total
		 * number of slices.
		 * <p>
		 * API name: {@code slice}
		 */
		public final Builder slice(@Nullable SlicedScroll value) {
			this.slice = value;
			return this;
		}

		/**
		 * Slice the reindex request manually using the provided slice ID and total
		 * number of slices.
		 * <p>
		 * API name: {@code slice}
		 */
		public final Builder slice(Function<SlicedScroll.Builder, ObjectBuilder<SlicedScroll>> fn) {
			return this.slice(fn.apply(new SlicedScroll.Builder()).build());
		}

		/**
		 * A comma-separated list of <code>&lt;field&gt;:&lt;direction&gt;</code> pairs
		 * to sort by before indexing. Use it in conjunction with <code>max_docs</code>
		 * to control what documents are reindexed.
		 * <p>
		 * WARNING: Sort in reindex is deprecated. Sorting in reindex was never
		 * guaranteed to index documents in order and prevents further development of
		 * reindex such as resilience and performance improvements. If used in
		 * combination with <code>max_docs</code>, consider using a query filter
		 * instead.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 * 
		 * @deprecated 7.6.0
		 */
		@Deprecated
		public final Builder sort(List<SortOptions> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * A comma-separated list of <code>&lt;field&gt;:&lt;direction&gt;</code> pairs
		 * to sort by before indexing. Use it in conjunction with <code>max_docs</code>
		 * to control what documents are reindexed.
		 * <p>
		 * WARNING: Sort in reindex is deprecated. Sorting in reindex was never
		 * guaranteed to index documents in order and prevents further development of
		 * reindex such as resilience and performance improvements. If used in
		 * combination with <code>max_docs</code>, consider using a query filter
		 * instead.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 * 
		 * @deprecated 7.6.0
		 */
		@Deprecated
		public final Builder sort(SortOptions value, SortOptions... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * A comma-separated list of <code>&lt;field&gt;:&lt;direction&gt;</code> pairs
		 * to sort by before indexing. Use it in conjunction with <code>max_docs</code>
		 * to control what documents are reindexed.
		 * <p>
		 * WARNING: Sort in reindex is deprecated. Sorting in reindex was never
		 * guaranteed to index documents in order and prevents further development of
		 * reindex such as resilience and performance improvements. If used in
		 * combination with <code>max_docs</code>, consider using a query filter
		 * instead.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 * 
		 * @deprecated 7.6.0
		 */
		@Deprecated
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		/**
		 * If <code>true</code>, reindex all source fields. Set it to a list to reindex
		 * select fields.
		 * <p>
		 * API name: {@code _source}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sourceFields</code>.
		 */
		public final Builder sourceFields(List<String> list) {
			this.sourceFields = _listAddAll(this.sourceFields, list);
			return this;
		}

		/**
		 * If <code>true</code>, reindex all source fields. Set it to a list to reindex
		 * select fields.
		 * <p>
		 * API name: {@code _source}
		 * <p>
		 * Adds one or more values to <code>sourceFields</code>.
		 */
		public final Builder sourceFields(String value, String... values) {
			this.sourceFields = _listAdd(this.sourceFields, value, values);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Source}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Source build() {
			_checkSingleUse();

			return new Source(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Source}
	 */
	public static final JsonpDeserializer<Source> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Source::setupSourceDeserializer);

	protected static void setupSourceDeserializer(ObjectDeserializer<Source.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::remote, RemoteSource._DESERIALIZER, "remote");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::slice, SlicedScroll._DESERIALIZER, "slice");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");
		op.add(Builder::sourceFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"_source");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");

	}

}
