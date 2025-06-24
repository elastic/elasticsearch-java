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
import java.lang.Float;
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

// typedef: _types.RetrieverBase

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RetrieverBase">API
 *      specification</a>
 */

public abstract class RetrieverBase implements JsonpSerializable {
	private final List<Query> filter;

	@Nullable
	private final Float minScore;

	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected RetrieverBase(AbstractBuilder<?> builder) {

		this.filter = ApiTypeHelper.unmodifiable(builder.filter);
		this.minScore = builder.minScore;
		this.name = builder.name;

	}

	/**
	 * Query to filter the documents that can match.
	 * <p>
	 * API name: {@code filter}
	 */
	public final List<Query> filter() {
		return this.filter;
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
	 * Retriever name.
	 * <p>
	 * API name: {@code _name}
	 */
	@Nullable
	public final String name() {
		return this.name;
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

		if (ApiTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartArray();
			for (Query item0 : this.filter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.minScore != null) {
			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		if (this.name != null) {
			generator.writeKey("_name");
			generator.write(this.name);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private List<Query> filter;

		@Nullable
		private Float minScore;

		@Nullable
		private String name;

		/**
		 * Query to filter the documents that can match.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filter</code>.
		 */
		public final BuilderT filter(List<Query> list) {
			this.filter = _listAddAll(this.filter, list);
			return self();
		}

		/**
		 * Query to filter the documents that can match.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds one or more values to <code>filter</code>.
		 */
		public final BuilderT filter(Query value, Query... values) {
			this.filter = _listAdd(this.filter, value, values);
			return self();
		}

		/**
		 * Query to filter the documents that can match.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds one or more values to <code>filter</code>.
		 */
		public final BuilderT filter(QueryVariant value, QueryVariant... values) {
			this.filter = _listAdd(this.filter, value._toQuery());
			for (QueryVariant v : values) {
				_listAdd(this.filter, v._toQuery());
			}
			return self();
		}

		/**
		 * Query to filter the documents that can match.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds a value to <code>filter</code> using a builder lambda.
		 */
		public final BuilderT filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Minimum _score for matching documents. Documents with a lower _score are not
		 * included in the top documents.
		 * <p>
		 * API name: {@code min_score}
		 */
		public final BuilderT minScore(@Nullable Float value) {
			this.minScore = value;
			return self();
		}

		/**
		 * Retriever name.
		 * <p>
		 * API name: {@code _name}
		 */
		public final BuilderT name(@Nullable String value) {
			this.name = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRetrieverBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::filter, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "filter");
		op.add(AbstractBuilder::minScore, JsonpDeserializer.floatDeserializer(), "min_score");
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "_name");

	}

}
