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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.QueryFeatureExtractor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.QueryFeatureExtractor">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryFeatureExtractor implements JsonpSerializable {
	@Nullable
	private final Float defaultScore;

	private final String featureName;

	private final Query query;

	// ---------------------------------------------------------------------------------------------

	private QueryFeatureExtractor(Builder builder) {

		this.defaultScore = builder.defaultScore;
		this.featureName = ApiTypeHelper.requireNonNullWithDefault(builder.featureName, this, "featureName",
				this.featureName());
		this.query = ApiTypeHelper.requireNonNullWithDefault(builder.query, this, "query", this.query());

	}

	public static QueryFeatureExtractor of(Function<Builder, ObjectBuilder<QueryFeatureExtractor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code default_score}
	 */
	@Nullable
	public final Float defaultScore() {
		return this.defaultScore;
	}

	/**
	 * Required - API name: {@code feature_name}
	 */
	public final String featureName() {
		return this.featureName;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final Query query() {
		return this.query;
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

		if (this.defaultScore != null) {
			generator.writeKey("default_score");
			generator.write(this.defaultScore);

		}
		generator.writeKey("feature_name");
		generator.write(this.featureName);

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryFeatureExtractor}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<QueryFeatureExtractor> {
		@Nullable
		private Float defaultScore;

		private String featureName;

		private Query query;

		/**
		 * API name: {@code default_score}
		 */
		public final Builder defaultScore(@Nullable Float value) {
			this.defaultScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code feature_name}
		 */
		public final Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(QueryVariant value) {
			this.query = value._toQuery();
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryFeatureExtractor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryFeatureExtractor build() {
			_checkSingleUse();

			return new QueryFeatureExtractor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryFeatureExtractor}
	 */
	public static final JsonpDeserializer<QueryFeatureExtractor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryFeatureExtractor::setupQueryFeatureExtractorDeserializer);

	protected static void setupQueryFeatureExtractorDeserializer(ObjectDeserializer<QueryFeatureExtractor.Builder> op) {

		op.add(Builder::defaultScore, JsonpDeserializer.floatDeserializer(), "default_score");
		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::query, Query._DESERIALIZER, "query");

	}

}
