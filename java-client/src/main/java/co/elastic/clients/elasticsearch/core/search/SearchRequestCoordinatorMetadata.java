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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch.core.SearchRequest;
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
import java.lang.String;
import java.util.List;
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

// typedef: _global.search._types.SearchRequestCoordinatorMetadata

/**
 * Coordinator snapshot of the original search request, serialized under
 * <code>profile.request</code> when profiling is enabled. Introduced in
 * Elasticsearch 9.5; omitted when the cluster contains mixed-version nodes that
 * do not serialize this metadata.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.SearchRequestCoordinatorMetadata">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchRequestCoordinatorMetadata implements JsonpSerializable {
	@Nullable
	private final SearchRequestBody source;

	private final List<String> indices;

	// ---------------------------------------------------------------------------------------------

	private SearchRequestCoordinatorMetadata(Builder builder) {

		this.source = builder.source;
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);

	}

	public static SearchRequestCoordinatorMetadata of(
			Function<Builder, ObjectBuilder<SearchRequestCoordinatorMetadata>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Original query source from the search request
	 * (<code>SearchSourceBuilder</code> as JSON).
	 * <p>
	 * API name: {@code source}
	 */
	@Nullable
	public final SearchRequestBody source() {
		return this.source;
	}

	/**
	 * Target index expressions from the request (before index resolution).
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
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

		if (this.source != null) {
			generator.writeKey("source");
			this.source.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

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
	 * Builder for {@link SearchRequestCoordinatorMetadata}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SearchRequestCoordinatorMetadata> {
		@Nullable
		private SearchRequestBody source;

		@Nullable
		private List<String> indices;

		public Builder() {
		}
		private Builder(SearchRequestCoordinatorMetadata instance) {
			this.source = instance.source;
			this.indices = instance.indices;

		}
		/**
		 * Original query source from the search request
		 * (<code>SearchSourceBuilder</code> as JSON).
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable SearchRequestBody value) {
			this.source = value;
			return this;
		}

		/**
		 * Original query source from the search request
		 * (<code>SearchSourceBuilder</code> as JSON).
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(Function<SearchRequestBody.Builder, ObjectBuilder<SearchRequestBody>> fn) {
			return this.source(fn.apply(new SearchRequestBody.Builder()).build());
		}

		public final Builder source(@Nullable SearchRequest value) {
			SearchRequestBody body = SearchRequestBody.of(srb -> srb.aggregations(value.aggregations())
					.collapse(value.collapse()).explain(value.explain()).ext(value.ext()).from(value.from())
					.highlight(value.highlight()).trackTotalHits(value.trackTotalHits())
					.indicesBoost(value.indicesBoost()).docvalueFields(value.docvalueFields()).knn(value.knn())
					.rank(value.rank()).minScore(value.minScore()).postFilter(value.postFilter())
					.profile(value.profile()).query(value.query()).rescore(value.rescore()).retriever(value.retriever())
					.scriptFields(value.scriptFields()).searchAfter(value.searchAfter()).size(value.size())
					.slice(value.slice()).sort(value.sort()).source(value.source()).fields(value.fields())
					.suggest(value.suggest()).terminateAfter(value.terminateAfter()).timeout(value.timeout())
					.trackScores(value.trackScores()).version(value.version())
					.seqNoPrimaryTerm(value.seqNoPrimaryTerm()).storedFields(value.storedFields()).pit(value.pit())
					.runtimeMappings(value.runtimeMappings()).stats(value.stats()));
			this.source = body;
			return this;
		}

		/**
		 * Target index expressions from the request (before index resolution).
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Target index expressions from the request (before index resolution).
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchRequestCoordinatorMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchRequestCoordinatorMetadata build() {
			_checkSingleUse();

			return new SearchRequestCoordinatorMetadata(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchRequestCoordinatorMetadata}
	 */
	public static final JsonpDeserializer<SearchRequestCoordinatorMetadata> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchRequestCoordinatorMetadata::setupSearchRequestCoordinatorMetadataDeserializer);

	protected static void setupSearchRequestCoordinatorMetadataDeserializer(
			ObjectDeserializer<SearchRequestCoordinatorMetadata.Builder> op) {

		op.add(Builder::source, SearchRequestBody._DESERIALIZER, "source");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");

	}

}
