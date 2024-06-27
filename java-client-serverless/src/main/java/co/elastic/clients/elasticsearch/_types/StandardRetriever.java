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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.search.FieldCollapse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.Integer;
import java.util.ArrayList;
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

// typedef: _types.StandardRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.StandardRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class StandardRetriever extends RetrieverBase implements RetrieverVariant {
	@Nullable
	private final Query query;

	private final List<FieldValue> searchAfter;

	@Nullable
	private final Integer terminateAfter;

	private final List<SortOptions> sort;

	@Nullable
	private final Float minScore;

	@Nullable
	private final FieldCollapse collapse;

	// ---------------------------------------------------------------------------------------------

	private StandardRetriever(Builder builder) {
		super(builder);

		this.query = builder.query;
		this.searchAfter = ApiTypeHelper.unmodifiable(builder.searchAfter);
		this.terminateAfter = builder.terminateAfter;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.minScore = builder.minScore;
		this.collapse = builder.collapse;

	}

	public static StandardRetriever of(Function<Builder, ObjectBuilder<StandardRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.Standard;
	}

	/**
	 * Defines a query to retrieve a set of top documents.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Defines a search after object parameter used for pagination.
	 * <p>
	 * API name: {@code search_after}
	 */
	public final List<FieldValue> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * Maximum number of documents to collect for each shard.
	 * <p>
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public final Integer terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * A sort object that that specifies the order of matching documents.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * Minimum _score for matching documents. Documents with a lower _score are not
	 * included in the top documents.
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public final Float minScore() {
		return this.minScore;
	}

	/**
	 * Collapses the top documents by a specified key into a single top document per
	 * key.
	 * <p>
	 * API name: {@code collapse}
	 */
	@Nullable
	public final FieldCollapse collapse() {
		return this.collapse;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.searchAfter)) {
			generator.writeKey("search_after");
			generator.writeStartArray();
			for (FieldValue item0 : this.searchAfter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.terminateAfter != null) {
			generator.writeKey("terminate_after");
			generator.write(this.terminateAfter);

		}
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.minScore != null) {
			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		if (this.collapse != null) {
			generator.writeKey("collapse");
			this.collapse.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StandardRetriever}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StandardRetriever> {
		@Nullable
		private Query query;

		@Nullable
		private List<FieldValue> searchAfter;

		@Nullable
		private Integer terminateAfter;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private Float minScore;

		@Nullable
		private FieldCollapse collapse;

		/**
		 * Defines a query to retrieve a set of top documents.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Defines a query to retrieve a set of top documents.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Defines a search after object parameter used for pagination.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(List<FieldValue> list) {
			this.searchAfter = _listAddAll(this.searchAfter, list);
			return this;
		}

		/**
		 * Defines a search after object parameter used for pagination.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds one or more values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(FieldValue value, FieldValue... values) {
			this.searchAfter = _listAdd(this.searchAfter, value, values);
			return this;
		}

		/**
		 * Defines a search after object parameter used for pagination.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all passed values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(String value, String... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (String v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.searchAfter = _listAddAll(this.searchAfter, fieldValues);
			return this;
		}

		/**
		 * Defines a search after object parameter used for pagination.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all passed values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(long value, long... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (long v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.searchAfter = _listAddAll(this.searchAfter, fieldValues);
			return this;
		}

		/**
		 * Defines a search after object parameter used for pagination.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all passed values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(double value, double... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (double v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.searchAfter = _listAddAll(this.searchAfter, fieldValues);
			return this;
		}

		/**
		 * Defines a search after object parameter used for pagination.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all passed values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(boolean value, boolean... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (boolean v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.searchAfter = _listAddAll(this.searchAfter, fieldValues);
			return this;
		}

		/**
		 * Defines a search after object parameter used for pagination.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds a value to <code>searchAfter</code> using a builder lambda.
		 */
		public final Builder searchAfter(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return searchAfter(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Maximum number of documents to collect for each shard.
		 * <p>
		 * API name: {@code terminate_after}
		 */
		public final Builder terminateAfter(@Nullable Integer value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * A sort object that that specifies the order of matching documents.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<SortOptions> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * A sort object that that specifies the order of matching documents.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(SortOptions value, SortOptions... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * A sort object that that specifies the order of matching documents.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		/**
		 * Minimum _score for matching documents. Documents with a lower _score are not
		 * included in the top documents.
		 * <p>
		 * API name: {@code min_score}
		 */
		public final Builder minScore(@Nullable Float value) {
			this.minScore = value;
			return this;
		}

		/**
		 * Collapses the top documents by a specified key into a single top document per
		 * key.
		 * <p>
		 * API name: {@code collapse}
		 */
		public final Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * Collapses the top documents by a specified key into a single top document per
		 * key.
		 * <p>
		 * API name: {@code collapse}
		 */
		public final Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StandardRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StandardRetriever build() {
			_checkSingleUse();

			return new StandardRetriever(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StandardRetriever}
	 */
	public static final JsonpDeserializer<StandardRetriever> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StandardRetriever::setupStandardRetrieverDeserializer);

	protected static void setupStandardRetrieverDeserializer(ObjectDeserializer<StandardRetriever.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "search_after");
		op.add(Builder::terminateAfter, JsonpDeserializer.integerDeserializer(), "terminate_after");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");
		op.add(Builder::minScore, JsonpDeserializer.floatDeserializer(), "min_score");
		op.add(Builder::collapse, FieldCollapse._DESERIALIZER, "collapse");

	}

}
